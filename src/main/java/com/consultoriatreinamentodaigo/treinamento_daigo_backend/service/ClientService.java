package com.consultoria.trainingmanagerbackend.service;

import com.consultoria.trainingmanagerbackend.model.Client;
import com.consultoria.trainingmanagerbackend.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }
}