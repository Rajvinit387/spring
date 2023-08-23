package com.example.onetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoone.entities.product;

public interface productrepo  extends JpaRepository<product, String>{

}
