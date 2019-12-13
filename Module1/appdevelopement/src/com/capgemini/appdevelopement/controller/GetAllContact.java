package com.capgemini.appdevelopement.controller;

import java.util.List;

import com.capgemini.appdevelopement.bean.ContactBean;
import com.capgemini.appdevelopement.factory.ContactFactory;
import com.capgemini.appdevelopement.services.ContactServices;

public class GetAllContact {
	public static void main(String[] args) {
		 ContactServices services = ContactFactory.instanceOfContactServices();
		 
		 List<ContactBean> list=services.getAllContact();
		 if(list!=null)
		 {
			 for (ContactBean contact: list) {
				 System.out.println(contact);
				
			}
		 }
	}
}

