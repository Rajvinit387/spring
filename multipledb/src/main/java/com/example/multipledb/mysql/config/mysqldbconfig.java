package com.example.multipledb.mysql.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

import com.example.multipledb.mysql.entities.user;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		
		entityManagerFactoryRef = "entityManagerFactoryBean",
		basePackages = {"com.example.multipledb.mysql.repository"},
		transactionManagerRef = "transactionmanager"
		
		
		
)
public class mysqldbconfig {
	
	
	@Autowired
	private Environment env;
	
	@Bean
	@Primary
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		return dataSource;
	}
	
	
	@Bean(name="entityManagerFactoryBean")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean()
	{
		LocalContainerEntityManagerFactoryBean lBean= new LocalContainerEntityManagerFactoryBean();
		lBean.setDataSource(dataSource());
		
		JpaVendorAdapter adapter= new HibernateJpaVendorAdapter();
		lBean.setJpaVendorAdapter(adapter);
		
		Map<String, String> props= new HashMap<>();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");
		
		lBean.setJpaPropertyMap(props);
		lBean.setPackagesToScan("com.example.multipledb.mysql.entities");
		return lBean;
		
	}
	
	
	@Bean(name="transactionmanager")
	@Primary
	public PlatformTransactionManager transactionManager()
	{
		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
		
	  return manager;
	}
	
	

}
