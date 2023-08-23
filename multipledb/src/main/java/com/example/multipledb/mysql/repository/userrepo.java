package com.example.multipledb.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.multipledb.mysql.entities.user;

public interface userrepo extends JpaRepository<user, Integer> {

}
