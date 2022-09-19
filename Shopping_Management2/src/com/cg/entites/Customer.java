package com.cg.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("unused")
public class Customer {

	@Entity
	@Table(name="Customer")
	public class customer {
		
		@Id
		
		private int id;
		private String name;
		private Order order_id;
		private String phone;
		private String email;
		
		@OneToMany(mappedBy="Customercascade=CascadeType.ALL")

		private Order order;
		
		//Getter and Setters

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Order getOrder_id() {
			return order_id;
		}

		public void setOrder_id(Order order_id) {
			this.order_id = order_id;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		
		
		
		
	
		
	}
	
}
		
	
	
	


