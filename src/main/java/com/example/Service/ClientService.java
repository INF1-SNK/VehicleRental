package com.example.Service;

import com.example.Model.Client;
import org.bson.Document;

import java.util.List;

public interface ClientService {
    List<Client> list();

    void add(Client client);

    Document getClientById(Client client);

    void deleteClientById(Client client);
}
