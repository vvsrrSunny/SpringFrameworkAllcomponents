package com.ds.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = { "com.ds.beans", "com.ds.dao" })
public class ConnectionConfig {

	@Bean
	DataSource dataSource() {
		DataSource ds = new DriverManagerDataSource("jdbc:mysql://localhost:3306/bookDB", "root", "root");

		return ds;

	}

}
