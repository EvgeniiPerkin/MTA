package com.perkin.dev.repo;

import org.springframework.data.repository.CrudRepository;

import com.perkin.dev.domain.Driver;

public interface DriverRepo extends CrudRepository<Driver, Long> {

}
