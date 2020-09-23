package cn.cdw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author DW-CHEN
 * 定义一个类使用注解的方式配置这个类为spring的核心配置文件
 */
@Configuration
@ComponentScan("cn.cdw") //配置包扫描
@Import({JDBCConfig.class})  //导入第三方bean的配置到spring核心配置
public class SpringApplicationContextConfig {
}
