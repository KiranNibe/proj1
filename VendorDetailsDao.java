package com.ims.dao;

import java.util.List;

import com.ims.model.VendorDetails;

public interface VendorDetailsDao {

	VendorDetails addVendorDetails(VendorDetails vendorDetails);

	List<VendorDetails> listVendorDetails();

	VendorDetails updateVendorDetails( VendorDetails vendorDetails);

	Boolean deleteVendorDetails(String vendorId);


	VendorDetails updateVendorDetails(Long vendorId, int status);

}
