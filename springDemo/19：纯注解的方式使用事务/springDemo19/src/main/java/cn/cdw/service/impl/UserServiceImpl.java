package cn.cdw.service.impl;

import cn.cdw.mapper.UserMapper;
import cn.cdw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DW-CHEN
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper; //注入dao

    public void transfer(String outName, String inName, Double money) {  //转账
        userMapper.outMoney(outName, money); //发钱
        //int i=1/0;
        userMapper.inMoney(inName, money); //收钱
        System.out.println("转账完成....");
    }
}
