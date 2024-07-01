package com.pappe.summer_internship.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping("/all")
    public List<Product> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable int id) {
        return service.findById(id);
    }

    @PutMapping("/update/{id}")
    public Product update(@PathVariable int id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }
}
