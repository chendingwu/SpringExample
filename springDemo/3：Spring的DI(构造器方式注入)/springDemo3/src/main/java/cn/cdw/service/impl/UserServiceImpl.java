package cn.cdw.service.impl;


import cn.cdw.mapper.UserDao;
import cn.cdw.service.UserService;

/**
 * @author DW-CHEN
 * 通过构造器方式注入
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private Integer i1;
    private String str;

    public UserServiceImpl(UserDao userDao, Integer i1, String str) {//提供构造方法，通过构造器方式注入
        this.userDao=userDao;
        this.i1=i1;
        this.str=str;
    }

    public void serviceTest() {
        System.out.println("Service层执行了...."+"非引用类型的数据："+i1 + " "+str);
        userDao.daoTest();//调用dao层的方法
    }
}
