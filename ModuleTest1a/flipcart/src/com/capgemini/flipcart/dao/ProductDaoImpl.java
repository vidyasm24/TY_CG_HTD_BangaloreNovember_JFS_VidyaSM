package com.capgemini.flipcart.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.flipcart.bean.ProductBean;

public class ProductDaoImpl implements ProductDao{

	FileReader reader;
	Properties prop;
	ProductBean bean;


	public ProductDaoImpl() {
		try {

			reader= new FileReader("db.properties");
			prop= new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {

			e.printStackTrace();
		}
	}	
	@Override
	public List<ProductBean> productDetails() {
		List<ProductBean> list= new ArrayList<ProductBean>();
		try(Connection  conn= DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs= stmt.executeQuery(prop.getProperty("getallproduct"))){
			
			while(rs.next()) {
				bean= new ProductBean();
				bean.setProductId(rs.getInt(1));
				bean.setProductName(rs.getString(2));
				bean.setProductCost(rs.getInt(3));
				bean.setProductColor(rs.getString(4));
				bean.setDescription(rs.getString(5));
				bean.setNumOfProducts(rs.getInt(6));
				
				list.add(bean);
				
			}	
			return list;
			}catch(Exception e) {
				e.printStackTrace();
			}
		return null;
}

	@Override
	public boolean searchProduct(String productName) {
		List<ProductBean> list= new ArrayList<ProductBean>();
		try(Connection  conn= DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("productbyname"))){
					
					pstmt.setString(1, productName);
					
					ResultSet rs=pstmt.executeQuery();
					
					while(rs.next()) {
						bean= new ProductBean();
						bean.setProductId(rs.getInt(1));
						bean.setProductName(rs.getString(2));
						bean.setProductCost(rs.getInt(3));
						bean.setProductColor(rs.getString(4));
						bean.setDescription(rs.getString(5));
						bean.setNumOfProducts(rs.getInt(6));
						
						
						list.add(bean);
					}
					return true;
				}catch(Exception e) {
					e.printStackTrace();
				}
		return false;
	}
	@Override
	public void buyProduct(long l, int cvv) {
		
		if(l<16 && cvv <3 ) {
			System.out.println("Please Enter validid and CVV");
		}else {
			System.out.println("Ordered!!!");
		}
		
	}

}