package com.ims.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class ProductDetails {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="productid")
	 private long  productId;
	 @Column(name="productcode")
	 private String productCode;
	 @Column(name="name")
	 private String productName;
	 @Column(name="vendor_name")
	 private String vendorName;
	 @Column(name="sale_price")
	 private double salePrice;
	 @Column(name="warning_quantity")
	 private int warningQuantity;
	 @Column(name="type")
	 private String productType;
	 @Column(name="description")
	 private String description;
	 @Column(name="status")
	 private int status;
	 @Column(name="productcategoriesid")
	 private Integer productcategoriesid;
	 @Column(name="created_by")
	 private String createdBy;
	 @Column(name="updated_by")
	 private String updatedBy;
	
	
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
	
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public int getWarningQuantity() {
		return warningQuantity;
	}
	public void setWarningQuantity(int warningQuantity) {
		this.warningQuantity = warningQuantity;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Integer getProductcategoriesid() {
		return productcategoriesid;
	}
	public void setProductcategoriesid(Integer productcategoriesid) {
		this.productcategoriesid = productcategoriesid;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	 
	 
	 
	

}
