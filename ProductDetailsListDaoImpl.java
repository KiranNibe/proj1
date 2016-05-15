package com.ims.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ims.dao.ProductDetailsDao;
import com.ims.dao.ProductDetailsListDao;
import com.ims.model.ProductDetails;
@Repository
public class ProductDetailsListDaoImpl implements ProductDetailsListDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	

	@Override
	public List<ProductDetails> listProductDetails() {
		ProductDetails productDetails1=new ProductDetails();
		 List <ProductDetails> results=new ArrayList<ProductDetails>();
		 try
		 {
		Session session = sessionFactory.openSession();
        session.beginTransaction();
		String hql = "FROM ProductDetails";
		Query query = session.createQuery(hql);
		 results = query.list();
		 session.flush();
		   session.getTransaction().commit();
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		   return results;
	}

}
