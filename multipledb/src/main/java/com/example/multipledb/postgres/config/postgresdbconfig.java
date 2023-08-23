package com.example.multipledb.postgres.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		
		entityManagerFactoryRef = "secondentityManagerFactoryBean",
		basePackages = {"com.example.multipledb.postgres.repository"},
		transactionManagerRef = "secondtransactionmanager"
		
		
		
)

public class postgresdbconfig {
	
	@Autowired
	private Environment env;
	
	@Bean(name = "seconddatasource")
	@Primary
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("dk.datasource.url"));
		dataSource.setDriverClassName(env.getProperty("dk.datasource.driver-class-name"));
		dataSource.setUsername(env.getProperty("dk.datasource.username"));
		dataSource.setPassword(env.getProperty("dk.datasource.password"));
		return dataSource;
	}
	
	
	@Bean(name="secondentityManagerFactoryBean")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean()
	{
		LocalContainerEntityManagerFactoryBean lBean= new LocalContainerEntityManagerFactoryBean();
		lBean.setDataSource(dataSource());
		
		JpaVendorAdapter adapter= new HibernateJpaVendorAdapter();
		lBean.setJpaVendorAdapter(adapter);
		
		Map<String, String> props= new HashMap<>();
		props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");
		
		lBean.setJpaPropertyMap(props);
		lBean.setPackagesToScan("com.example.multipledb.postgres.entities");
		return lBean;
	}
	
	
	@Bean(name="secondtransactionmanager")
	@Primary
	public PlatformTransactionManager transactionManager()
	{
		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
		
	  return manager;
	}
	
	

}
