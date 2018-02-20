package com.ModelMadness.daoimpll;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ModelMadness.dao.UserDetailDao;
import com.ModelMadness.model.UserDetail;




@Repository("userDetailsDao")
@Transactional
public class UserDetailDaoImpl implements UserDetailDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDetailDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	public boolean insert(UserDetail userDetails) {
		try {

			System.out.println("insert i scalled*******");
			// sessionFactory.getCurrentSession().save(user);
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			
			session.save(userDetails);
			tx.commit();
			session.flush();
			session.close();

		} catch (Exception e) {
			// if any excpetion comes during execute of try block, catch will
			// excute
			e.printStackTrace();
			// return false;
		}
		// return true;
		return true;
	}
	public int saveOrUpdate(UserDetail userdetail) {
		try{
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(userdetail);
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}
@Transactional
	public List<UserDetail> getAllUserDetail() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<UserDetail> listUserDetail = (List<UserDetail>) sessionFactory.getCurrentSession().createCriteria(UserDetail.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listUserDetail;

	}
    @Transactional
	public int deleteById(int userdetailId) {
		
			// TODO Auto-generated method stub
			UserDetail usrToDelete = new UserDetail();
			usrToDelete.setUserId("userdetailId");
			sessionFactory.getCurrentSession().delete(usrToDelete);
			return 0;
	}
	
			
	
}
