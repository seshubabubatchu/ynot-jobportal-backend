package com.jobs.ynot_careers.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.ynot_careers.entity.CategoriesEntity;
import com.jobs.ynot_careers.mapper.CategoryMapper;
import com.jobs.ynot_careers.model.CategoriesModel;
import com.jobs.ynot_careers.repository.CategoriesRepo;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    @Autowired
    private CategoriesRepo categoriesRepo;
    @GetMapping("/all")
    public List<CategoriesEntity> getAllCategories(){
        System.out.println("inside getAllCategories");
        return categoriesRepo.findAll();
    }

    @GetMapping("/{id}")
    public CategoriesEntity getCategoryById(@PathVariable UUID id){
        // System.out.println("inside getCategoryById"+id);
        // Integer categoryId = Integer.parseInt(id);
        return categoriesRepo.findById(id).orElse(null);
    }
    @PostMapping("/add")
    public List<CategoriesEntity> addCategory(@RequestBody CategoriesModel category){
        System.out.println("inside addCategory");
        CategoriesEntity categoriesEntity = CategoryMapper.mapToEntity(category);
        categoriesRepo.save(categoriesEntity);
        return categoriesRepo.findAll();
    }

    @PutMapping("/{id}")
    public CategoriesEntity updateCategory(@PathVariable UUID id, @RequestBody CategoriesModel category){
        System.out.println("inside updateCategory"+id);
        // Integer categoryId = Integer.parseInt(id);
        CategoriesEntity categoriesEntity = CategoryMapper.mapToEntity(category);
        categoriesEntity.setId(id);
        categoriesRepo.save(categoriesEntity);
        return categoriesRepo.findById(id).orElse(null);
    }
    @DeleteMapping("/delete/{id}")
    public List<CategoriesEntity> deleteCategory(@PathVariable UUID id){
        // System.out.println("inside deleteCategory"+id);
        // Integer categoryId = Integer.parseInt(id);
        categoriesRepo.deleteById(id);
        return categoriesRepo.findAll();
    }
    
}
