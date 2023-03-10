package com.example.Service;

import com.example.Model.Client;
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
public class ClientServiceImpl implements ClientService {

    @Inject
    MongoClient mongoClient;

    //GET – Fetch All client api/student
    public List<Client> list() {
        List<Client> list = new ArrayList<>();
        MongoCursor cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = (Document) cursor.next();
                Client client = new Client();
                client.setNom(document.getString("noms"));
                client.setPrenom(document.getString("prenoms"));
                client.setAge(document.getInteger("age"));
                client.setSexe((Enum) document.get("sexe"));
                client.setAdresse(document.getString("adresse"));
                client.setMail(document.getString("mail"));
                client.setMdp(document.getString("mdp"));
                client.setNomCB(document.getString("nomCB"));
                client.setNumeroBancaire(document.getInteger("numeroBancaire"));
                client.setCodeCVV(document.getInteger("codeCVV"));
                list.add(client);
            }
        } finally {
            cursor.close();
        }
        return list;
    }

    //POST - Create User: api/student
    public void add(Client client) {
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


    private MongoCollection getCollection() {
        return mongoClient.getDatabase("client").getCollection("client");
    }

}
