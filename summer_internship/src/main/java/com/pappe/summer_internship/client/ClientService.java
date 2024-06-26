package com.pappe.summer_internship.client;

import java.util.List;

public interface ClientService {

    Client save(Client c);

    List<Client> findAllClients();

    Client findById(Integer id);

    Client update(Integer id ,Client c);

    void deleteById(Integer id);
}
