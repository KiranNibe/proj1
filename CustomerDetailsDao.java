package com.ims.dao;

import java.util.List;

import com.ims.model.CustomerDetails;

public interface CustomerDetailsDao {

	CustomerDetails addcustomerDetails(CustomerDetails customerDetails);

	List<CustomerDetails> listCustomerDetails();

	CustomerDetails updateCustomerDetails(int customerId, int status);

	Boolean deleteCustomerDeatils(String customerId);

	CustomerDetails updateCustomerDetails(CustomerDetails customerDetails);

}
