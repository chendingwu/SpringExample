package cn.cdw;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DW-CHEN
 * 测试使用阿里第三方的Druid数据库连接池
 */
public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource druidDatasource = (DruidDataSource) applicationContext.getBean("druidDatasource");

        System.out.println(druidDatasource);
    }
}
