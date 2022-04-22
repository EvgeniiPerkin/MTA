package com.perkin.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perkin.dev.domain.Order;
import com.perkin.dev.service.DbService;

@Controller
public class HomeController {
	@Autowired
	private DbService<Order> service;
	
	@GetMapping("/")
	public String home(Model model) {
		var orders = (List<Order>)service.findAll();
		model.addAttribute("orders", orders);
		return "home";
	}
}
