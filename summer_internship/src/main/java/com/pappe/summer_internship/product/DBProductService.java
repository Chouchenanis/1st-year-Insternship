package com.pappe.summer_internship.product;

import com.pappe.summer_internship.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service("DBProductService")
public class DBProductService implements ProductService {

    private ProductRepository repository;

    @Autowired
    public DBProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        Optional<Product> optionalProduct = repository.findById(id);
        return optionalProduct.orElseThrow(() -> new RuntimeException("Product not found with id " + id));
    }

    @Override
    public Product update(Integer id ,Product product) {
        if (!repository.existsById(id)){
            throw new RuntimeException("Product not found with id " + product.getId());
        }
        product.setId(id) ;
        return repository.save(product);
    }

    @Override
    public void deleteById(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Product not found with id " + id);
        }
        repository.deleteById(id);
    }
}
