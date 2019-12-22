package com.capgemini.flipcart.dao;

import java.util.List;

import com.capgemini.flipcart.bean.ProductBean;

public interface ProductDao {
	public List<ProductBean>productDetails();
	public boolean searchProduct(String productName);
	public void buyProduct(long l, int cvv);

}