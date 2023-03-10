package com.example.Service;

import com.example.Model.Entreprise;
import org.bson.Document;

import java.util.List;

public interface EntrepriseService {

    List<Entreprise> list();

    void add(Entreprise entreprise);

    Document getEntrepriseById(Entreprise entreprise);

    void deleteEntrepriseById(Entreprise entreprise);

    double getProfitsFirstMonths();

    double getProfitsLastMonths();
}
