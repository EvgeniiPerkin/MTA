package com.perkin.dev.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_car")
public class Car {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "car_id")
	private Long carId;
	@Column(name = "state_number")
	@Length(max = 20, message = "The number is too long (more than 20)")
	private String stateNumber;
	@Column(name = "load_capacity")
	private Integer loadCapacity;
	@Length(max = 150, message = "The type of vehicle is too long (more than 150)")
	@Column(name = "type_of_vehicle")
	private String typeOfVehicle;
	@Column(name = "cargo_unloading")
	@Length(max = 150, message = "The cargo unloading is too long (more than 150)")
	private String cargoUnloading;
	@Column(name = "vehicle_brand")
	@Length(max = 25, message = "The vehicle brand is too long (more than 25)")
	private String vehicleBrand;
	@Column(name = "trailer_number")
	@Length(max = 20, message = "The trailer number is too long (more than 20")
	private String trailerNumber;
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	public String getStateNumber() {
		return stateNumber;
	}
	public void setStateNumber(String stateNumber) {
		this.stateNumber = stateNumber;
	}
	public Integer getLoadCapacity() {
		return loadCapacity;
	}
	public void setLoadCapacity(Integer loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	public String getCargoUnloading() {
		return cargoUnloading;
	}
	public void setCargoUnloading(String cargoUnloading) {
		this.cargoUnloading = cargoUnloading;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public String getTrailerNumber() {
		return trailerNumber;
	}
	public void setTrailerNumber(String trailerNumber) {
		this.trailerNumber = trailerNumber;
	}
}
