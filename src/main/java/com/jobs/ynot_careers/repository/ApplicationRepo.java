package com.jobs.ynot_careers.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobs.ynot_careers.entity.ApplicationEntity;

public interface ApplicationRepo extends JpaRepository<ApplicationEntity, UUID> {

}
