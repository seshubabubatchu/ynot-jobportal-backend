package com.jobs.ynot_careers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobsModel {
    private long id;
    private String jobTitle;
    private String metaDescription;
    private String jobDescription;
    private String jobType;
    private String jobLocation;
    private long category;

}
