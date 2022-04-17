package com.perkin.dev.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_counterparty")
public class Counterparty {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "counterparty_id")
	private Long carId;
	@Column(name = "counterparty_name")
	@Length(max = 150, message = "The counterparty name is too long (more than 150)")
	private String counterpartyName;
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	public String getCounterpartyName() {
		return counterpartyName;
	}
	public void setCounterpartyName(String counterpartyName) {
		this.counterpartyName = counterpartyName;
	}
	
}
