package com.ModelMadness.daoimpll;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ModelMadness.dao.CategoryDao;
import com.ModelMadness.model.Category;


@Repository("categoryDao")
@Transactional

public class CategoryDaoImpl  implements CategoryDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired 
	public CategoryDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	
	public boolean insertCategory(Category category) {
		try{
			System.out.println("inserting the category is caling");
			Session session=sessionFactory.openSession();
			Transaction tx =session.beginTransaction();
			session.save(category);
			tx.commit();
			session.flush();
			session.close();
			return true;
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
		
	}

	

	
public Category getCategoryById(String cid) {
		
		return (Category)sessionFactory.getCurrentSession().createQuery("from Category where id='"+cid+"'").uniqueResult();
	}

public boolean delete(Category category) {
	try{
		getSession().delete(category);
		return true;
	}catch(Exception e){
		e.printStackTrace();
		return false;
	}
}

	
	public Category getCategoryByName(String name) {
		return (Category)sessionFactory.getCurrentSession().createQuery("from Category where name='"+name+"'" ).list().get(0);
		// TODO Auto-generated method stub
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Category").list();

	}


	public boolean save(Category category) {

		try {
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(category);
			session.getTransaction().commit();
			session.close();
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Category category) {
		try {
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			session.saveOrUpdate(category);

			session.getTransaction().commit();
			session.close();
			
			return true;
		} catch (Exception e) { // TODO Auto-generated catch block
								// e.printStackTrace();
			return false;
		}
	}
	
	
	

}
