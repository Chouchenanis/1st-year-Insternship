package com.pappe.summer_internship.product;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findById(Integer id);

    void deleteById(Integer id);
}
