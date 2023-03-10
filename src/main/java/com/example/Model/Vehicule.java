package com.example.Model;

import org.bson.types.ObjectId;

import java.time.Year;

public class Vehicule {

    private ObjectId id;
    private String nom;
    private String marque;
    private String modele;
    private Year annee;
    private float prix;
    private float kilometrage;
    private Enum<EtatLocation> etat;
    private Enum<TypeVehicule> type;
    public Vehicule(String nom, String marque, String modele, Year annee, float prix, float kilometrage, Enum<EtatLocation> etat, Enum<TypeVehicule> type) {
        this.nom = nom;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
        this.kilometrage = kilometrage;
        this.etat = etat;
        this.type = type;
    }

    public ObjectId getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Year getAnnee() {
        return annee;
    }

    public void setAnnee(Year annee) {
        this.annee = annee;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(float kilometrage) {
        this.kilometrage = kilometrage;
    }

    public Enum<EtatLocation> getEtat() {
        return etat;
    }

    public void setEtat(Enum<EtatLocation> etat) {
        this.etat = etat;
    }

    public Enum<TypeVehicule> getType() {
        return type;
    }

    public void setType(Enum<TypeVehicule> type) {
        this.type = type;
    }

    public enum EtatLocation {LOUER, NON_LOUER}

    public enum TypeVehicule {SUV, UTILITAIRE, FOURGONNETTE, VOITURE}
}
