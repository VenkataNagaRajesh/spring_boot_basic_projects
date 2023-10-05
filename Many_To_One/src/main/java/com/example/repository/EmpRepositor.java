package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contrller.Employe;

public interface EmpRepositor extends JpaRepository<Employe, Integer>{

}
