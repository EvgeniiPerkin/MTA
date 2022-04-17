package com.perkin.dev.repo;

import org.springframework.data.repository.CrudRepository;

import com.perkin.dev.domain.Order;

public interface OrderRepo extends CrudRepository<Order, Long> {
}
