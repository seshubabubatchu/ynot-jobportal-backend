package com.jobs.ynot_careers.mapper;

import com.jobs.ynot_careers.entity.JobEntity;
import com.jobs.ynot_careers.model.JobsModel;

public class JobMapper {
    public static JobEntity mapToEntity(
        JobsModel jobModel
    ) {
        return new JobEntity(
                jobModel.getId(),
                jobModel.getJobTitle(),
                jobModel.getMetaDescription(),
                jobModel.getJobDescription(),
                jobModel.getJobType(),
                jobModel.getJobLocation(),
                jobModel.getCategory()
        );
    }
    public static JobsModel maptoModel(JobEntity jobEntity) {
        return new JobsModel(
                jobEntity.getId(),
                jobEntity.getJobTitle(),
                jobEntity.getMetaDescription(),
                jobEntity.getJobDescription(),
                jobEntity.getJobType(),
                jobEntity.getJobLocation(),
                jobEntity.getCategory()
        );
    }
}
