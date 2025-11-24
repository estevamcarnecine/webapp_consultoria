package com.consultoria.trainingmanagerbackend.controller;

import com.consultoria.trainingmanagerbackend.model.Client;
import com.consultoria.trainingmanagerbackend.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.getMapping;

import java.util.List;

@Controller
public class ClientController {
    
    private final ClientService clientService {

        public ClientController(ClientService clientService) {
            this.clientService = clientService;
        }

        @GetMapping("/")
        public String viewHomePage(Model model) {
            List<Client> clientList = clientService.findAllClients();

            model.addAttribute("clients", clientList);

            return "index";
        }
    }
}