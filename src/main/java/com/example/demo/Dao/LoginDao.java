package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Login;

@Repository
public interface LoginDao extends JpaRepository<Login, Long> {
	Login findByName(String name);
}
