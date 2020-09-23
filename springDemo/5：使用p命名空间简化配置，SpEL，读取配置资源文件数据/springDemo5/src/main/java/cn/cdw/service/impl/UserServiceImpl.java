package cn.cdw.service.impl;

import cn.cdw.mapper.UserDao;
import cn.cdw.service.UserService;

/**
 * @author DW-CHEN
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void testUserService() {
        System.out.println("UserService执行了....");
        userDao.testUserDao();
    }
}
