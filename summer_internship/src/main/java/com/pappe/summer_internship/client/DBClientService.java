package com.pappe.summer_internship.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("DBClientService")
public class DBClientService implements ClientService {

    private final ClientRepository repository;

    @Autowired
    public DBClientService(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Client save(Client client) {
        return repository.save(client);
    }

    @Override
    public List<Client> findAllClients() {
        return repository.findAll();
    }

    @Override
    public Client findById(Integer id) {
        Optional<Client> optionalClient = repository.findById(id);
        return optionalClient.orElseThrow(() -> new RuntimeException("Client not found with id " + id));
    }

    @Override
    public Client update(Integer id ,Client client) {
        if (!repository.existsById(id)){
            throw new RuntimeException("Client not found with id " + client.getId());
        }
        client.setId(id) ;
        return repository.save(client);
    }

    @Override
    public void deleteById(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Client not found with id " + id);
        }
        repository.deleteById(id);
    }
}
