package cn.cdw.service.test;

import cn.cdw.config.SpringApplicationContextConfig;
import cn.cdw.pojo.User;
import cn.cdw.service.UserService;
import com.sun.glass.ui.Accessible;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author DW-CHEN
 * spring注解方式整合第三方技术Junit
 */
@RunWith(SpringJUnit4ClassRunner.class)  //设定spring专用的类加载器
@ContextConfiguration(classes = SpringApplicationContextConfig.class)  //设定加载的spring上下文对应的配置，就是spring的核心配置类
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void TestSelectAll() {
        List<User> users = userService.selectAll();
        System.out.println(users);
    }

    @Test
    public void TestSelectById() {
        User user = userService.selectById(3);
        System.out.println(user);
        Assert.assertEquals("小李", user.getName());
    }
}
