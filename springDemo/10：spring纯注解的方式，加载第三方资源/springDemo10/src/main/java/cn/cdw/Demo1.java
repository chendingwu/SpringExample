package cn.cdw;

import cn.cdw.config.SpringApplicationContextConfig;
import cn.cdw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author DW-CHEN
 * 测试使用纯注解的方式配置Spring
 */
public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplicationContextConfig.class);//这里读取的就是刚才我配置的spring核心类

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.testUserService();
    }
}
