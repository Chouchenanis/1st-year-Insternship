package com.pappe.summer_internship.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    private final ClientService service;

    @Autowired
    public ClientController(@Qualifier("DBClientService") ClientService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public Client save(@Valid @RequestBody Client client) {
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

    @PutMapping("/update/{id}")
    public Client update(@PathVariable Integer id ,@Valid @RequestBody Client client) {
        return service.update(id,client);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
