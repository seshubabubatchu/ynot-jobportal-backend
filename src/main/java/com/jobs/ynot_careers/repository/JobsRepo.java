package com.jobs.ynot_careers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobs.ynot_careers.entity.JobEntity;

public interface JobsRepo extends JpaRepository<JobEntity,Long> {
    
}
