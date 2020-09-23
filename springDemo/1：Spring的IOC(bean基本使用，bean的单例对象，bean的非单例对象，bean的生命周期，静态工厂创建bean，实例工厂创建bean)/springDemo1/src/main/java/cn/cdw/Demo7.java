package cn.cdw;

import cn.cdw.factory.StaticFactory;
import cn.cdw.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 * 通过静态工厂获取Bean对象
 */
public class Demo7 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user= (User) applicationContext.getBean("staticFactory");
        user.play();
    }
}
