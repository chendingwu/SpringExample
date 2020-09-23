package cn.cdw;

import cn.cdw.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 * Prototype  非单例的对象是在获取对象的时候创建对象的，就是用的时候在去创建
 */
public class Demo4 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User userPrototype1 = (User) applicationContext.getBean("userPrototype");
        User userPrototype2 = (User) applicationContext.getBean("userPrototype");
        User userPrototype3 = (User) applicationContext.getBean("userPrototype");

        System.out.println(userPrototype1);
        System.out.println(userPrototype2);
        System.out.println(userPrototype3);//发现对象的地址都不同

        System.out.println(userPrototype1.equals(userPrototype2));//发现不是同一个对象
    }
}
