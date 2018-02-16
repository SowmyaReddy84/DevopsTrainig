package com.ModelMadness.daoimpll;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ModelMadness.dao.CartDao;
import com.ModelMadness.model.Cart;
import com.ModelMadness.model.Product;
@Repository("cartDao")
@Transactional
public class CartDaoImpl implements CartDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CartDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}


	public boolean insert(Cart cart) {
		try{
			System.out.println("inserting Cart is calling");
			Session session=sessionFactory.openSession();
			Transaction tx =session.beginTransaction();
			session.save(cart);
			tx.commit();
			session.flush();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;
		
	}

	@Override
	public int saveOrUpdate(Cart cart) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(cart);
		} catch (Exception e) {
			// if any excpetion comes during execute of try block, catch will
			// excute
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public boolean deleteById(int catid) {
		try{
			getSession().delete(catid);
			return true;
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
			
		}
		
	}

	@Override
	public List<Cart> getAllCart() {
		return sessionFactory.getCurrentSession().createQuery("From Cart").list();
	}

	@Override
	public Cart getCartById(int Userid) {
		// TODO Auto-generated method stub
		return (Cart)sessionFactory.getCurrentSession().createQuery("from Cart where Userid='"+Userid+"'").uniqueResult();
	}

	

}
