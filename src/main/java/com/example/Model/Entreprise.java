package com.example.Model;

import org.bson.types.ObjectId;

public class Entreprise {

    private ObjectId id;
    private int NumeroSiret;
    private String nom;
    private InformationBancaire compteBancaire ;
    private String adresse;
    private int telRepresentantLegal;

    public Entreprise(int numeroSiret, String nom, InformationBancaire compteBancaire, String adresse, int telRepresentantLegal) {
        NumeroSiret = numeroSiret;
        this.nom = nom;
        this.compteBancaire = compteBancaire;
        this.adresse = adresse;
        this.telRepresentantLegal = telRepresentantLegal;
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

    public InformationBancaire getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(InformationBancaire compteBancaire) {
        this.compteBancaire = compteBancaire;
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
