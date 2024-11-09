package com.jobs.ynot_careers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.ynot_careers.entity.JobEntity;
import com.jobs.ynot_careers.mapper.JobMapper;
import com.jobs.ynot_careers.model.JobsModel;
import com.jobs.ynot_careers.repository.JobsRepo;


@RestController
@RequestMapping("/jobs")
public class JobsController {

    @Autowired
    private JobsRepo jobsRepo;
    
    @GetMapping("/allJobs")
    public List<JobEntity> getAllJobs(){
        return jobsRepo.findAll();
    }

    @GetMapping("{id}")
    public JobEntity getJobById(@PathVariable String id){
        Long jobId = Long.parseLong(id);
        return jobsRepo.findById(jobId).orElse(null);
    }

    @PostMapping("addJob")
    public List<JobEntity> addJob(@RequestBody JobsModel job){
        JobEntity jobEntity = JobMapper.mapToEntity(job);
        jobsRepo.save(jobEntity);
        return jobsRepo.findAll();
    }

    @DeleteMapping("delete/{id}")
    public List<JobEntity> deleteJob(@PathVariable String id){
        Long jobId = Long.parseLong(id);
        jobsRepo.deleteById(jobId);
        return jobsRepo.findAll();

    }

    @PutMapping("update/{id}")
    public JobEntity updateJob(@PathVariable String id, @RequestBody JobsModel jobsModel){
        Long jobId = Long.parseLong(id);
      JobEntity jobEntity = JobMapper.mapToEntity(jobsModel);
      jobEntity.setId(jobId);
      jobsRepo.save(jobEntity);
      return jobsRepo.findById(jobId).orElse(null);
    }
}
