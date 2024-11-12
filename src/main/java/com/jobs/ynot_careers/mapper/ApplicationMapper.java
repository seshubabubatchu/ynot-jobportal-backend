package com.jobs.ynot_careers.mapper;

import com.jobs.ynot_careers.entity.ApplicationEntity;
import com.jobs.ynot_careers.model.ApplicationModel;

public class ApplicationMapper {
    public static ApplicationModel mapToModel(ApplicationEntity applicationEntity) {
        return new ApplicationModel(
                applicationEntity.getId(),
                applicationEntity.getUserId(),
                applicationEntity.getJobId(),
                applicationEntity.getApplicationStatus(),
                applicationEntity.getFirstName(),
                applicationEntity.getLastName(),
                applicationEntity.getEmail(),
                applicationEntity.getAddress(),
                applicationEntity.getPhoneNumber(),
                applicationEntity.getResume());
    }

    public static ApplicationEntity mapToEntity(ApplicationModel applicationModel) {
        return new ApplicationEntity(
                applicationModel.getId(),
                applicationModel.getUserId(),
                applicationModel.getJobId(),
                applicationModel.getApplicationStatus(),
                applicationModel.getFirstName(),
                applicationModel.getLastName(),
                applicationModel.getEmail(),
                applicationModel.getAddress(),
                applicationModel.getPhoneNumber(),
                applicationModel.getResume());
    }
}
