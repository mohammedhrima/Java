package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private long nextId;

    public Product addProduct(Product product) {
        if (product.getPrice() < 0 || product.getStock() < 0) {
            throw new IllegalArgumentException("Price and stock must be valid");
        }
        product.setId(nextId++);
        products.add(product);
        return  product;
    }

    public List<Product> getAllProducts() {
        return  products;
    }

    public Product getProductById(Long id){
        return  products.stream().filter(p -> p.getId().equals(id))
                .findFirst().orElseThrow(()-> new RuntimeException("Product not found"));
    }

    public Product updateProduct(Long id, Product updated){
        Product existing = getProductById(id);
        existing.setName(updated.getName());
        existing.setStock(updated.getStock());
        existing.setDescription(updated.getDescription());
        existing.setPrice(existing.getPrice());
        existing.setStock(existing.getStock());
        return existing;
    }

    public void deleteProduct(Long id){
        Product product = getProductById(id);
        products.remove(product);
    }
}
