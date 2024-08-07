package com.spring.REST.Controllers.REST;

import com.spring.REST.Entities.Product;
import com.spring.REST.Repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product  getProduct(@PathVariable("id") int id) {
        return productRepository.findById(id).get();
    }

    @PostMapping("/products/create")
    public Product createProduct (@RequestBody Product product){
        return productRepository.save(product);
    }

    @PutMapping("/products/update")
    public Product updateProduct (@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("/products/delete/{id}")
    public void deleteProduct(@PathVariable("id") int id) {
        productRepository.deleteById(id);
    }

}
