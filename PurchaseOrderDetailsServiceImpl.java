package com.ims.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.PurchaseOrderDetailsDao;
import com.ims.model.ProductDetails;
import com.ims.model.VendorDetails;
import com.ims.service.PurchaseOrderDetailsService;
@Service
public class PurchaseOrderDetailsServiceImpl implements PurchaseOrderDetailsService{
	@Autowired
	PurchaseOrderDetailsDao purchaseOrderDetailsDao;
	@Override
	public VendorDetails getSelectedVendorRecord(String vendorName) {
		return purchaseOrderDetailsDao.getSelectedVendorRecord(vendorName);
	}
	@Override
	public ProductDetails getSelectedProductRecord(String productName) {
		return purchaseOrderDetailsDao.getSelectedProductRecord(productName);
	}

}
