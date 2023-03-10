package com.example.Service;

import com.example.Model.Client;
import com.example.Model.ContratLocation;
import com.example.Model.Entreprise;
import com.example.Model.Vehicule;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.bson.conversions.Bson;

import javax.inject.Inject;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class ContratLocationServiceImpl implements ContratLocationService {

    @Inject MongoClient mongoClient;

    //GET – Fetch All Contrat api/contrats
    public List<ContratLocation> list(){

        List<ContratLocation> list = new ArrayList<>();

        MongoCursor cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = (Document) cursor.next();
                ContratLocation contratLocation = new ContratLocation();
                contratLocation.setDateDebut(document.getDate("dateDebut"));
                contratLocation.setDateFin(document.getDate("dateFin"));
                contratLocation.setVehicule((Vehicule) document.get("vehicule"));
                contratLocation.setEntreprise((Entreprise) document.get("entreprise"));
                contratLocation.setClient((Client) document.get("client"));
                contratLocation.setMontantTotal(document.getInteger("montantTotal"));
                contratLocation.setMontantPenalite(document.getInteger("montantPenalite"));

                list.add(contratLocation);
            }
        } finally {
            cursor.close();
        }
        return list;
    }

    //POST - Create User: api/student
    public void add(ContratLocation contratLocation){
        Document document = new Document()
                .append("dateDebut", contratLocation.getDateDebut())
                .append("dateFin", contratLocation.getDateFin())
                .append("vehicule", contratLocation.getVehicule())
                .append("montantTotal", computeAmount(contratLocation.getDateDebut(), contratLocation.getDateDebut(), contratLocation.getVehicule()));

        getCollection().insertOne(document);
    }

    //GET - ContratLocation by ID : api/contratLocation/{id}
    public Document getContratLocationById(ContratLocation contratLocation) {
        Bson id = eq("_id", contratLocation.getId());
        Document document = (Document) getCollection().find(id).first();
        return document;
    }

    public void deleteContratLocationById(ContratLocation contratLocation) {
        Bson id = eq("_id", contratLocation.getId());
        getCollection().deleteOne(id);
    }


    //Function

    private float computeAmount(Date dateDebut, Date dateFin, Vehicule v){
        float amount = computeDifferenceBetweenDateInDays(dateDebut, dateFin) * v.getPrix();
        return amount;
    }

    public int computeDifferenceBetweenDateInDays(Date dateDebut, Date dateFin) {
        int differenceInDays = (int) ChronoUnit.DAYS.between((Temporal) dateDebut, (Temporal) dateFin);
        return differenceInDays;
    }
    private MongoCollection getCollection(){
        return mongoClient.getDatabase("client").getCollection("client");
    }

}
