package com.perkin.dev.domain;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "t_order")
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private Long orderId;
	@Column(name = "date_order")
	private Date dateOrder;
	@Column(name = "order_number")
	private Long orderNumber;
	@Column(name = "cargo_weight")
	private Double cargoWeight;
	@Column(name = "volume")
	private Double volume;
	@Column(name = "loading_date")
	private Date loadingDate;
	@Column(name = "unloading_date")
	private Date unloadingDate;
	@Column(name = "loading_time")
	private Date loadingTime;
	@Column(name = "unloading_time_from")
	private Date unloadingTimeFrom;
	@Column(name = "unloading_time_to")
	private Date unloadingTimeTo;
	@Column(name = "cost")
	private Double cost;
	@Column(name = "payment_terms")
	@Length(max = 255, message = "The payment terms is too long (more than 255")
	private String paymentTerms;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "car_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Car car;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "cargo_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Cargo cargo;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "counterparty_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Counterparty counterparty;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Customer customer;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "driver_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Driver driver;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "executor_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Executor executor;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "loading_address_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private LoadingAddress loadingAddress;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "unloading_address_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private UnloadingAddress unloadingAddress;

	public Long getOrderId() {
		return orderId;
	}

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

	public void setExecutor(Executor executor) {
		this.executor = executor;
	}

	public LoadingAddress getLoadingAddress() {
		return loadingAddress;
	}

	public void setLoadingAddress(LoadingAddress loadingAddress) {
		this.loadingAddress = loadingAddress;
	}

	public UnloadingAddress getUnloadingAddress() {
		return unloadingAddress;
	}

	public void setUnloadingAddress(UnloadingAddress unloadingAddress) {
		this.unloadingAddress = unloadingAddress;
	}
}
