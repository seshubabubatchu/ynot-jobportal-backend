package com.jobs.ynot_careers.mapper;

import com.jobs.ynot_careers.entity.CategoriesEntity;
import com.jobs.ynot_careers.model.CategoriesModel;

public class CategoryMapper {
    public static CategoriesModel mapToModel(CategoriesEntity categoriesEntity){
        return  new CategoriesModel(categoriesEntity.getId(),categoriesEntity.getCategoryName());
    }

    public static CategoriesEntity mapToEntity(CategoriesModel categoriesModel){
        return new CategoriesEntity(categoriesModel.getId(), categoriesModel.getCategoryName());
        }
}
