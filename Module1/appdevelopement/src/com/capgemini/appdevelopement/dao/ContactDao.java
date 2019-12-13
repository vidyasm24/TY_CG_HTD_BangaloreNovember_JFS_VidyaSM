package com.capgemini.appdevelopement.dao;

import java.util.List;

import com.capgemini.appdevelopement.bean.ContactBean;

public interface ContactDao {
	public  List<ContactBean> getAllContact();
	public boolean insertContact(ContactBean bean);
	public boolean deleteContact(long number,String name);
	public boolean editContact(long number,String name);

}

