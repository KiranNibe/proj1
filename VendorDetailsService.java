package com.ims.service;

import java.util.List;

import com.ims.model.VendorDetails;

public interface VendorDetailsService {

	VendorDetails addVendorDetails(VendorDetails vendorDetails);

	List<VendorDetails> listVendorDetails();


	VendorDetails updateVendorDetails(VendorDetails vendorDetails);

	Boolean deleteVendorDetails(String vendorId);

	VendorDetails updateVendorDetails(Long vendorId, int status);

	
}