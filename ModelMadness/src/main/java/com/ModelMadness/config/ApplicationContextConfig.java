package com.ModelMadness.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.apache.commons.dbcp2.datasources.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ModelMadness.daoimpll.CartDaoImpl;
import com.ModelMadness.daoimpll.CategoryDaoImpl;
import com.ModelMadness.daoimpll.ProductDaoImpl;
import com.ModelMadness.daoimpll.SupplierDaoImpl;
import com.ModelMadness.daoimpll.UserDaoImpl;
import com.ModelMadness.model.Cart;
import com.ModelMadness.model.Category;
import com.ModelMadness.model.Product;
import com.ModelMadness.model.Supplier;
import com.ModelMadness.model.User;



@Configuration
@ComponentScan("com.*")
@EnableTransactionManagement
public class ApplicationContextConfig {

	@Bean(name = "dataSource")
	public DataSource getH2DataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/MMDB");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	}

	private Properties getHibernateProperties() {
		Properties p = new Properties();
		p.put("hibernate.show_sql", "true");
		p.put("hibenate.dialect", "org.hibernate.dialect.H2Dialect");
		p.put("hibernate.hbm2ddl.auto", "update");
		return p;

	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
			sessionBuilder.addProperties(getHibernateProperties());
		return sessionBuilder.buildSessionFactory();
	}

	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager gettransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return transactionManager;

	}

	 @Autowired
	 @Bean(name="productDao")
	 public ProductDaoImpl getProductDao(SessionFactory sessionFactory){
		 return new ProductDaoImpl(sessionFactory);
	 }
	 
	 @Autowired
	 @Bean(name="categoryDao")
	 public CategoryDaoImpl getCategoryDao(SessionFactory sessionFactory){
		 return new CategoryDaoImpl(sessionFactory);
	 }
	 
	 @Autowired
	 @Bean(name="userDao")
	 public UserDaoImpl getUserDaoImpl(SessionFactory sessionFactory){
		 return new UserDaoImpl(sessionFactory);
	 }
	 
	 @Autowired
	 @Bean(name="supplierDao")
	 public SupplierDaoImpl getSupplierDaoImpl(SessionFactory sessionFactory){
		 return new SupplierDaoImpl(sessionFactory);
	 }
	 
	 @Autowired
	 @Bean(name="cartDao")
	 public CartDaoImpl getCartDaoImpl(SessionFactory sessionFactory){
		 return new CartDaoImpl(sessionFactory);
	 }

}
