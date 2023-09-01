package com.day6.paginationandsorting.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.day6.paginationandsorting.model.Baby;

public interface BabyRepository extends JpaRepository<Baby, Integer>{
	
}