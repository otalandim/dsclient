package com.devsuperior.dsclient.controllers;

import com.devsuperior.dsclient.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
        List<Client> list = new ArrayList<>();
        list.add(new Client(1L, "José da Silva", "09876543565", 3000.00, null, 2));
        return ResponseEntity.ok().body(list);
    }
}
