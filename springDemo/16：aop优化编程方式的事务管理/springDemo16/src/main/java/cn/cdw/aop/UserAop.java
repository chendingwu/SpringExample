package cn.cdw.aop;

import com.alibaba.druid.pool.DruidDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author DW-CHEN
 * AOP
 */
public class UserAop {
    private DruidDataSource druidDataSource; //开启事务需要数据源，所以注入

    public void setDruidDataSource(DruidDataSource druidDataSource) {
        this.druidDataSource = druidDataSource;
    }

    public Object transactionAop(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        PlatformTransactionManager transactionManager = new DataSourceTransactionManager(druidDataSource);//开启事务
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();//事务定义
        TransactionStatus transactionStatus= transactionManager.getTransaction(transactionDefinition);//事务状态

        Object proceed = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs()); //调用连接点的方法

        transactionManager.commit(transactionStatus);//提交事务

        return proceed;
    }
}
