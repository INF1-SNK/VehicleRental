package com.example.Service;

import com.example.Model.Client;
import com.example.Model.Entreprise;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.bson.conversions.Bson;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class EntrepriseService {
    @Inject
    MongoClient mongoClient;

    //GET – Fetch All client api/student
    public List<Entreprise> list(){
        List<Entreprise> list = new ArrayList<>();
        MongoCursor cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = (Document) cursor.next();
                Entreprise entreprise = new Entreprise();
                entreprise.setNom(document.getString("nom"));
                entreprise.setAdresse(document.getString("adresse"));
                entreprise.setCompteBancaire(document.getString("compteBancaire"));
                entreprise.setNumeroSiret(document.getInteger("numeroSiret"));

                list.add(entreprise);
            }
        } finally {
            cursor.close();
        }
        return list;
    }

    //POST - Create User: api/student
    public void add(Client client){
        Document document = new Document()
                .append("noms", client.getNom())
                .append("prenoms", client.getPrenom())
                .append("age", client.getAge())
                .append("sexe", client.getSexe())
                .append("adresse", client.getAdresse())
                .append("mail", client.getMail())
                .append("mdp", client.getMdp());

        getCollection().insertOne(document);
    }

    //GET - User by ID : api/student/{id}
    public Document getClientById(Client client) {
        Bson id = eq("_id", client.getId());
        Document document = (Document) getCollection().find(id).first();
        return document;
    }

    public void deleteClientById(Client client) {
        Bson id = eq("_id", client.getId());
        getCollection().deleteOne(id);
    }





    private MongoCollection getCollection(){
        return mongoClient.getDatabase("client").getCollection("client");
    }

}
