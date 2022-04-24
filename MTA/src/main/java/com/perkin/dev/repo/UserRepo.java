package com.perkin.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perkin.dev.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
