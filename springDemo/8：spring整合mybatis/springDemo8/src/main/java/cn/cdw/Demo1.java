package cn.cdw;

import cn.cdw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 * 测试spring整合mybatis
 */
public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");


        System.out.println(userService.selectAll());//查询全部
        System.out.println(userService.selectById(3));//根据id查询
       // userService.add(new User(null,"夏丽丽",15)); //添加
       // userService.update(new User(15,"修改夏丽丽",12));//修改
       // userService.deleteById(11); //删除

    }
}
