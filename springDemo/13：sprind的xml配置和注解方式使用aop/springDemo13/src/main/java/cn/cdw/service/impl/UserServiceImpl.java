package cn.cdw.service.impl;

import cn.cdw.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author DW-CHEN
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    public void testUserService() {
        System.out.println("service执行了...");
       // int iu = 1/0;
    }
}
