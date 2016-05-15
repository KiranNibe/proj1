package com.ims.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.LoginDao;
import com.ims.dao.ProductDetailsDao;
import com.ims.model.ProductDetails;
import com.ims.service.ProductDetailsService;
@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
@Autowired
	
	private ProductDetailsDao productDetailsDao;

	@Override
	public ProductDetails addProductDetails(ProductDetails productDetails) {
		return productDetailsDao.addProductDetails(productDetails);
	}

	@Override
	public ProductDetails updateProductDetails(String productId,int status) {
		return productDetailsDao.updateProductDetails(productId,status);
	}

	@Override
	public ProductDetails updateselectedproductdetails(ProductDetails productDetails) {
		return productDetailsDao.updateselectedproductdetails(productDetails);
	}

	@Override
	public Boolean deleteProductDeatils(String productId) {
		return productDetailsDao.deleteProductDeatils(productId);
	}

	@Override
	public List<ProductDetails> listProductDetails() {
		return productDetailsDao.listProductDetails();
	}

	
	
   
}
