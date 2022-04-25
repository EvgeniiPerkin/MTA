package com.perkin.dev.domain;

import javax.persistence.*;

import org.hibernate.validator.constraints.Length;

/**
 * сущность - груз
 * @author Perkin
 *
 */
@Entity
@Table(name = "t_cargo")
public class Cargo {
	/**идентификатор груза*/
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cargo_id")
	private Long cargoId;
	
	/**наименование груза*/
	@Column(name = "cargo_name")
	@Length(max = 50, message = "The cargo name is too long (more than 50)")
	private String cargoName;
	
	/**
	 * возвращает идентификатор груза
	 * @return идентификатор груза
	 */
	public Long getCargoId() {
		return cargoId;
	}
	/**
	 * устанавливает идентификатор груза
	 * @param cargoId идентификатор груза
	 */
	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}
	
	/**
	 * возвращает наименование груза
	 * @return наименование груза
	 */
	public String getCargoName() {
		return cargoName;
	}
	/**
	 * устанавливает наименование груза
	 * @param cargoName наименование груза
	 */
	public void setCargoName(String cargoName) {
		this.cargoName = cargoName;
	}
	
}
