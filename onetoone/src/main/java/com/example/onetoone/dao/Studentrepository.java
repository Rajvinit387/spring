package com.example.onetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoone.entities.Student;
public interface Studentrepository extends JpaRepository<Student, Integer>
{
	

}
