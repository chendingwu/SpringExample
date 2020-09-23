package cn.cdw;

import cn.cdw.config.SpringApplicationContextConfig;
import cn.cdw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author DW-CHEN
 * 测试spring使用纯注解的方式使用aop
 */
public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplicationContextConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.testUserService();
    }
}
