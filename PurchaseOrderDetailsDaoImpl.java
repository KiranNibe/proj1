package com.ims.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ims.dao.PurchaseOrderDetailsDao;
import com.ims.model.ProductDetails;
import com.ims.model.VendorDetails;
@Repository
public class PurchaseOrderDetailsDaoImpl implements PurchaseOrderDetailsDao{
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public VendorDetails getSelectedVendorRecord(String vendorName) {
		 VendorDetails results=new  VendorDetails();
			VendorDetails temp = null;
			Transaction tx = null;
		Session session = sessionFactory.openSession();
		try
		{
		session.setFlushMode(FlushMode.AUTO);
         tx=session.beginTransaction();
		String hql = " select * from vendor_details where name="+"'"+vendorName+"'";
//            " and status="+"'"+1+"'"+"";
		SQLQuery sql = (SQLQuery) session.createSQLQuery(hql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List vendorDeatilsList=sql.list();
		for(Object vendorDetails2 : vendorDeatilsList)
		{
			Map row = (Map) vendorDetails2;
			temp = new VendorDetails();
			temp.setVendorId(Long.parseLong(row.get("vendorid").toString()));
			temp.setVendorName(row.get("name").toString());
			temp.setAddress(row.get("address").toString());
			temp.setCity(row.get("city").toString());
			temp.setCountry(row.get("country").toString());
			temp.setEmail(row.get("email").toString());
			temp.setMobileNo(row.get("mobileno").toString());
			temp.setState(row.get("state").toString());
			temp.setStatus(Integer.parseInt(row.get("status").toString()));
			temp.setZipCode(row.get("zipcode").toString());
			temp.setPhoneNo(row.get("phone").toString());
			temp.setWebsite(row.get("website").toString());
			results = temp;
			temp = null;
		}
		 session.flush();
		    session.getTransaction().commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		    return results;
	}

	@Override
	public ProductDetails getSelectedProductRecord(String productName) {

		ProductDetails productDetails1 = new ProductDetails();
		ProductDetails temp = null;
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		String hql = "";
		try {
			session.setFlushMode(FlushMode.AUTO);
			tx = session.beginTransaction();
			hql = "select * from product_details where name=" + "'" + productName + "'" + ""
					+ " and status=" +"'"+1+"'";
			SQLQuery sql = (SQLQuery) session.createSQLQuery(hql)
					.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			List productDetails = sql.list();
			for (Object productDetails2 : productDetails) {
				Map row = (Map) productDetails2;
				temp = new ProductDetails();
				temp.setProductId(Integer.parseInt(row.get("productid").toString()));
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

}
