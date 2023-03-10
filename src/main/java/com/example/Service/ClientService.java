package com.example.Service;

import com.example.Model.Client;
import org.bson.Document;

import java.util.InvalidPropertiesFormatException;
import java.util.List;

public interface ClientService {
    List<Client> list();
<<<<<<< Updated upstream

    void add(Client client);

=======
    void add(Client client) throws InvalidPropertiesFormatException;
>>>>>>> Stashed changes
    Document getClientById(Client client);

    void deleteClientById(Client client);
}
