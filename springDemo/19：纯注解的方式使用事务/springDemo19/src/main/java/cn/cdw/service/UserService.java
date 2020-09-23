package cn.cdw.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author DW-CHEN
 * service
 */
public interface UserService {
    @Transactional
    public void transfer(String outName, String inName, Double money);
}
