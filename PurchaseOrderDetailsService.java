package com.ims.service;

import com.ims.model.ProductDetails;
import com.ims.model.VendorDetails;

public interface PurchaseOrderDetailsService {

	VendorDetails getSelectedVendorRecord(String vendorName);

	ProductDetails getSelectedProductRecord(String productName);

}
