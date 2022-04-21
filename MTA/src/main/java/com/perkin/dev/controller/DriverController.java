package com.perkin.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perkin.dev.domain.Driver;
import com.perkin.dev.service.DbService;

@Controller
public class DriverController {
	@Autowired
	private DbService<Driver> service;
	
	@GetMapping("/driver")
	public String driver(Model m) {
		return "driver";
	}
}
