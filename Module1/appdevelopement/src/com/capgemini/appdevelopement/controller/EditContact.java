package com.capgemini.appdevelopement.controller;

import java.util.Scanner;

import com.capgemini.appdevelopement.bean.ContactBean;
import com.capgemini.appdevelopement.factory.ContactFactory;
import com.capgemini.appdevelopement.services.ContactServices;

public class EditContact {
	public static void main(String[] args) {
		//Long number;
		//String name;
		ContactServices services = ContactFactory.instanceOfContactServices();
		ContactBean contact =new ContactBean();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Contact to Edit");
		contact.setNumber(sc.nextLong());
		
		System.out.println("Enter Name");
		contact.setName(sc.next());
	
		if(services.insertContact(contact))
		{
			System.out.println("Contact Edited");
		}else
		{
			System.err.println("something went wrong");
		}
		sc.close();
	}

}
	

