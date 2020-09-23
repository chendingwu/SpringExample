package cn.cdw;

import cn.cdw.config.SpringApplicationContextConfig;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author DW-CHEN
 * 测试第三方资源加载到spring核心配置文件中
 */
public class Demo2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplicationContextConfig.class);
        DruidDataSource dataSource = (DruidDataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }
}
