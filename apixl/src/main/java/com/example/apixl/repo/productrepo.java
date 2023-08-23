package com.example.apixl.repo;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apixl.entities.product;

public interface productrepo extends JpaRepository<product, Integer> {
	
	
	

}
