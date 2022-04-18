package com.perkin.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perkin.dev.domain.Order;
import com.perkin.dev.repo.OrderRepo;

@Service
public class OrderService implements DbService<Order> {
	@Autowired
	private OrderRepo repo;
	
	@Override
	public List<Order> findAll() {
		var result = repo.findAll();
		return (List<Order>) result;
	}

	@Override
	public Boolean addItem(Order value) {
		repo.save(value);
		return true;
	}

	@Override
	public Boolean removeItem(Order value) {
		repo.delete(value);
		return true;
	}

	@Override
	public Boolean saveItem(Order value) {
		repo.save(value);
		return true;
	}
}
