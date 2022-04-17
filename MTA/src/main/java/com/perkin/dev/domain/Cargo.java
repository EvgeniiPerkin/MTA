package com.perkin.dev.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_cargo")
public class Cargo {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cargo_id")
	private Long cargoId;
	@Column(name = "cargo_name")
	@Length(max = 50, message = "The cargo name is too long (more than 50)")
	private String cargoName;
	public Long getCargoId() {
		return cargoId;
	}
	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}
	public String getCargoName() {
		return cargoName;
	}
	public void setCargoName(String cargoName) {
		this.cargoName = cargoName;
	}
	
}
