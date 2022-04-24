package com.perkin.dev.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perkin.dev.domain.*;
import com.perkin.dev.service.DbService;

@Controller
public class HomeController {
	@Autowired
	private DbService<Order> service;
	
	@GetMapping("/")
	public String home(Model model) {
		//var orders = (List<Order>)service.findAll();
		Order o = new Order();
		o.setOrderNumber(1L);
		o.setDateOrder(new Date());
		o.setOrderId(2L);
		o.setLoadingDate(new Date());
		o.setUnloadingDate(new Date());
		o.setLoadingTime(new Date());
		o.setUnloadingTimeFrom(new Date());
		o.setUnloadingTimeTo(new Date());
		o.setCost(100D);
		o.setCar(new Car());
		o.setCargo(new Cargo());
		o.setCounterparty(new Counterparty());
		Customer c = new Customer();
		c.setCustomerId(1L);
		c.setCustomerName("Глобал транс");
		o.setCustomer(c);
		Executor e = new Executor();
		e.setExecutorId(1L);
		e.setExecutorName("Москалев ПА");
		o.setExecutor(e);
		o.setLoadingAddress(new LoadingAddress());
		o.setUnloadingAddress(new UnloadingAddress());
				
		List<Order> orders = new ArrayList<Order>();
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		orders.add(o);
		model.addAttribute("orders", orders);
		return "home";
	}
}
