package com.example.repository;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Product;

@Configuration
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}