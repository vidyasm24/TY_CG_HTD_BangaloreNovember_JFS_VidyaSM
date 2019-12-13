package com.capgemini.appdevelopement.controller;

import java.util.Scanner;

import com.capgemini.appdevelopement.bean.ContactBean;
import com.capgemini.appdevelopement.factory.ContactFactory;
import com.capgemini.appdevelopement.services.ContactServices;

public class DeleteConatct {
	public static void main(String[] args) {
		ContactServices services = ContactFactory.instanceOfContactServices();
		ContactBean contact =new ContactBean();
		Scanner sc = new Scanner(System.in);
	
			
				System.out.println("Enter Number to Delete");
				contact.setNumber(sc.nextLong());

				System.out.println("Enter Name");
				contact.setName(sc.next());

				if(services.deleteContact(contact.getNumber(),contact.getName()))
				{
					System.out.println("user Deleted..");
				}else
				{
					System.err.println("something went wrong");
				}
				sc.close();
			}
}








