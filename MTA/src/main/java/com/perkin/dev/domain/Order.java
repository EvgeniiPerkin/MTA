package com.perkin.dev.domain;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_order")
public class Order {
	/**идентфификатор заявки*/
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private Long orderId;
	
	/**дата заявки*/
	@NotNull
	@Column(name = "date_order")
	private Date dateOrder;
	
	/**номер заявки*/
	@NotNull
	@Column(name = "order_number")
	private Long orderNumber;
	
	/**вес груза*/
	@Column(name = "cargo_weight")
	private Double cargoWeight;
	
	/**объем*/
	@Column(name = "volume")
	private Double volume;
	
	/**дата погрузки*/
	@NotNull
	@Column(name = "loading_date")
	private Date loadingDate;
	
	/**дата выгрузки*/
	@NotNull
	@Column(name = "unloading_date")
	private Date unloadingDate;
	
	/**время погрузки*/
	@NotNull
	@Column(name = "loading_time")
	private Date loadingTime;
	
	/**время выгрузки ОТ*/
	@NotNull
	@Column(name = "unloading_time_from")
	private Date unloadingTimeFrom;
	
	/**время выгрузки ДО*/
	@NotNull
	@Column(name = "unloading_time_to")
	private Date unloadingTimeTo;
	
	/**стоимость*/
	@NotNull
	@Column(name = "cost")
	private Double cost;
	@Column(name = "payment_terms")
	@Length(max = 255, message = "The payment terms is too long (more than 255")
	private String paymentTerms;

	/**автомобиль*/
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "car_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Car car;

	/**груз*/
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "cargo_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Cargo cargo;
	
	/**контрагент*/
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "counterparty_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Counterparty counterparty;

	/**заказчик*/
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Customer customer;

	/**водитель*/
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "driver_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Driver driver;

	/**исполнитель*/
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "executor_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Executor executor;

	/**адрес погрузки*/
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "loading_address_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private LoadingAddress loadingAddress;

	/**адрес выгрузки*/
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "unloading_address_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private UnloadingAddress unloadingAddress;

	/**
	 * возвращает идентификатор заявки
	 * @return идентификатор заявки
	 */
	public Long getOrderId() {
		return orderId;
	}
	/**
	 * устанавливает идентификатор заявки
	 * @param orderId идентификатор заявки
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Double getCargoWeight() {
		return cargoWeight;
	}

	public void setCargoWeight(Double cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Date getLoadingDate() {
		return loadingDate;
	}

	public void setLoadingDate(Date loadingDate) {
		this.loadingDate = loadingDate;
	}

	public Date getUnloadingDate() {
		return unloadingDate;
	}

	public void setUnloadingDate(Date unloadingDate) {
		this.unloadingDate = unloadingDate;
	}

	public Date getLoadingTime() {
		return loadingTime;
	}

	public void setLoadingTime(Date loadingTime) {
		this.loadingTime = loadingTime;
	}

	public Date getUnloadingTimeFrom() {
		return unloadingTimeFrom;
	}

	public void setUnloadingTimeFrom(Date unloadingTimeFrom) {
		this.unloadingTimeFrom = unloadingTimeFrom;
	}

	public Date getUnloadingTimeTo() {
		return unloadingTimeTo;
	}

	public void setUnloadingTimeTo(Date unloadingTimeTo) {
		this.unloadingTimeTo = unloadingTimeTo;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Counterparty getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(Counterparty counterparty) {
		this.counterparty = counterparty;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Executor getExecutor() {
		return executor;
	}
	// TO DO: дописать описание методов
	public void setExecutor(Executor executor) {
		this.executor = executor;
	}

	/**
	 * возвращает адрес погрузки
	 * @return адрес погрузки
	 */
	public LoadingAddress getLoadingAddress() {
		return loadingAddress;
	}
	/**
	 * устанавливает адрес погрузки
	 * @param loadingAddress адрес погрузки
	 */
	public void setLoadingAddress(LoadingAddress loadingAddress) {
		this.loadingAddress = loadingAddress;
	}

	/**
	 * возвращает адрес выгрузки
	 * @return адрес выгрузки
	 */
	public UnloadingAddress getUnloadingAddress() {
		return unloadingAddress;
	}
	/**
	 * устанавливает адрес выгрузки
	 * @param unloadingAddress адрес выгрузки
	 */
	public void setUnloadingAddress(UnloadingAddress unloadingAddress) {
		this.unloadingAddress = unloadingAddress;
	}
}
