package com.jobs.ynot_careers.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
