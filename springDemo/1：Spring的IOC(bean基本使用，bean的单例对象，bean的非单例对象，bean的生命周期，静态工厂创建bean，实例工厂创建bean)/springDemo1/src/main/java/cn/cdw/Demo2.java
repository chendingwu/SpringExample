package cn.cdw;

import cn.cdw.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 * 通过name属性值获取Bean对象
 */
public class Demo2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User) applicationContext.getBean("user1");
        User user2 = (User) applicationContext.getBean("user2");

        user1.play();
        user2.play();
    }
}
