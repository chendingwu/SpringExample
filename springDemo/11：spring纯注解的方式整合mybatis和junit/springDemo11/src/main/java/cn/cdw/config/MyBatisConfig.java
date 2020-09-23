package cn.cdw.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author DW-CHEN
 * 配置MyBatis
 */
public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean getDataSource(@Autowired DataSource dataSource) {  //配置获取数据源
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);  //数据源
        //sqlSessionFactoryBean.setTypeAliasesPackage("cn.cdw.pojo");  //因为使用的是纯注解的方式，所以不需要别名
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer scannerConfigurer() { //配置mybatis映射
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("cn.cdw.mapper");

        return mapperScannerConfigurer;
    }
}
