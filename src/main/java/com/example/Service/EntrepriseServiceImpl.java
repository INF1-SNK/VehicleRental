package com.example.Service;

import com.example.Model.Entreprise;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.bson.conversions.Bson;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

@ApplicationScoped
public class EntrepriseServiceImpl implements EntrepriseService {
    @Inject
    MongoClient mongoClient;

    //GET – Fetch All client api/entreprise
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

    //POST - Create User: api/entreprise
    public void add(Entreprise entreprise){
        Document document = new Document()
                .append("nom", entreprise.getNom())
                .append("numeroSiret", entreprise.getNumeroSiret())
                .append("adresse", entreprise.getAdresse())
                .append("telRepresentantLegal", entreprise.getTelRepresentantLegal())
                .append("compteBancaireIBAN", entreprise.getCompteBancaire());

        getCollection().insertOne(document);
    }

    //GET - User by ID : api/entreprise/{id}
    public Document getEntrepriseById(Entreprise entreprise) {
        Bson id = eq("_id", entreprise.getId());
        Document document = (Document) getCollection().find(id).first();
        return document;
    }

    public void deleteEntrepriseById(Entreprise entreprise) {
        Bson id = eq("_id", entreprise.getId());
        getCollection().deleteOne(id);
    }

    @Override
    public double getProfitsFirstMonths() {
        return 0;
    }

    @Override
    public double getProfitsLastMonths() {
        return 0;
    }

    private MongoCollection getCollection(){
        return mongoClient.getDatabase("client").getCollection("client");
    }

}
