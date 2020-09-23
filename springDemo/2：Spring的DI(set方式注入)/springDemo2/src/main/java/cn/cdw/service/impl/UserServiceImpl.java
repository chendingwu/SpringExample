package cn.cdw.service.impl;

import cn.cdw.mapper.UserDao;
import cn.cdw.service.UserService;

/**
 * @author DW-CHEN
 * 通过set方式注入
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao; //在service注入dao层，提供dao层的set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private Integer i1;
    private String str;

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void serviceTest() {
        System.out.println("Service层执行了...."+"非引用类型的数据："+i1 + " "+str);
        userDao.daoTest();//调用dao层的方法
    }
}
