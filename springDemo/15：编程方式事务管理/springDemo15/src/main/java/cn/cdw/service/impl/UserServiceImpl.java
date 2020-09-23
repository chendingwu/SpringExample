package cn.cdw.service.impl;

import cn.cdw.mapper.UserMapper;
import cn.cdw.service.UserService;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author DW-CHEN
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper; //注入dao
    private DruidDataSource druidDataSource; //注入数据源，因为开启事务需要设置数据源

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void setDruidDataSource(DruidDataSource druidDataSource) {
        this.druidDataSource = druidDataSource;
    }

    public void transfer(String outName, String inName, Double money) {  //转账
        PlatformTransactionManager platformTransactionManager = new DataSourceTransactionManager(druidDataSource); //开启事务
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();//事务定义
        TransactionStatus transactionStatus = platformTransactionManager.getTransaction(transactionDefinition); //事务状态

        userMapper.outMoney(outName, money); //发钱
        //int i=1/0;  //测试事务
        userMapper.inMoney(inName, money); //收钱
        System.out.println("转账完成....");

        platformTransactionManager.commit(transactionStatus);//提交事务
    }
}
