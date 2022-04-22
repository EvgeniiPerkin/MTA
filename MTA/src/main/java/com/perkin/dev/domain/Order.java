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

	/**
	 * возвращает дату заказа
	 * @return дата заказа
	 */
	public Date getDateOrder() {
		return dateOrder;
	}
	/**
	 * устанавливает дату заказа
	 * @param dateOrder дата заказа
	 */
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	
	/**
	 * возвращает номер заказа
	 * @return номер заказа
	 */
	public Long getOrderNumber() {
		return orderNumber;
	}
	/**
	 * устанавливает номер заказа
	 * @param orderNumber номер заказа
	 */
	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	/**
	 * возвращает вес груза
	 * @return вес груза
	 */
	public Double getCargoWeight() {
		return cargoWeight;
	}
	/**
	 * устанавливает вес груза
	 * @param cargoWeight вес груза
	 */
	public void setCargoWeight(Double cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	/**
	 * возвращает обём
	 * @return объём
	 */
	public Double getVolume() {
		return volume;
	}
	/**
	 * устанавливает объём
	 * @param volume объём
	 */
	public void setVolume(Double volume) {
		this.volume = volume;
	}

	/**
	 * возвращает дату погрузки
	 * @return дата погрузки
	 */
	public Date getLoadingDate() {
		return loadingDate;
	}
	/**
	 * устанавливает дату погрузки
	 * @param loadingDate дата погрузки
	 */
	public void setLoadingDate(Date loadingDate) {
		this.loadingDate = loadingDate;
	}

	/**
	 * возвращает дату выгрузки
	 * @return дата выгрузки
	 */
	public Date getUnloadingDate() {
		return unloadingDate;
	}
	/**
	 * устанавливает дату выгрузки
	 * @param unloadingDate дата выгрузки
	 */
	public void setUnloadingDate(Date unloadingDate) {
		this.unloadingDate = unloadingDate;
	}
	
	/**
	 * возвращает время погрузки
	 * @return время погрузки
	 */
	public Date getLoadingTime() {
		return loadingTime;
	}
	/**
	 * устанавливает время погрузки 
	 * @param loadingTime время погрузки
	 */
	public void setLoadingTime(Date loadingTime) {
		this.loadingTime = loadingTime;
	}
	
	/**
	 * возвращает время выгрузки ОТ
	 * @return время выгрузки ОТ
	 */
	public Date getUnloadingTimeFrom() {
		return unloadingTimeFrom;
	}
	/**
	 * устанавливает время выгрузки ОТ
	 * @param unloadingTimeFrom время выгрузки ОТ
	 */
	public void setUnloadingTimeFrom(Date unloadingTimeFrom) {
		this.unloadingTimeFrom = unloadingTimeFrom;
	}
	
	/**
	 * возвращает время выгрузки ПО
	 * @return время выгрузки ПО
	 */
	public Date getUnloadingTimeTo() {
		return unloadingTimeTo;
	}
	/**
	 * устанавливает время выгрузки ПО
	 * @param unloadingTimeTo время выгрузки ПО
	 */
	public void setUnloadingTimeTo(Date unloadingTimeTo) {
		this.unloadingTimeTo = unloadingTimeTo;
	}
	
	/**
	 * возвращает стоимость
	 * @return стоимость
	 */
	public Double getCost() {
		return cost;
	}
	/**
	 * устанавливает стоимость
	 * @param cost стоимость
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	/**
	 * возвращает описание платежа
	 * @return описание платежа
	 */
	public String getPaymentTerms() {
		return paymentTerms;
	}
	/**
	 * устанавливает описание платежа
	 * @param paymentTerms описание платежа
	 */
	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}
	
	/**
	 * возвращает автомобиль
	 * @return автомобиль
	 */
	public Car getCar() {
		return car;
	}
	/**
	 * устанавливает автомобиль
	 * @param car автомобиль
	 */
	public void setCar(Car car) {
		this.car = car;
	}
	
	/**
	 * возвращает груз
	 * @return груз
	 */
	public Cargo getCargo() {
		return cargo;
	}
	/**
	 * устанавливает груз 
	 * @param cargo груз
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	/**
	 * возвращает контрагента
	 * @return контрагент
	 */
	public Counterparty getCounterparty() {
		return counterparty;
	}
	/**
	 * устанавливает контрагента
	 * @param counterparty контрагент
	 */
	public void setCounterparty(Counterparty counterparty) {
		this.counterparty = counterparty;
	}

	/**
	 * возвращает заказчика
	 * @return заказчик
	 */
	public Customer getCustomer() {
	 
		return customer;
	}
	/**
	 * устанавливает заказчика
	 * @param customer заказчик
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * возвращает водителя
	 * @return водитель
	 */
	public Driver getDriver() {
		return driver;
	}
	/**
	 * устанавливает водителя
	 * @param driver водитель
	 */
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	/**
	 * возвращает исполнителя
	 * @return исполнитель
	 */
	public Executor getExecutor() {
		return executor;
	}
	/**
	 * устанавливает исполнителя
	 * @param executor исполнитель
	 */
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
