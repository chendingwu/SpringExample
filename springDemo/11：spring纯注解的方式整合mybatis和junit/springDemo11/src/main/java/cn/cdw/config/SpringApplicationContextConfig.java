package cn.cdw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author DW-CHEN
 * Spring核心配置
 */
@Configuration  //把当前类作为spring核心配置类
@ComponentScan("cn.cdw")  //配置注解驱动包扫描
@PropertySource("classpath:jdbc.properties")  //加载资源配置文件
@Import({JDBCConfig.class,MyBatisConfig.class})  //配置导入第三方资源
public class SpringApplicationContextConfig {
}
