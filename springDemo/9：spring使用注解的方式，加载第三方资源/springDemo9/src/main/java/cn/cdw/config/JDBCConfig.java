package cn.cdw.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author DW-CHEN
 *  第三方资源的加载
 */
@Component
public class JDBCConfig {

    @Bean("dataSource")
    public DataSource getDruidDataSource() throws IOException {
        InputStream resourceAsStream = JDBCConfig.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName((String) properties.get("jdbc.driver"));
        druidDataSource.setUrl((String) properties.get("jdbc.url"));
        druidDataSource.setUsername((String) properties.get("jdbc.username"));
        druidDataSource.setPassword((String) properties.get("jdbc.password"));

        return  druidDataSource;
    }
}
