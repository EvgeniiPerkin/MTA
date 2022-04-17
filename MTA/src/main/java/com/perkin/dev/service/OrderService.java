package com.perkin.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perkin.dev.repo.OrderRepo;

@Service
public class OrderService implements DbService {
	@Autowired
	private OrderRepo repo;
	
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addItem(Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeItem(Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean saveItem(Object value) {
		// TODO Auto-generated method stub
		return null;
	}

}
