package com.occ.invoice.controller;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.occ.invoice.model.Client;
import com.occ.invoice.repository.ClientRepository;

@RestController
//@RequestMapping("/client")
public class ClientRestController {

	@Autowired
    ClientRepository clientRepository;

	
	
	  @PostMapping("/clients") public Client createClient(@Valid @RequestBody
	  Client client) { System.out.println(client.toString()); return
	  clientRepository.save(client); }
	 
	
    @GetMapping("/getclients")
    public Page<Client> getClients(Pageable pageable) {
        return clientRepository.findAll(pageable);
    }
    
    
	@GetMapping("/bulkcreate")
	public String bulkcreate(){
	// save a single Customer
		clientRepository.save(new Client("RKS", "Natapally","8280000062","Fax-0", "Email-test@nic.in", "gst-1234"));
	// save a list of Customers
		clientRepository.saveAll(Arrays.asList(new Client("RKS", "Natapally","8280000062","Fax-0", "Email-test@nic.in", "gst-1234")
	                       , new Client("ABC", "Natapally","8280000062","Fax-0", "Email-test@nic.in", "gst-1234")
	                       , new Client("XYZ", "Natapally","8280000062","Fax-0", "Email-test@nic.in", "gst-1234")
	                       , new Client("PQR", "Natapally","8280000062","Fax-0", "Email-test@nic.in", "gst-1234")));
	return "Clients are created";
	}
}
