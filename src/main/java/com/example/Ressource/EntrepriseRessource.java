package com.example.Ressource;

import com.example.Model.Entreprise;
import com.example.Service.EntrepriseService;
import org.bson.Document;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("entreprise")
public class EntrepriseRessource {


    @Inject
    EntrepriseService entrepriseService;

    //GET – Fetch All Users api/entreprises
    @Path("list")
    @GET
    public List<Entreprise> list() {
        return entrepriseService.list();
    }

    //Create User: api/entreprise
    @Path("new")
    @POST
    public List<Entreprise> add(Entreprise entreprise) {
        entrepriseService.add(entreprise);
        return list();
    }

    @Path("profits/first-months")
    @GET
    public double getProfitFirstTwoMonths() {
        return entrepriseService.getProfitsFirstMonths();
    }

    @Path("profits/last-months")
    @GET
    public double getProfitLastTwoMonths() {
        return entrepriseService.getProfitsLastMonths();
    }

    //GET - User by ID : api/entreprise/{id}
    @Path("{id}")
    @GET
    public Document getById(Entreprise entreprise) {
        return entrepriseService.getEntrepriseById(entreprise);
    }

    //DELETE : api/entreprise/{id}
    @Path("remove/{id}")
    @GET
    public void deleteById(Entreprise entreprise) {
        entrepriseService.deleteEntrepriseById(entreprise);
    }

    //PUT – Edit Entreprise api/entreprise
    /**
     @PUT
     @Path("/{id}") public Entreprise put(@PathParam("id") ObjectId id, Entrprise entreprise) {
     if (entreprise.findById(id) == null) {
     throw new EntrpriseErrorException();
     }
     return entreprise.update(new Entreprise(client.getNumeroSiret(), entreprise.getNom(), entreprise.getCompteBnacaireIBAN(), client.getadresse(), client.getNumeroSiret(), client.getAdresse(), client.gettelRepresantantLegal()));
     }
     **/


}
