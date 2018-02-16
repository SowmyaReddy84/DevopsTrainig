package com.ModelMadness.daoimpll;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ModelMadness.dao.SupplierDao;
import com.ModelMadness.model.Supplier;




@Repository("supplierDao")
@Transactional
public class SupplierDaoImpl implements SupplierDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	public boolean insert(Supplier supplier) {
		try{
			System.out.println("inserting Supplier is callng");
			Session session=sessionFactory.openSession();
			Transaction tx =session.beginTransaction();
			session.save(supplier);
			tx.commit();
			session.flush();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;
		
	}

	public int saveOrUpdate(Supplier supplier) {
		try {
			supplier.setRole("ROLE_SUPPLIER");
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		} catch (Exception e) {
			// if any excpetion comes during execute of try block, catch will
			// excute
			e.printStackTrace();
			return 0;
		}
		return 1;
	}


	public List<Supplier> getAllSupplierList() {
	// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}

	public Supplier getSupplier(String id) {
		return (Supplier)sessionFactory.getCurrentSession().createQuery("from Supplier where id='"+id+"'").uniqueResult();
	}
	public boolean delete(Supplier supplier) {
		try{
			getSession().delete(supplier);
			return true;
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
			
		}
		
	}

	


	
}
