package com.pappe.summer_internship.product;

import java.util.List;
public interface ProductService {

    Product save(Product product);

    List<Product> findAll();

    Product findById(Integer id);

    Product update(Integer id,Product product);

    void deleteById(Integer id);
}
