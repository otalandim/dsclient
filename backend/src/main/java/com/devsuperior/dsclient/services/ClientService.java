package com.devsuperior.dsclient.services;

import com.devsuperior.dsclient.dto.ClientDTO;
import com.devsuperior.dsclient.entities.Client;
import com.devsuperior.dsclient.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientDTO> findAll() {
        List<Client> list = clientRepository.findAll();
        return list.stream().map(l -> new ClientDTO(l)).collect(Collectors.toList());
    }
}
