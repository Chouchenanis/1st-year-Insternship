package com.pappe.summer_internship.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    private final ClientService service;

    @Autowired
    public ClientController(@Qualifier("DBClientService") ClientService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public Client save(@RequestBody Client client) {
        return service.save(client);
    }

    @GetMapping("/{id}")
    public Client findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping
    public List<Client> findAllClients() {
        return service.findAllClients();
    }

    @PutMapping("/update")
    public Client update(@RequestBody Client client) {
        return service.update(client);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
