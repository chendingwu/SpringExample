package cn.cdw.mapper.impl;

import cn.cdw.mapper.UserDao;

/**
 * @author DW-CHEN
 */
public class UserDaoImpl implements UserDao {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void testUserDao() {
        System.out.println("dao层执行了......"+username + "  "+password);
    }
}
