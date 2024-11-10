package com.jobs.ynot_careers.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobsModel {
    private UUID id;
    private String jobTitle;
    private String metaDescription;
    private String jobDescription;
    private String jobType;
    private String jobLocation;
    private long category;

}
