package com.example.demo.mongodb.service.entityService;

import com.example.demo.mongodb.entity.Category;
import com.example.demo.mongodb.repository.CategoryRepository;
import com.example.demo.mongodb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryEntityService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    public Category findById(String id){
        Optional<Category> optional = categoryRepository.findById(id);
        Category category = null;
        if(optional.isPresent()){
            category = optional.get();
        }

        return category;
    }
    public void deleteById(String id){
        categoryRepository.deleteById(id);
    }

    public Category save(Category category){
        return categoryRepository.save(category);
    }
}
