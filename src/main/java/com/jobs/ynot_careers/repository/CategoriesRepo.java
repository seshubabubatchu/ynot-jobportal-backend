package com.jobs.ynot_careers.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobs.ynot_careers.entity.CategoriesEntity;

public interface CategoriesRepo extends JpaRepository<CategoriesEntity,UUID> {
    
}
