package com.perkin.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perkin.dev.domain.Driver;
import com.perkin.dev.repo.DriverRepo;

@Service
public class DriverService implements DbService<Driver> {
	@Autowired
	private DriverRepo repo;
	
	@Override
	public List<Driver> findAll() {
		var result = repo.findAll();
		return (List<Driver>) result;
	}

	@Override
	public Boolean addItem(Driver value) {
		repo.save(value);
		return true;
	}

	@Override
	public Boolean removeItem(Driver value) {
		repo.delete(value);
		return true;
	}

	@Override
	public Boolean saveItem(Driver value) {
		repo.save(value);
		return true;
	}

}
