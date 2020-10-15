package com.wbr.datasourcedemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.wbr.datasourcedemo.datasourcePropties.DatasourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 类描述
 *
 * @author WangBoran
 * @since 2020/10/15 9:50
 */
@Configuration
public class DatasourceConfiguration {

	@Bean
	public DataSource configDatasource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(DatasourceProperties.JDBC_URL);
		return dataSource;
	}

	@Bean
	public JdbcTemplate configJdbcTemplate(){
		return new JdbcTemplate(configDatasource());
	}

}