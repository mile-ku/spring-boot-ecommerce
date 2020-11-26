package com.mylesh.ecommerce.dao;

import com.mylesh.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("http://localhost:4200")
@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long> {

}
