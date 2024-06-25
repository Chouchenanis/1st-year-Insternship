package com.pappe.summer_internship.client;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryClientDao {

    private final List<Client> clients = new ArrayList<>();

    public Client save(Client c) {
        clients.add(c);
        return c;
    }

    public Client findById(Integer id) {
        return clients.stream()
                .filter(c -> c.getId().equals(id)).
                findFirst()
                .orElse(null);
    }

    public Client update(Client c) {
        var clientIndex = IntStream.range(0, clients.size())
                .filter(i -> clients.get(i).getId().equals(c.getId()))
                .findFirst()
                .orElse(-1);
        if (clientIndex > -1) {
            clients.set(clientIndex, c);
            return c;
        }
        return null;
    }

    public void deleteById(Integer id) {
        var client = findById(id);
        if (client != null) {
            clients.remove(client);
        }
    }

    public List<Client> findAllClients() {
        return clients;
    }
}
