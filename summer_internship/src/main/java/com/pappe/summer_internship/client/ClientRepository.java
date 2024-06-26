package com.pappe.summer_internship.client;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Optional<Client> findById(Integer id);

    void deleteById(Integer id);
}
