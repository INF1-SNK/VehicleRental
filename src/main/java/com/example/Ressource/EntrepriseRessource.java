package com.example.Ressource;

import com.example.Model.Entreprise;
import com.example.Service.EntrepriseServiceImpl;
import org.bson.Document;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("entreprise")
public class EntrepriseRessource {


    @Inject
    EntrepriseServiceImpl entrepriseServiceImpl;

    //GET – Fetch All Users api/entreprises
    @Path("list")
    @GET
    public List<Entreprise> list() {
        return entrepriseServiceImpl.list();
    }

    //Create User: api/entreprise
    @Path("new")
    @POST
    public List<Entreprise> add(Entreprise entreprise) {
        entrepriseServiceImpl.add(entreprise);
        return list();
    }

    //GET - User by ID : api/entreprise/{id}
    @Path("{id}")
    @GET
    public Document getById(Entreprise entreprise) {
        return entrepriseServiceImpl.getEntrepriseById(entreprise);
    }

    //DELETE : api/client/{id}
    @Path("remove/{id}")
    @GET
    public void deleteById(Entreprise entreprise) {
        entrepriseServiceImpl.deleteEntrepriseById(entreprise);
    }

    //PUT – Edit Client api/client
    /**
     @PUT
     @Path("/{id}")
     public Entreprise put(@PathParam("id") ObjectId id, Entrprise entreprise) {
     if (entreprise.findById(id) == null) {
     throw new EntrpriseErrorException();
     }
     return entreprise.update(new Entreprise(client.getNumeroSiret(), entreprise.getNom(), entreprise.getCompteBnacaireIBAN(), client.getadresse(), client.getNumeroSiret(), client.getAdresse(), client.gettelRepresantantLegal()));
     }
     **/


}
