package cn.cdw.service.impl;

import cn.cdw.dao.UserDao;
import cn.cdw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author DW-CHEN
 * 测试使用注解
 */
@Component("userService")
@Scope("prototype")
@PropertySource(value = {"classpath:jdbc.properties","classpath:test.properties"},ignoreResourceNotFound = true) //可以配置加载多个文件，如果文件找不到会报异常，所以设置ignoreResourceNotFound
public class UserServiceImpl implements UserService {
    @Value("小明")
    private String name;

    @Value("23")  //注入非引用数据类型数据
    private Integer age;

    @Autowired   //注入非引用类型
    private UserDao userDao;

    @Value("${jdbc.driver}")
    private String jdbcDriverName;
    @Value("${jdbc.url}")   //通过SpEL表达式获取加载的配置文件数据
    private String jdbcUrl;

    public void testUserService() {
        System.out.println("service执行了....." + name + age+ "  "+jdbcDriverName + " "+jdbcUrl);
        userDao.testUserDao();
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁....");
    }
}
