package com.pappe.summer_internship.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="Product")
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer contractId;

    private String name;

    private String type;

    private LocalDate productionDate;

    public Product() {
    }

    public Product(Integer id, Integer contractId, String name, String type, LocalDate productionDate) {
        this.id = id;
        this.contractId = contractId;
        this.name = name;
        this.type = type;
        this.productionDate = productionDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }
}
