package com.cg.entites;


import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("unused")
@Entity
@Table(name="order")
public class Order {

	@Id
	private int id;
	private int dateofPurchase;
	private float total;
	private int c_id;
	private String PaymentMode;
	private int Shop_id;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="C_Id")
	private  Customer customer;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDateofPurchase() {
		return dateofPurchase;
	}
	public void setDateofPurchase(int dateofPurchase) {
		this.dateofPurchase = dateofPurchase;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float Float) {
		this.total = Float;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getPaymentMode() {
		return PaymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		PaymentMode = paymentMode;
	}
	public int getShop_id() {
		return Shop_id;
	}
	public void setShop_id(int shop_id) {
		Shop_id = shop_id;

	}
	
	
}
