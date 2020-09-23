package cn.cdw.service;

import cn.cdw.pojo.User;

import java.util.List;

/**
 * @author DW-CHEN
 */
public interface UserService {
    public List<User> selectAll();

    public User selectById(Integer id);

    public void add(User user);

    public void update(User user);

    public void deleteById(Integer id);
}
