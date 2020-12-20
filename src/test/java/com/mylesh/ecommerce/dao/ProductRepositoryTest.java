package com.mylesh.ecommerce.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
//@TestPropertySource(properties = {
//        "spring.jpa.hibernate.ddl-auto=validate"
//})
class ProductRepositoryTest {
    @Autowired private DataSource dataSource;
    @Autowired private JdbcTemplate jdbcTemplate;
    @Autowired private EntityManager entityManager;
    @Autowired private ProductRepository productRepository;
    @Autowired private ProductCategoryRepository productCategoryRepository;

    @Test
    void injectedComponentsAreNotNull(){
        assertThat(dataSource).isNotNull();
        assertThat(jdbcTemplate).isNotNull();
        assertThat(entityManager).isNotNull();
        assertThat(productRepository).isNotNull();
        assertThat(productCategoryRepository).isNotNull();
    }

//    @Test
//    void findByCategoryId() {
//        HashSet<Product> pl = new HashSet<>();
//        Product product = new Product();
//        ProductCategory pCat = new ProductCategory();
//        pl.add(product);
//        pCat.setCategoryName("testbook");
//        pCat.setProducts(pl);
//        product.setCategory(pCat);
//        product.setName("TESTBOOK");
//        productCategoryRepository.save(pCat);
//        productRepository.save(product);
//        assertThat(productRepository.findByCategoryId(1L,Pageable.unpaged())).isNotNull();
//    }
}