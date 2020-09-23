package cn.cdw.service.impl;

import cn.cdw.mapper.UserMapper;
import cn.cdw.pojo.User;
import cn.cdw.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserMapper userDao;//注入dao

    public void setUserDao(UserMapper userDao) {
        this.userDao = userDao;
    }

    public List<User> selectAll() {
        return userDao.selectAll();
    }

    public User selectById(Integer id) {
        return userDao.selectById(id);
    }

    public void add(User user) {
        userDao.add(user);
        System.out.println("添加成功....");
    }

    public void update(User user) {
        userDao.update(user);
        System.out.println("修改成功....");
    }

    public void deleteById(Integer id) {
        userDao.deleteById(id);
        System.out.println("删除成功....");
    }
}
