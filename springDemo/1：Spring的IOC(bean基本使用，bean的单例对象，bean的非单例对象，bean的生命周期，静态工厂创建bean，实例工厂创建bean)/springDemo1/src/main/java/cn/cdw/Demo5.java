package cn.cdw;

import cn.cdw.service.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 *  singleton bean的生命周期
 */
public class Demo5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User) classPathXmlApplicationContext.getBean("user3");
        User user2 = (User) classPathXmlApplicationContext.getBean("user3");
        User user3 = (User) classPathXmlApplicationContext.getBean("user3");

        user1.play();
        user2.play();
        user3.play();

        classPathXmlApplicationContext.close();
    }
}
