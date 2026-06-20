package com.shopsphere.shopsphere_backend.products.controller;

import com.shopsphere.shopsphere_backend.products.model.product;
import com.shopsphere.shopsphere_backend.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<product> getAllproducts() {
        return productService.getAllproducts();
    }

    @PostMapping("/products")
    public product addProduct(@RequestBody product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/products/{id}")
    public product getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @PutMapping("/products/{id}")
    public product updateProduct(@RequestBody product product, @PathVariable Integer id) {
        return productService.updateProduct(product, id);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }
    @GetMapping("/products/search/{keyword}")
    public List<product> searchProduct(@PathVariable String keyword) {
        return productService.searchProduct(keyword);
    }
    @GetMapping("products/category/{category}")
public List<product> getProductByCategory(@PathVariable String category) {
    return productService.getProductByCategory(category);
}
}