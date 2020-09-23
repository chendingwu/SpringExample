package cn.cdw;

import cn.cdw.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 * 通过实例工厂创建Bean对象
 */
public class Demo8 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("instanceFactoryInstanceUser");
        user.play();
    }
}
