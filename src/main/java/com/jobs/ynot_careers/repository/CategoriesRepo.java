package com.jobs.ynot_careers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobs.ynot_careers.entity.CategoriesEntity;

public interface CategoriesRepo extends JpaRepository<CategoriesEntity,Integer> {
    
}
