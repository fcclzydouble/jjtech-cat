package org.jjtech.datasources;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2018/3/31.
 */
//@Configuration
public class DataSourceConfig {
//    @Bean("dataSource")
//    @ConfigurationProperties("spring.datasource.druid.first")
//    public DataSource dataSource(){
//        return DruidDataSourceBuilder.create().build();
//    }
}
