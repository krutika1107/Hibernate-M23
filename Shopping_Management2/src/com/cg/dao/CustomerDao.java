package com.cg.dao;

import com.cg.entites.Customer;

public interface CustomerDao {
	
	 Customer addCustomer(Customer customer);
	 Customer updateCustomer(Customer customer);
	 Customer searchCustomer(long id);
	 Customer deleteCustomer(long id);
	
	 public abstract void beginTransaction();
	 public abstract void commitTransaction();
	

}
