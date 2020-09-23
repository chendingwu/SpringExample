package cn.cdw.dao.impl;

import cn.cdw.dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * @author DW-CHEN
 */
@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void testUserDao() {
        System.out.println("dao层执行了....");
    }
}
