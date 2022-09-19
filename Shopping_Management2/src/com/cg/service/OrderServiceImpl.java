package com.cg.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.cg.dao.CustomerDao;
import com.cg.dao.CustomerDaoImpl;
import com.cg.dao.OrderDaoImpl;
import com.cg.entites.Order;

public class OrderServiceImpl implements OrderService {
	
	private OrderDaoImpl dao;
	
	public OrderServiceImpl() {
		super();
		dao=new OrderDaoImpl();
		
		
	}

	@Override
	public Order addOrder(Order order) {
		dao.beginTransaction();
		dao.addOrder(order);
		dao.commitTransaction();
		return null;
	}

	@Override
	public Order updateOrder(Order order) {
		dao.beginTransaction();
		dao.updateOrder(order);
		dao.commitTransaction();
		return order;
	}

	@Override
	public Order searchOrder(long id) {
		Order order=dao.searchOrder(0);
		
		return order;
	}

	@Override
	public Order cancelMall(long id) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}

	@Override
	public Order addItem(Item item) {
		dao.beginTransaction();
		dao.addOrder(null);
		dao.commitTransaction();
		return null;
	}

	
}
