package com.cg.services;

import java.util.Scanner;

import com.cg.dao.AdminDaoImpl;
import com.cg.entities.Admin;

public class AdminServicesImpl implements AdminServices
{
	//Establishing connection between service and repository
	private AdminDaoImpl dao;
	
	Scanner s=new Scanner(System.in);
		
		//constructor
		public AdminServicesImpl() 
		{
			dao=new AdminDaoImpl();
		}
		
	//Service calls to perform CRUD Operation
	@Override
	public Admin addNewAdmin(Admin admin) 
	{
		dao.beginTransaction();
		dao.addNewAdmin(admin);
		dao.commitTransaction();
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) 
	{System.out.println("Enter the admin name:");
	String uname=s.nextLine();
	System.out.println("Enter the Password :");
	String upsw=s.nextLine();
	if(uname==admin.getName() && upsw==admin.getPassword()) {
		return admin;
}

else 
{
	System.out.println("Invalid admin name or password :");
	return null;
}

}

	@Override
	public Admin login(Admin admin) 
	{
		System.out.println("Enter the admin name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		if(uname==admin.getName() && upsw==admin.getPassword()) {
			return admin;
	}
	
	else 
	{
		System.out.println("Invalid admin name or password :");
		return null;
	}
	}

	@Override
	public boolean logout() {
		System.exit(0);
		return true;
	}
	
}