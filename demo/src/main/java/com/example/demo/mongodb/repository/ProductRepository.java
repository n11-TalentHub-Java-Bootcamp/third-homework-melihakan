package com.example.demo.mongodb.repository;


import com.example.demo.mongodb.entity.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {

   List<Product> findAllByCategoryId(String categoryId);

/*    ProductDetailDto findProductDetailDtoById(String id);*/
}
