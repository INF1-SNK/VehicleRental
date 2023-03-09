package com.example.Model;

import org.bson.types.ObjectId;

public class InformationBancaire {

    private ObjectId id;
    private String nom;
    private int numeroBancaire;
    private int codeCVV;


    public InformationBancaire(String nom, int numeroBancaire, int codeCVV) {
        this.nom = nom;
        this.numeroBancaire = numeroBancaire;
        this.codeCVV = codeCVV;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumeroBancaire() {
        return numeroBancaire;
    }

    public void setNumeroBancaire(int numeroBancaire) {
        this.numeroBancaire = numeroBancaire;
    }

    public int getCodeCVV() {
        return codeCVV;
    }

    public void setCodeCVV(int codeCVV) {
        this.codeCVV = codeCVV;
    }
}
