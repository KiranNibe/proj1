package com.ims.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import org.hibernate.Transaction;

import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.CreateKeySecondPass;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.sql.ordering.antlr.Factory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ims.dao.ProductDetailsDao;
import com.ims.model.ProductDetails;

@Repository
public class ProductDetailsDaoImpl implements ProductDetailsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public ProductDetails addProductDetails(ProductDetails productDetails) {

		ProductDetails productDetails1 = new ProductDetails();
		Session session = sessionFactory.openSession();
		try {
			session.setFlushMode(FlushMode.AUTO);
			session.save(productDetails);
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return productDetails;
	}

	@Override
	public ProductDetails updateProductDetails(String productId,int status) {

		ProductDetails productDetails1 = new ProductDetails();
		ProductDetails temp = null;
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		String hql = "";
		try {
			session.setFlushMode(FlushMode.AUTO);
			tx = session.beginTransaction();
			hql = "select * from product_details where productId=" + "'" + productId + "'" + ""
					+ " and status=" +"'"+status +"'";
			SQLQuery sql = (SQLQuery) session.createSQLQuery(hql)
					.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			List productDetails = sql.list();
			for (Object productDetails2 : productDetails) {
				Map row = (Map) productDetails2;
				temp = new ProductDetails();
				temp.setProductId(Integer.parseInt(productId));
				temp.setProductName(row.get("name").toString());
				temp.setDescription(row.get("description").toString());
				temp.setVendorName(row.get("vendor_name").toString());
				temp.setSalePrice((double) row.get("sale_price"));
				temp.setWarningQuantity((int) row.get("warning_quantity"));
				temp.setStatus((int) row.get("status"));
				productDetails1 = temp;
				temp = null;
			}
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tx.commit();
			session.close();
		}
		return productDetails1;
	}

	@Override
	public ProductDetails updateselectedproductdetails(ProductDetails productDetails) {

		ProductDetails productDetails1 = new ProductDetails();
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			session.update(productDetails);

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			tx.commit();
			session.close();
		}
		return productDetails;
	}

	@Override
	public Boolean deleteProductDeatils(String productId) {

		ProductDetails productDetails1 = new ProductDetails();
		Session session = sessionFactory.openSession();
		ProductDetails productDetails = null;
		Boolean returnValue = null;
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			
			 productDetails=(ProductDetails) session.get(ProductDetails.class, Long.parseLong(productId));
			 productDetails.setStatus(0);
//			  session.delete(productDetails);
			  tx.commit();
			  returnValue=true;
		} catch (Exception e) {

			 if (tx!=null) tx.rollback();
			 returnValue=false;
	         e.printStackTrace(); 		
	         } finally {
	        	 if(returnValue==true)
	        		   productDetails.setStatus(0);
			
			session.close();
		}
		return returnValue;
		
	}

	@Override
	public List<ProductDetails> listProductDetails() {
		ProductDetails productDetails1=new ProductDetails();
		 List <ProductDetails> results=new ArrayList<ProductDetails>();
		 try
		 {
		Session session = sessionFactory.openSession();
       session.beginTransaction();
		String hql = "select pd FROM ProductDetails pd where status="+"'"+1+"'"+"";
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
