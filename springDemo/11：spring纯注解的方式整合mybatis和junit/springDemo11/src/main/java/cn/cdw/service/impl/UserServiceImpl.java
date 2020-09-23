package cn.cdw.service.impl;

import cn.cdw.mapper.UserMapper;
import cn.cdw.pojo.User;
import cn.cdw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DW-CHEN
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    public void insert(User user) {
        userMapper.insert(user);
        System.out.println("添加成功...");
    }

    public void update(User user) {
        userMapper.update(user);
        System.out.println("修改成功....");
    }

    public void delete(Integer id) {
        userMapper.delete(id);
        System.out.println("删除成功....");
    }
}
