package com.perkin.dev.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_loading_address")
public class LoadingAddress {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "loading_address_id")
	private Long loadingAddressId;
	@Column(name = "address")
	@Length(max = 255, message = "The address is too long (more than 255)")
	private String address;
	public Long getLoadingAddressId() {
		return loadingAddressId;
	}
	public void setLoadingAddressId(Long loadingAddressId) {
		this.loadingAddressId = loadingAddressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
