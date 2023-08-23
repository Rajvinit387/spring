package com.example.multipledb.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.multipledb.postgres.entities.product;

public interface productrepo extends JpaRepository<product, Integer> {
	
	product findByNameString(String name);

}
