package com.example.Model;

import org.bson.types.ObjectId;

public class Entreprise {

    private ObjectId id;
    private int NumeroSiret;
    private String nom;
    private String compteBancaireIBAN ;
    private String adresse;
    private int telRepresentantLegal;

    public Entreprise(int numeroSiret, String nom, String compteBancaireIBAN, String adresse, int telRepresentantLegal) {
        NumeroSiret = numeroSiret;
        this.nom = nom;
        this.compteBancaireIBAN = compteBancaireIBAN;
        this.adresse = adresse;
        this.telRepresentantLegal = telRepresentantLegal;
    }

    public Entreprise() {
    }


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getNumeroSiret() {
        return NumeroSiret;
    }

    public void setNumeroSiret(int numeroSiret) {
        NumeroSiret = numeroSiret;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCompteBancaire() {
        return compteBancaireIBAN;
    }

    public void setCompteBancaire(String compteBancaire) {
        this.compteBancaireIBAN = compteBancaire;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelRepresentantLegal() {
        return telRepresentantLegal;
    }

    public void setTelRepresentantLegal(int telRepresentantLegal) {
        this.telRepresentantLegal = telRepresentantLegal;
    }
}
