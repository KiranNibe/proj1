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

import com.ims.dao.CustomerDetailsDao;
import com.ims.model.CustomerDetails;
import com.ims.model.ProductDetails;

@Repository
public class CustomerDetailsDaoImpl implements CustomerDetailsDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public CustomerDetails addcustomerDetails(CustomerDetails customerDetails) {

		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			session.setFlushMode(FlushMode.AUTO);
			session.save(customerDetails);
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return customerDetails;
	}

	@Override
	public List<CustomerDetails> listCustomerDetails() {
		 List <CustomerDetails> results=new ArrayList<CustomerDetails>();
		Session session = sessionFactory.openSession();
		try
		{
       session.beginTransaction();
		String hql = "FROM CustomerDetails cd where status="+"'"+1+"'"+"";
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
	public CustomerDetails updateCustomerDetails(int customerId, int status) {

		CustomerDetails customerDetails1 = new CustomerDetails();
		CustomerDetails temp = null;
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		String hql = "";
		try {
			session.setFlushMode(FlushMode.AUTO);
			tx = session.beginTransaction();
			hql = "select * from customer_details where customerId=" + "'" + customerId + "'" + ""
					+ " and status=" +"'"+status +"'";
			SQLQuery sql = (SQLQuery) session.createSQLQuery(hql)
					.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			List customerDetails = sql.list();
			for (Object customerDetails2 : customerDetails) {
				Map row = (Map) customerDetails2;
				temp = new CustomerDetails();
				temp.setCustomerId((customerId));
				temp.setCustomerName(row.get("name").toString());
				temp.setAddress(row.get("address").toString());
				temp.setCity(row.get("city").toString());
				temp.setCountry(row.get("country").toString());
				temp.setEmail(row.get("email").toString());
				temp.setMobile(row.get("mobile").toString());
				temp.setState(row.get("state").toString());
				temp.setStatus(status);
				temp.setZipCode(row.get("zip").toString());
				temp.setTelePhoneNo(row.get("phone").toString());
				customerDetails1 = temp;
				temp = null;
			}
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tx.commit();
			session.close();
		}
		return customerDetails1;
	}

	@Override
	public Boolean deleteCustomerDeatils(String customerId) {

		Session session = sessionFactory.openSession();
		CustomerDetails customerDetails = null;
		Boolean returnValue = null;
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			
			customerDetails=(CustomerDetails) session.get(CustomerDetails.class, Integer.parseInt(customerId));
			customerDetails.setStatus(0);
			  tx.commit();
			  returnValue=true;
		} catch (Exception e) {

			 if (tx!=null) tx.rollback();
			 returnValue=false;
	         e.printStackTrace(); 		
	         } finally {
	        	 if(returnValue==true)
	        		 customerDetails.setStatus(0);
			
			session.close();
		}
		return returnValue;
		
	}

	@Override
	public CustomerDetails updateCustomerDetails(CustomerDetails customerDetails) {


		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			session.update(customerDetails);

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			tx.commit();
			session.close();
		}
		return customerDetails;
		}

}
