package com.jobs.ynot_careers.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jobs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobEntity {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;
    private String jobTitle;
    private String metaDescription;
    private String jobDescription;
    private String jobType;
    private String jobLocation;
    private long category;
}
