package com.example.Ressource;

import com.example.Model.Client;
import com.example.Service.ClientService;
import org.bson.Document;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("client")
public class ClientRessource {

    @Inject
    ClientService clientService;

    //GET – Fetch All Users api/client
    @Path("list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> list() {
        return clientService.list();
    }

    //Create User: api/client
    @Path("new")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Client> add(Client client) {
        clientService.add(client);
        return list();
    }

    //GET - User by ID : api/client/{id}
    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Document getById(Client client) {
        return clientService.getClientById(client);
    }

    //DELETE : api/client/{id}
    @Path("remove/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteById(Client client) {
        clientService.deleteClientById(client);
    }

    //PUT – Edit Client api/client

    @PUT
    @Path("/{id}")
    public Client put(@PathParam("id") ObjectId id, Client client) {
        Client finalClient = null;
        for (Client c : clientService.list()) {
            if (c.getId().equals(id)) finalClient = c;
        }
        if (finalClient == null) {
            throw new ClientErrorException(Response.Status.valueOf("not found"));
        }
        clientService.deleteClientById(finalClient);
        finalClient = client;
        clientService.add(finalClient);
        return finalClient;
    }

}
