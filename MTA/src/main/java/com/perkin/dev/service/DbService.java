package com.perkin.dev.service;

import java.util.List;

public interface DbService<T> {
	List<T> findAll();
	Boolean addItem(T value);
	Boolean removeItem(T value);
	Boolean saveItem(T value);
}
