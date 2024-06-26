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

    public Client update(Integer id, Client c) {
            var clientIndex = IntStream.range(0, clients.size())
                    .filter(i -> clients.get(i).getId().equals(id))
                    .findFirst()
                    .orElse(-1);
            if (clientIndex >= 0) {
                c.setId(id);
                Client existingClient = clients.get(clientIndex);
                existingClient.setLastname(c.getLastname());
                existingClient.setEmail(c.getEmail());
                existingClient.setCivilState(c.getCivilState());
                existingClient.setPhone(c.getPhone());
                existingClient.setUpdateDate(c.getUpdateDate());
                return existingClient;
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
