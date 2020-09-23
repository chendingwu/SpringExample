package cn.cdw;

import cn.cdw.config.SpringApplicationContextConfig;
import cn.cdw.pojo.User;
import cn.cdw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author DW-CHEN
 * 测试通过spring通过纯注解的方式整合mybatis
 */
public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplicationContextConfig.class);

        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService.selectAll());

        System.out.println(userService.selectById(3));

        //userService.insert(new User(null, "小莉", 12));

       // userService.update(new User(12, "小希小", 12));

       // userService.delete(15);
    }
}
