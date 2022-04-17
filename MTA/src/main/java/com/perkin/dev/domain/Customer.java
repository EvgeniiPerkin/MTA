package com.perkin.dev.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_customer")
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private Long customerId;
	@Column(name = "customer_name")
	@Length(max = 150, message = "The customer name is too long (more than 150)")
	private String customerName;
	@Column(name = "phone")
	@Length(max = 25, message = "The phone is too long (more than 25)")
	private String phone;
	@Column(name = "email")
	@Length(max = 150, message = "The email is too long (more than 150)")
	private String email;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	
}
