package com.example.Service;

import com.example.Model.Client;
import com.example.Model.ContratLocation;
import org.bson.Document;

import java.util.List;

public interface ContratLocationService {

    List<ContratLocation> list();
    void add(ContratLocation contratLocation);
    Document getContratLocationById(ContratLocation contratLocation);
    void deleteContratLocationById(ContratLocation contratLocation);
}
