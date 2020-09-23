package cn.cdw;

import cn.cdw.config.SpringApplicationConfig;
import cn.cdw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author DW-CHEN
 * 测试使用纯注解的方式使用事务
 */
public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplicationConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.transfer("小明", "小小", 100D);
    }
}
