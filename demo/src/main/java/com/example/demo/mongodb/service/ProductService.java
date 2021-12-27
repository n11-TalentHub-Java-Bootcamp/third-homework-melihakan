package com.example.demo.mongodb.service;

import com.example.demo.mongodb.dto.ProductDetailDto;
import com.example.demo.mongodb.entity.Product;



import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(String id);

    ProductDetailDto findProductDetailDtoById(String id);

    Product save(Product product);

    void deleteById(String id);

    List<ProductDetailDto> findAllProductByCategoryId(String categoryId);


}
