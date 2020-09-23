package cn.cdw.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author DW-CHEN
 * 通知类
 */
@Component("userAdvice")  //添加到spring管理
@Aspect  //声明为切面类
public class UserAdvice {

    @Pointcut("execution(* *..*(..))")  //切入点
    public void pt() {

    }


    @Before("pt()")
    public void before() {
        System.out.println("before....");
    }

    @After("pt()")
    public void after() {
        System.out.println("after.....");
    }

    @AfterReturning("pt()")
    public void afterReturning() {
        System.out.println("afterReturning....");
    }

    @AfterThrowing(value = "pt()")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }


    @Around("pt()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundBefore....");
        proceedingJoinPoint.proceed();
        System.out.println("aroundAfter....");

    }

}
