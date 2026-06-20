package com.shopsphere.shopsphere_backend.products.repository;

import com.shopsphere.shopsphere_backend.products.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<product, Integer> {
    List<product> findByProductNameContainingIgnoreCase(String keyword);
    List<product> findByProductCategory(String category);
}
