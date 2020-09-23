package cn.cdw;

import cn.cdw.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 * singleton 单例对象它是在创建容器的时候创建的，就是先加载好，用的时候就给我
 */
public class Demo3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User userSingleton1 = (User) applicationContext.getBean("userSingleton");
        User userSingleton2 = (User) applicationContext.getBean("userSingleton");
        User userSingleton3 = (User) applicationContext.getBean("userSingleton");

        System.out.println(userSingleton1);
        System.out.println(userSingleton2);
        System.out.println(userSingleton3);//发现都是同一个对象地址

        System.out.println(userSingleton1.equals(userSingleton1));//判断是否是同一个对象
    }
}
