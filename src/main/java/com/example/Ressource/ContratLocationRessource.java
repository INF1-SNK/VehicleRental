package com.example.Ressource;

import com.example.Model.Client;
import com.example.Model.ContratLocation;
import com.example.Service.ClientService;
import com.example.Service.ContratLocationService;
import org.bson.Document;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

public class ContratLocationRessource {

    @Inject
    ContratLocationService contratLocationService;

    //GET – Fetch All Users api/contratLocation
    @Path("api/contratLocation")
    @GET
    public List<ContratLocation> list() {
        return contratLocationService.list();
    }

    //Create User: api/contratLocation
    @Path("api/contratLocation/add")
    @POST
    public List<ContratLocation> add(ContratLocation contratLocation) {
        contratLocationService.add(contratLocation);
        return list();
    }

    //GET - User by ID : api/contratLocation/{id}
    @Path("api/contratLocation/{id}")
    @GET
    public Document getById(ContratLocation contratLocation) {
        return contratLocationService.getContratLocationById(contratLocation);
    }

    //DELETE : api/contratLocation/{id}
    @Path("api/contratLocation/{id}")
    @GET
    public void deleteById(ContratLocation contratLocation) {
        contratLocationService.deleteContratLocationById(contratLocation);
    }

    //PUT – Edit Client api/contratLocation/{id}
    /**
    @PUT
    @Path("/{id}")
    public ContratLocation put(@PathParam("id") ObjectId id, ContratLocation contratlocation) {
        if (contratlocation.findById(id) == null) {
            throw new ContratlocationErrorException();
        }
        return contratlocation.update(new ContratLocation(id, contratlocation.getDateDebut(), contratlocation.getDateFin(), contratlocation.getVehicule(), contratlocation.getMontantTotal(), contratlocation.getMontantPenalite());
    } **/
}
