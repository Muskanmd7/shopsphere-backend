package com.shopsphere.shopsphere_backend.products.service;

import com.shopsphere.shopsphere_backend.products.model.product;
import com.shopsphere.shopsphere_backend.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<product> getAllproducts(){
        return  productRepository.findAll();
    }
    public product addProduct(product product){
        return productRepository.save(product);
    }

    public product getProductById(Integer id)
    {
        return productRepository.findById(id).orElse(null);
    }

    public product updateProduct(product product, Integer id) {
        return productRepository.save(product);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    public List<product> searchProduct(String keyword) {
        return productRepository.findByProductNameContainingIgnoreCase(keyword);
    }

    public List<product> getProductByCategory(String category) {
        return productRepository.findByProductCategory(category);
    }
}
