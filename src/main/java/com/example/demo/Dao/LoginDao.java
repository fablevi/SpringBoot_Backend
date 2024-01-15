package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entities.Login;

public interface LoginDao extends JpaRepository<Login, Long> {

}
