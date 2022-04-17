package com.perkin.dev.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_unloading_address")
public class UnloadingAddress {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "unloading_address_id")
	private Long unloadingAddressId;
	@Column(name = "address")
	@Length(max = 255, message = "The address is too long (more than 255)")
	private String address;
	public Long getUnloadingAddressId() {
		return unloadingAddressId;
	}
	public void setUnloadingAddressId(Long unloadingAddressId) {
		this.unloadingAddressId = unloadingAddressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
