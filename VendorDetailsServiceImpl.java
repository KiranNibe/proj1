package com.ims.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.VendorDetailsDao;
import com.ims.model.VendorDetails;
import com.ims.service.VendorDetailsService;
@Service
public class VendorDetailsServiceImpl  implements VendorDetailsService{

	@Autowired
	VendorDetailsDao  vendorDetailsDao;
	
	@Override
	public VendorDetails addVendorDetails(VendorDetails vendorDetails) {
		return vendorDetailsDao.addVendorDetails(vendorDetails);
	}

	@Override
	public List<VendorDetails> listVendorDetails() {
		// TODO Auto-generated method stub
		return vendorDetailsDao.listVendorDetails();
	}

	@Override
	public VendorDetails updateVendorDetails(VendorDetails vendorDetails) {
		// TODO Auto-generated method stub
		return vendorDetailsDao.updateVendorDetails(vendorDetails);
	}

	@Override
	public Boolean deleteVendorDetails(String vendorId) {
		// TODO Auto-generated method stub
		return vendorDetailsDao.deleteVendorDetails(vendorId);
	}

	@Override
	public VendorDetails updateVendorDetails(Long vendorId, int status) {
		return vendorDetailsDao.updateVendorDetails(vendorId,status);
	}

}
