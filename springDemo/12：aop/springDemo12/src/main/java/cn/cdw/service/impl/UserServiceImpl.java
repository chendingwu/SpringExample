package cn.cdw.service.impl;

import cn.cdw.service.UserService;

/**
 * @author DW-CHEN
 * 切入点
 */
public class UserServiceImpl implements UserService {
    public void testUserService() {
       // System.out.println("我是共性功能....");  //把切入点的共性功能抽取到通知
        System.out.println("service执行了....");
        //int i = 1/0;
    }

    public void hello(int i1, int i2) {
        System.out.println("切入点方法参数： "+i1 + " " + i2); //获取切入点的参数值
    }

    public Object getResult() { //获取切入点的返回值
        return 666;
    }

    public void testException() {
        System.out.println("测试异常aop通知获取异常数据的方法");
        int i = 1/0;
    }
}
