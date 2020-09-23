package cn.cdw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
 * @author DW-CHEN
 * spring 核心配置类
 */
@Configuration
@ComponentScan("cn.cdw")
@EnableAspectJAutoProxy  //启用aop注解驱动
public class SpringApplicationContextConfig {
}
