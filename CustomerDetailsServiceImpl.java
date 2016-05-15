package com.ims.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.CustomerDetailsDao;
import com.ims.model.CustomerDetails;
import com.ims.service.CustomerDetailsService;
@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService{

	
	@Autowired
	   CustomerDetailsDao  customerDetailsDao;
	@Override
	public CustomerDetails addcustomerDetails(CustomerDetails customerDetails) {
		return customerDetailsDao.addcustomerDetails(customerDetails);
	}
	@Override
	public List<CustomerDetails> listCustomerDetails() {
		return customerDetailsDao.listCustomerDetails();
	}
	@Override
	public CustomerDetails updateCustomerDetails(int customerId, int status) {
		return customerDetailsDao.updateCustomerDetails( customerId, status);
	}
	@Override
	public Boolean deleteCustomerDeatils(String customerId) {
		return customerDetailsDao.deleteCustomerDeatils(customerId);
	}
	@Override
	public CustomerDetails updateCustomerDetails(CustomerDetails customerDetails) {
		return customerDetailsDao.updateCustomerDetails(customerDetails);
	}

}
