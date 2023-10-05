package com.example.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controller.Employe;

public interface EmpRepo extends JpaRepository<Employe, Integer>{

}
