package com.example.Ressource;

import com.example.Model.Entreprise;
import com.example.Service.EntrepriseService;
import org.bson.Document;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

public class EntrepriseRessource {


    @Inject
    EntrepriseService entrepriseService;

    //GET – Fetch All Users api/entreprises
    @Path("api/entreprises")
    @GET
    public List<Entreprise> list() {
        return entrepriseService.list();
    }

    //Create User: api/entreprise
    @Path("api/entreprise/add")
    @POST
    public List<Entreprise> add(Entreprise entreprise) {
        entrepriseService.add(entreprise);
        return list();
    }

    //GET - User by ID : api/entreprise/{id}
    @Path("api/entreprise/{id}")
    @GET
    public Document getById(Entreprise entreprise) {
        return entrepriseService.getClientById(entreprise);
    }

    //DELETE : api/client/{id}
    @Path("api/entreprise/{id}")
    @GET
    public void deleteById(Entreprise entreprise) {
        entrepriseService.deleteClientById(entreprise);
    }

    //PUT – Edit Client api/client
    /**
     @PUT
     @Path("/{id}")
     public Entreprise put(@PathParam("id") ObjectId id, Entrprise entreprise) {
     if (entreprise.findById(id) == null) {
     throw new EntrpriseErrorException();
     }
     return entreprise.update(new Entreprise(id, entreprise.getNom(), entreprise.get(), client.getSexe(), client.getAge(), client.getAdresse(), client.getMail(), client.getMdp()));
     }
     **/


}
