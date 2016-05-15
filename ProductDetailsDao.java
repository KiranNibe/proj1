package com.ims.dao;

import java.util.ArrayList;
import java.util.List;

import com.ims.model.ProductDetails;

public interface ProductDetailsDao {

	ProductDetails addProductDetails(ProductDetails productDetails);

	ProductDetails updateProductDetails(String productId,int status);

	ProductDetails updateselectedproductdetails(ProductDetails productDetails);

	Boolean deleteProductDeatils(String productId);

	List<ProductDetails> listProductDetails();
	  

}
