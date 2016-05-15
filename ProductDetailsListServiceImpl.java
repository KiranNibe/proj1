package com.ims.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.dao.ProductDetailsDao;
import com.ims.dao.ProductDetailsListDao;
import com.ims.model.ProductDetails;
import com.ims.service.ProductDetailsListService;
import com.ims.service.ProductDetailsService;
@Service
public class ProductDetailsListServiceImpl implements ProductDetailsListService{
	@Autowired
	 ProductDetailsListDao productDetailsListDao;
	@Override
	public List<ProductDetails> listProductDetails() {
		return productDetailsListDao.listProductDetails();
	}

}
