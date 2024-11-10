package com.jobs.ynot_careers.mapper;

import com.jobs.ynot_careers.entity.UserEntity;
import com.jobs.ynot_careers.model.UserModel;

public class UserMapper {
    public static UserEntity mapToEntity(UserModel userModel ){
        // Map userModel to UserEntity
        return new UserEntity(userModel.getId(), userModel.getFirstName(), userModel.getLastName(), userModel.getEmail(), userModel.getPassword());
    }
    public static UserModel mapToModel(UserEntity userEntity){
        // Map UserEntity to userModel
        return new UserModel(userEntity.getId(), userEntity.getFirstName(), userEntity.getLastName(), userEntity.getEmail(), userEntity.getPassword());
    }
}
