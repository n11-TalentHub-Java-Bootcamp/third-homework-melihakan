package com.example.demo.mongodb.repository;


import com.example.demo.mongodb.entity.ProductComment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommentRepository extends MongoRepository<ProductComment,String> {
}
