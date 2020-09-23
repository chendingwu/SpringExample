package cn.cdw;

import cn.cdw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 * 测试 aop
 */
public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.testUserService();
       // userService.hello(100, 3); //aop获取切入点的参数值

        // userService.getResult();//aop获取切入点的返回值数据

        userService.testException(); //aop获取异常数据
    }
}
