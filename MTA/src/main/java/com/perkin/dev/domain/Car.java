package com.perkin.dev.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

/**
 * Класс сущность - автомобиль
 * @author Perkin
 *
 */
@Entity
@Table(name = "t_car")
public class Car {
	/**идентификатор машины*/
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "car_id")
	private Long carId;
	
	/**государственный номер*/
	@Column(name = "state_number")
	@Length(max = 20, message = "The number is too long (more than 20)")
	private String stateNumber;
	
	/**грузоподъёмность*/
	@Column(name = "load_capacity")
	private Integer loadCapacity;
	
	/**тип транспортного средства*/
	@Length(max = 150, message = "The type of vehicle is too long (more than 150)")
	@Column(name = "type_of_vehicle")
	private String typeOfVehicle;
	
	/**разгрузка груза*/
	@Column(name = "cargo_unloading")
	@Length(max = 150, message = "The cargo unloading is too long (more than 150)")
	private String cargoUnloading;
	
	/**марка транспортного средства*/
	@Column(name = "vehicle_brand")
	@Length(max = 25, message = "The vehicle brand is too long (more than 25)")
	private String vehicleBrand;
	
	/**номер прицепа*/
	@Column(name = "trailer_number")
	@Length(max = 20, message = "The trailer number is too long (more than 20")
	private String trailerNumber;
	
	/**
	 * возвращает идентификатор машины
	 * @return идентификатор машины
	 */
	public Long getCarId() {
		return carId;
	}
	/**
	 * устанавливает идентификатор машины
	 * @param carId идентификатор машины
	 */
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	
	/**
	 * возвращает гос. номер
	 * @return гос. номер
	 */
	public String getStateNumber() {
		return stateNumber;
	}
	/**
	 * устанавливает гос. номер
	 * @param stateNumber гос. номер
	 */
	public void setStateNumber(String stateNumber) {
		this.stateNumber = stateNumber;
	}
	
	/**
	 * возвращает грузоподъемность
	 * @return грузоподъемность
	 */
	public Integer getLoadCapacity() {
		return loadCapacity;
	}
	/**
	 * устанвливает грузоподьёмность
	 * @param loadCapacity грузоподъемность
	 */
	public void setLoadCapacity(Integer loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	/**
	 * возвращает тип транспортного средства
	 * @return тип транспортного средвства
	 */
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	/**
	 * устанавливает тип транспортного средства
	 * @param typeOfVehicle тип транспортного средства
	 */
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	
	/**
	 * возвращает разгрузку груза
	 * @return разгрузка груза
	 */
	public String getCargoUnloading() {
		return cargoUnloading;
	}
	/**
	 * устанавливает разгрузку груза
	 * @param cargoUnloading разгрузка груза
	 */
	public void setCargoUnloading(String cargoUnloading) {
		this.cargoUnloading = cargoUnloading;
	}
	
	/**
	 * возвращает марку транспортного средства
	 * @return марка транспортного средства
	 */
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	/**
	 * устанавливает марку транспортного средства
	 * @param vehicleBrand арка транспортного средства
	 */
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	
	/**
	 * возвращает номер прицепа
	 * @return номер прицепа
	 */
	public String getTrailerNumber() {
		return trailerNumber;
	}
	/**
	 * устанавливает номер прицепа
	 * @param trailerNumber номер прицепа
	 */
	public void setTrailerNumber(String trailerNumber) {
		this.trailerNumber = trailerNumber;
	}
}
