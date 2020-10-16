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
		dataSource.setUsername(DatasourceProperties.USER_NAME);
		dataSource.setPassword(DatasourceProperties.PASSWORD);
		dataSource.setDriverClassName(DatasourceProperties.DRIVER_CLASS_NAME);

		dataSource.setInitialSize(DatasourceProperties.INITIAL_SIZE);
		dataSource.setMinIdle(DatasourceProperties.MIN_IDLE);
		dataSource.setMaxActive(DatasourceProperties.MAX_ACTIVE);
		dataSource.setMaxWait(DatasourceProperties.MAX_WAIT);


		dataSource.setRemoveAbandoned(DatasourceProperties.REMOVE_ABANDONED);
		dataSource.setMinEvictableIdleTimeMillis(5*60*1000);
		dataSource.setMaxEvictableIdleTimeMillis(8*60*60*1000);
		dataSource.setTestWhileIdle(DatasourceProperties.TEST_WHILE_IDLE);
		dataSource.setTimeBetweenEvictionRunsMillis(DatasourceProperties.TIME_BETWEEN_EVICTION_RUNS);
		dataSource.setValidationQuery(DatasourceProperties.VALIDATION_QUERY);

		dataSource.setTestOnBorrow(DatasourceProperties.TEST_ON_BORROW);
		return dataSource;
	}

	@Bean
	public JdbcTemplate configJdbcTemplate(){
		return new JdbcTemplate(configDatasource());
	}

}