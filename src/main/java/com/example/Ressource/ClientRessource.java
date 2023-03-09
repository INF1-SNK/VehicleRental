package com.example.Ressource;

import com.example.Model.Client;
import com.example.Service.ClientService;
import org.bson.Document;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClientRessource {

    @Inject
    ClientService clientService;

    //GET – Fetch All Users api/client
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
    /**
    @PUT
    @Path("/{id}")
    public Client put(@PathParam("id") ObjectId id, Client client) {
        if (client.findById(id) == null) {
            throw new ClientErrorException();
        }
        return client.update(new Client(id, client.getNom(), client.getPrenom(), client.getSexe(), client.getAge(), client.getAdresse(), client.getMail(), client.getMdp()));
    }
    **/

}
