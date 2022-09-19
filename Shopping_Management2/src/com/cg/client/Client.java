package com.cg.client;

import com.cg.entites.Customer;
import com.cg.entites.Order;
import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.OrderService;
import com.cg.service.OrderServiceImpl;



public class Client {
	
	public static void main(String[] args) 
	{
		
		Customer customer= new Customer();
		CustomerService service = new CustomerServiceImpl();
		customer.setId(65);
		customer.setname("Ajay");
		customer.setPhoneNo("9826713405");
		customer.setEmail("ajay988@gmail.com");
		
		Order order = new Order();
		OrderService service1 = new OrderServiceImpl();
		order.setC_id(7985623);
		order.setTotal(10500.0f);
		order.getId();
		order.setPaymentMode("Online");

		customer.setOrder(order);
		order.setCustomer(customer);
		
		
		System.out.println("Data Is Inserted");
	}
	
	}
	


