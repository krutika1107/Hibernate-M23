package com.cg.service;


import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.cg.dao.CustomerDao;
import com.cg.dao.CustomerDaoImpl;
import com.cg.entites.Customer;
import com.cg.entites.Customer;

@SuppressWarnings("unused")
public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerDao dao;
	
		public CustomerServiceImpl() {
			super();
			dao=new CustomerDaoImpl();
			
			
		}

		@Override
		public Customer searchItem(String itemName) {
			Customer customer=dao.searchCustomer(0);
			return customer;
		}

		@Override
		public Customer orderItem(Item item) {
			dao.beginTransaction();
			dao.commitTransaction();
			
			return null;
		}

		@Override
		public Customer searchMall(long id) {
			dao.beginTransaction();
			dao.commitTransaction();
			return null;
		}

		@Override
		public Customer cancelOrder(long OrderId) {
			dao.beginTransaction();
			dao.commitTransaction();
			return null;
		}

		@Override
		public Customer login(long user_id) {
			
			return null;
		}
        
		
		public boolean logOut() {
			return false;
		}

		@Override
		public Customer logOut(boolean user) {
			// TODO Auto-generated method stub
			return null;
		}

		
		
	
	
}


