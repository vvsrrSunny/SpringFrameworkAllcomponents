package com.sh.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.omg.CORBA.Environment;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sh.model.User;

@Configuration
@EnableCaching
@EnableTransactionManagement
@ComponentScan("com.sh.*")
public class AppConfig {

	@Bean
	public CacheManager cacheManager() {
		SimpleCacheManager scm = new SimpleCacheManager();
		return new ConcurrentMapCacheManager("usercache");

	}

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}

	@Bean("sessionFactory")
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDataSource());

		Properties props = new Properties();
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");

		factoryBean.setHibernateProperties(props);
		factoryBean.setPackagesToScan("com.sh.model");
		return factoryBean;
	}

	@Bean
	public PlatformTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		// LocalSessionFactoryBean sessionFactory= this.getSessionFactory();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
	}
}