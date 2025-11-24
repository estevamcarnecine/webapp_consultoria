package com.consultoria.trainingmanagerbackend.repository;

import com.consultoria.trainingmanagerbackend.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    
}