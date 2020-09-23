package cn.cdw.service.impl;

import cn.cdw.mapper.UserMapper;
import cn.cdw.service.UserService;

/**
 * @author DW-CHEN
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper; //注入dao

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void transfer(String outName, String inName, Double money) {  //转账
        userMapper.outMoney(outName, money); //发钱
        int i=1/0;
        userMapper.inMoney(inName, money); //收钱
        System.out.println("转账完成....");
    }
}
