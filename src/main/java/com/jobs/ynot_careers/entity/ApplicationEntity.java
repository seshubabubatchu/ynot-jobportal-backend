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

@Entity
@Table(name = "applications")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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
