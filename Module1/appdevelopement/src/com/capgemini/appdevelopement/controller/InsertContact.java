package com.capgemini.appdevelopement.controller;

import java.util.Scanner;

import com.capgemini.appdevelopement.bean.ContactBean;
import com.capgemini.appdevelopement.factory.ContactFactory;
import com.capgemini.appdevelopement.services.ContactServices;

public class InsertContact {
	public static void main(String[] args) {
		ContactServices services=  ContactFactory.instanceOfContactServices();
		ContactBean contact = new ContactBean();
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.println("Enter ContactNo");
		contact.setNumber(sc.nextLong());
		System.out.println("Enter ContactName");
		contact.setName(sc.next());
//		System.out.println("Enter groups");
//		contact.setGroups(sc.next());
		

		if(services.insertContact(contact))
		{
			System.out.println("Contact Inserted");
		}else
		{
			System.err.println("Something Went Wrong");
		}
		sc.close();
	}
}

