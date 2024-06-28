package com.pappe.summer_internship.contract;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer customerId;

    private Integer dealerId;

    private Integer productId;

    private String type;

    private String status;

    private LocalDate validFrom;

    private String activated;

    private boolean statusValid;

    private LocalDate expiryDate;

    private String description;

    public Contract(Integer id, Integer customerId, Integer dealerId, Integer productId, String type, String status, LocalDate validFrom, String activated, boolean statusValid, LocalDate expiryDate, String description) {
        this.id = id;
        this.customerId = customerId;
        this.dealerId = dealerId;
        this.productId = productId;
        this.type = type;
        this.status = status;
        this.validFrom = validFrom;
        this.activated = activated;
        this.statusValid = statusValid;
        this.expiryDate = expiryDate;
        this.description = description;
    }

    public Contract() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    public boolean isStatusValid() {
        return statusValid;
    }

    public void setStatusValid(boolean statusValid) {
        this.statusValid = statusValid;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
