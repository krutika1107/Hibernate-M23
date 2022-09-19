package com.cg.dao;

import com.cg.entites.Order;

public interface OrderDao {
	
	 Order addOrder(Order order);
	 Order updateOrder(Order order);
	 Order searchOrder(long id);
	 Order deleteOrder(long id);
	
	 public abstract void beginTransaction();
	 public abstract void commitTransaction();
}
