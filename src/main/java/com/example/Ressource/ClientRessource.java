package com.example.Ressource;

import com.example.Model.Client;
import com.example.Service.ClientService;
import org.bson.Document;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import java.util.List;


public class ClientRessource {

    @Inject
    ClientService clientService;

    //GET – Fetch All Users api/student
    @Path("api/client")
    @GET
    public List<Client> list() {
        return clientService.list();
    }

    //Create User: api/client
    @Path("api/client/add")
    @POST
    public List<Client> add(Client client) {
        clientService.add(client);
        return list();
    }

    //GET - User by ID : api/client/{id}
    @Path("api/client/{id}")
    @GET
    public Document getById(Client client) {
        return clientService.getClientById(client);
    }

    //DELETE : api/client/{id}
    @Path("api/client/{id}")
    @GET
    public void deleteById(Client client) {
        clientService.deleteClientById(client);
    }

    //PUT – Edit Client api/client

}
