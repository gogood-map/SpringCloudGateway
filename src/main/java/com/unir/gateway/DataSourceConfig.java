package com.unir.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://viaduct.proxy.rlwy.net:44905/GoGood");
        dataSource.setUsername("root");
        dataSource.setPassword("dEED163g3bDBfeGeHaHD1EGGha6bC46g");
        return dataSource;
    }

    @Bean
    public JdbcTemplate myJdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
