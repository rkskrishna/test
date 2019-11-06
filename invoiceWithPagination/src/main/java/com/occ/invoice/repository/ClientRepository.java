package com.occ.invoice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.occ.invoice.model.Client;

public interface ClientRepository  extends  CrudRepository <Client, Long>{
    //List<Client> findByClient_id(String client_id);
	Page<Client> findAll(Pageable pageable);
}

