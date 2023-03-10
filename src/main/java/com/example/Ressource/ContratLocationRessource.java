package com.example.Ressource;

import com.example.Model.ContratLocation;
import com.example.Service.ContratLocationServiceImpl;
import org.bson.Document;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

public class ContratLocationRessource {

    @Inject
    ContratLocationServiceImpl contratLocationServiceImpl;

    //GET – Fetch All Users api/contratLocation
    @Path("api/contratLocation")
    @GET
    public List<ContratLocation> list() {
        return contratLocationServiceImpl.list();
    }

    //Create User: api/contratLocation
    @Path("api/contratLocation/add")
    @POST
    public List<ContratLocation> add(ContratLocation contratLocation) {
        contratLocationServiceImpl.add(contratLocation);
        return list();
    }

    //GET - User by ID : api/contratLocation/{id}
    @Path("api/contratLocation/{id}")
    @GET
    public Document getById(ContratLocation contratLocation) {
        return contratLocationServiceImpl.getContratLocationById(contratLocation);
    }

    //DELETE : api/contratLocation/{id}
    @Path("api/contratLocation/{id}")
    @GET
    public void deleteById(ContratLocation contratLocation) {
        contratLocationServiceImpl.deleteContratLocationById(contratLocation);
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
