package cn.cdw.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author DW-CHEN
 * 通知，就是抽取的共性功能
 */
public class UserAdvice {
    public void adviceMethod() {
        System.out.println("我是共性功能....");
    }

    public void before() {  //程序执行前通知
        System.out.println("before......");
    }

    public void after() {
        System.out.println("after......");  //程序执行后通知
    }

    public void afterReturning() {  //程序返回后没有异常后通知
        System.out.println("afterReturning.....");
    }

    public void afterThrowing() {  //出现异常后通知
        System.out.println("afterThrowing.....");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {  //环绕通知
        System.out.println("aroundBefore......");
        proceedingJoinPoint.proceed();  //调用切入点方法
        System.out.println("aroundAfter....");

    }


    public void getParam1(JoinPoint joinPoint) {  // aop获取切入点方法参数方法一
        System.out.println("aop获取切入点方法的参数："+joinPoint.getArgs()[0] + "  " + joinPoint.getArgs()[1]);
    }


    public void getParam2(int a,int b) {  // aop获取切入点方法参数方法二
        System.out.println("aop获取切入点方法的参数："+ a + "  " + b);
    }

    public void getResultParam(Object ret) {  //aop的after-returning通知类型获取切入点返回值参数数据方式
        System.out.println("aop的after-returning通知类型获取切入点返回值参数数据方式："+ret);
    }

    public Object getResultParam1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable { //aop的around通知类型获取切入点返回值参数数据方式

        Object ret = proceedingJoinPoint.proceed();
        String str = "aop的around通知类型获取切入点返回值参数数据方式: ";
        System.out.println(str + ret);
        return str + ret;
    }

    public void getExceptionMessage(Throwable throwable) { // afterThrowing通知类型获取aop获取异常数据
        System.out.println("afterThrowing通知类型获取aop获取异常数据：" + throwable.getMessage());
    }


    public void getExceptionMessage1(ProceedingJoinPoint proceedingJoinPoint) { // around通知类型获取aop获取异常数据
        System.out.println("before.....");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
           // throwable.printStackTrace();
            System.out.println("around通知类型获取aop获取异常数据：" + throwable.getMessage());
        }
        System.out.println("after.....");

    }
}
