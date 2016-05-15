package com.ims.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ims.dao.VendorDetailsDao;
import com.ims.model.CustomerDetails;
import com.ims.model.ProductDetails;
import com.ims.model.VendorDetails;
@Repository()
public class VendorDetailsDaoImpl implements VendorDetailsDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public VendorDetails addVendorDetails(VendorDetails vendorDetails) {

		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			session.setFlushMode(FlushMode.AUTO);
			session.save(vendorDetails);
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return vendorDetails;
	}

	@Override
	public List<VendorDetails> listVendorDetails() {
		 List <VendorDetails> results=new ArrayList<VendorDetails>();
		Session session = sessionFactory.openSession();
		try
		{
      session.beginTransaction();
		String hql = "FROM VendorDetails vd where status="+"'"+1+"'"+"";
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

	@Override
	public VendorDetails updateVendorDetails(Long vendorId, int status) {

		VendorDetails vendorDetails1 = new VendorDetails();
		VendorDetails temp = null;
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		String hql = "";
		try {
			session.setFlushMode(FlushMode.AUTO);
			tx = session.beginTransaction();
			hql = "select * from vendor_details where vendorid=" + "'" + vendorId + "'" + ""
					+ " and status=" +"'"+status +"'";
			SQLQuery sql = (SQLQuery) session.createSQLQuery(hql)
					.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			List vendorDetails = sql.list();
			for (Object vendorDetails2 : vendorDetails) {
				Map row = (Map) vendorDetails2;
				temp = new VendorDetails();
				temp.setVendorId(vendorId);
				temp.setVendorName(row.get("name").toString());
				temp.setAddress(row.get("address").toString());
				temp.setCity(row.get("city").toString());
				temp.setCountry(row.get("country").toString());
				temp.setEmail(row.get("email").toString());
				temp.setMobileNo(row.get("mobileno").toString());
				temp.setState(row.get("state").toString());
				temp.setStatus(status);
				temp.setZipCode(row.get("zipcode").toString());
				temp.setPhoneNo(row.get("phone").toString());
				temp.setWebsite(row.get("website").toString());
				vendorDetails1 = temp;
				temp = null;
			}
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tx.commit();
			session.close();
		}
		return vendorDetails1;
	}

	@Override
	public Boolean deleteVendorDetails(String vendorId) {

		Session session = sessionFactory.openSession();
		VendorDetails vendorDetails = null;
		Boolean returnValue = null;
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			vendorDetails=(VendorDetails) session.get(VendorDetails.class, Long.parseLong(vendorId));
			vendorDetails.setStatus(0);
			  tx.commit();
			  returnValue=true;
		} catch (Exception e) {

			 if (tx!=null) tx.rollback();
			 returnValue=false;
	         e.printStackTrace(); 		
	         } finally {
	        	 if(returnValue==true)
	        		 vendorDetails.setStatus(0);
			
			session.close();
		}
		return returnValue;
		
	}

	@Override
	public VendorDetails updateVendorDetails(VendorDetails vendorDetails) {

		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			session.update(vendorDetails);

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			tx.commit();
			session.close();
		}
		return vendorDetails;
	}

}
