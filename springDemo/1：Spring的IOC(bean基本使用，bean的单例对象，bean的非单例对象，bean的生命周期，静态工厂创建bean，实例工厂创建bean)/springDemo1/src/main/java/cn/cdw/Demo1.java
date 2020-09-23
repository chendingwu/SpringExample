package cn.cdw;

import cn.cdw.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 * 测试从spring容器中取出我刚才放进去管理的对象来使用
 */
public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");//获取spring容器
        User user = (User) applicationContext.getBean("user");//让spring容器给我想要的对象
        user.play();
    }
}
