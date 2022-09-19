package com.cg.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.cg.entites.Order;

public interface OrderService {
	
	public abstract Order addOrder(Order order);
	public abstract Order updateOrder(Order order);
	public abstract Order searchOrder(long id);
	public abstract Order cancelMall(long id);
	public abstract Order addItem(Item item);

}
