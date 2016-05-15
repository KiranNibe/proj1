package com.ims.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ims.dao.LoginDao;
import com.ims.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
     protected SessionFactory sessionFactory;

    

	@Override
	public boolean login(String name, String pass) {
		System.out.println("In Check login");
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("user_name", name));
		cr.add(Restrictions.eq("user_pass", pass));
		
//		String SQL_QUERY =" select u.user_name,u.user_pass  from users as u where u.user_name=:name and u.user_pass=:pass";
//		Query query = session.createQuery(SQL_QUERY);
//		query.setParameter("user_name",name);
//		query.setParameter("user_pass",pass);
//		@SuppressWarnings("rawtypes")
		List list = cr.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
			System.out.println("userFound====>"+userFound);
		}

		session.close();
		return userFound;   
	}

}
