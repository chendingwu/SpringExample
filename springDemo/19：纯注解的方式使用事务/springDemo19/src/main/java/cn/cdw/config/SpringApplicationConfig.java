package cn.cdw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author DW-CHEN
 * spring核心配置文件
 */
@Configuration
@ComponentScan("cn.cdw")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MyBatisConfig.class,TransactionManagementConfig.class})  //配置第三方资源
@EnableTransactionManagement  //开启事务注解驱动
public class SpringApplicationConfig {
}
