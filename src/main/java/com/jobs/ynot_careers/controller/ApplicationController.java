package com.jobs.ynot_careers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.ynot_careers.entity.ApplicationEntity;
import com.jobs.ynot_careers.mapper.ApplicationMapper;
import com.jobs.ynot_careers.model.ApplicationModel;
import com.jobs.ynot_careers.repository.ApplicationRepo;

@RestController
@RequestMapping("/api/application")
public class ApplicationController {

    @Autowired
    private ApplicationRepo applicationRepo;

    @PostMapping("/submit")
    public List<ApplicationEntity> submitApplication(@RequestBody ApplicationModel appData) {
        System.out.println("inside submitApplication" + appData);
        ApplicationEntity appEntity = ApplicationMapper.mapToEntity(appData);
        applicationRepo.save(appEntity);
        return applicationRepo.findAll();
    }

    @GetMapping("/all")
    public List<ApplicationEntity> getAllApplications() {
        System.out.println("inside getAllApplications");
        return applicationRepo.findAll();
    }
}
