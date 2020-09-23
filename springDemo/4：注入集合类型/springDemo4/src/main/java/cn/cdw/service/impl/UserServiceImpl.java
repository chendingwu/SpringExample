package cn.cdw.service.impl;

import cn.cdw.mapper.UserDao;
import cn.cdw.service.UserService;

/**
 * @author DW-CHEN
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;//注入dao

    public UserServiceImpl() { //无参构造
    }

    public void setUserDao(UserDao userDao) {//给注入的dao一个set方法
        this.userDao = userDao;
    }

    public void testUserService() {
        userDao.testUserDao();//调用dao的方法
    }
}
