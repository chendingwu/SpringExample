package cn.cdw;

import cn.cdw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 * 测试
 */
public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //UserService userService = (UserService) applicationContext.getBean("userService");
       // UserService userService = (UserService) applicationContext.getBean("userService1");
        UserService userService = (UserService) applicationContext.getBean("userService2");
        userService.testUserService();
    }
}
