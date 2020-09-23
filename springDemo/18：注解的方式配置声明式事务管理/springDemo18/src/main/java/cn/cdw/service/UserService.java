package cn.cdw.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author DW-CHEN
 * service
 */
public interface UserService {
    @Transactional  //添加事务管理
    public void transfer(String outName, String inName, Double money);
}
