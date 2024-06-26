package com.pappe.summer_internship.client;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryClientService implements ClientService {

    private final InMemoryClientDao dao;

    public InMemoryClientService(InMemoryClientDao dao) {
        this.dao = dao;
    }

    @Override
    public Client save(Client c) {
        return dao.save(c);
    }

    @Override
    public Client findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public Client update(Integer id ,Client c) {
        return dao.update(id,c);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Client> findAllClients() {
        return dao.findAllClients();
    }
}

