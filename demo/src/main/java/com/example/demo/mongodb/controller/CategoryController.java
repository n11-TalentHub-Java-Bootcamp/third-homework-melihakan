package com.example.demo.mongodb.controller;

import com.example.demo.mongodb.entity.Category;
import com.example.demo.mongodb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoriesm/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public List<Category> findAll(){
       return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable String id){
        return categoryService.findById(id);
    }
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody Category category){

        category = categoryService.save(category);

        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        categoryService.delete(id);
    }


}
