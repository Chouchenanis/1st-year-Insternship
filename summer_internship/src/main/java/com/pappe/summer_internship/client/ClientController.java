package com.pappe.summer_internship.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    @GetMapping
    public List<Client> findAllClients(){
        return List.of(
            new Client(
                    "Anis",
                    "Chouchene",
                    LocalDate.now(),
                    "chouchenanis998@gmail.com",
                    21
            ),
            new Client(
                    "Anis",
                    "Chouchene",
                    LocalDate.now(),
                    "chouchenanis998@gmail.com",
                    21
                )
        );
    }
}
