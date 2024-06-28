package com.pappe.summer_internship.contract;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContractRepository extends JpaRepository<Contract, Integer> {

    Optional<Contract> findContractById(Integer id);

    void deleteContractById(Integer id);

}
