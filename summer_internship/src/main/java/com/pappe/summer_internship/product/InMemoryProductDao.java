package com.pappe.summer_internship.product;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

import com.pappe.summer_internship.client.Client;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryProductDao {

    private final List<Product> products=new ArrayList<>();

    public Product save(Product product) {
        products.add(product);
        return product;
    }

    public Product findById(Integer id) {
        return products.stream()
                .filter(c -> c.getId().equals(id)).
                findFirst()
                .orElse(null);
    }

    public Product update(Integer id, Product product) {
        var productIndex = IntStream.range(0, products.size())
                .filter(i -> products.get(i).getId().equals(id))
                .findFirst()
                .orElse(-1);
        if (productIndex >= 0) {
            product.setId(id);
            Product existingProduct = products.get(productIndex);
            existingProduct.setName(product.getName());
            existingProduct.setContractId(product.getContractId());
            existingProduct.setType(product.getType());
            existingProduct.setProductionDate(product.getProductionDate());
            return existingProduct;
        }
        return null;
    }


    public void deleteById(Integer id) {
        var product = findById(id);
        if (product != null) {
            products.remove(product);
        }
    }

    public List<Product> findAll() {
        return products;
    }
}
