package com.jt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.jt.*")
@PropertySource("classpath:database.properties")
public class AppConfig {

	@Autowired
	Environment env;
	private String driver = "driver";
	private String url = "url";
	private String password = "dbpassword";
	private String user = "dbuser";

	@Bean(name="dataSource")
	DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty(driver));
		ds.setUrl(env.getProperty(url));
		ds.setPassword(env.getProperty(password));
		ds.setUsername(env.getProperty(user));

		return ds;
	}
	@Bean(name="jdbcTemplate")
	JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}
	
	@Bean(name="namedParameterJdbcTemplate")
	NamedParameterJdbcTemplate namedParameterJdbcTemplate()
	{
		//JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource());
		NamedParameterJdbcTemplate namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource());
		return namedParameterJdbcTemplate;
	}
}
