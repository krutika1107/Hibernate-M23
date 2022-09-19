package com.cg.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.cg.entites.Customer;


public interface CustomerService {
	
	public abstract Customer searchItem(String itemName);
	public abstract Customer orderItem(Item item);
	public abstract Customer searchMall(long id);
	public abstract Customer cancelOrder(long OrderId);
	public abstract Customer login(long user_id);
	public abstract Customer logOut(boolean user);
	
	
	
	


}