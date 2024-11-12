package com.jobs.ynot_careers.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationModel {
    private UUID id;
    private UUID userId;
    private UUID jobId;
    private String applicationStatus;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private String resume;
}
