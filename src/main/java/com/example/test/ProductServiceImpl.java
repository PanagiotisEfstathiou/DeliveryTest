package com.example.test;


import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public JpaRepository<Product, Long> getRepository() {
        return productRepository;
    }




}
