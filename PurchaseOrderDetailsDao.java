package com.ims.dao;

import com.ims.model.ProductDetails;
import com.ims.model.VendorDetails;

public interface PurchaseOrderDetailsDao {


	VendorDetails getSelectedVendorRecord(String vendorName);

	ProductDetails getSelectedProductRecord(String productName);

}
