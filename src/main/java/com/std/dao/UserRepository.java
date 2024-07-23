package com.std.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.std.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
