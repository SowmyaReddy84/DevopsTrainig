package com.ModelMadness.daoimpll;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ModelMadness.dao.ProductDao;
import com.ModelMadness.model.Product;


@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public boolean insert(Product product) {
		try{
			System.out.println("inserting Product is calling");
			Session session=sessionFactory.openSession();
			Transaction tx =session.beginTransaction();
			session.save(product);
			tx.commit();
			session.flush();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;
		
	}

	public int saveOrUpdate(Product product) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(product);
		} catch (Exception e) {
			// if any excpetion comes during execute of try block, catch will
			// excute
			e.printStackTrace();
			return 0;
		}
		return 1;
	}
	public int deleteById(int pid) {
		try{
			Product prdt = new Product();
			prdt.setPid(pid);
			sessionFactory.getCurrentSession().delete(prdt);
			
			
		}catch(Exception e){
			e.printStackTrace();
			return 0;
			
		}
		return 1;
		
	}

	public List<Product> getAllProduct() {
		return sessionFactory.getCurrentSession().createQuery("From Product").list();
	}

	public Product getProductId(int pid) {
		return (Product)sessionFactory.getCurrentSession().createQuery("from Product where pid='"+pid+"'").uniqueResult();
	}

}
