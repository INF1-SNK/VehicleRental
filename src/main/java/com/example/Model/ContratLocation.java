package com.example.Model;

import org.bson.types.ObjectId;

import java.util.Date;

public class ContratLocation {

    private ObjectId id;
    private Date dateDebut;
    private Date dateFin;

    private Vehicule vehicule;
    private float montantTotal;
    private int montantPenalite;
    private Client client;
    private Entreprise entreprise;


    public ContratLocation(Date dateDebut, Date dateFin, float montantTotal, int montantCrediter, Client client, Entreprise entreprise, Vehicule v) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.montantTotal = montantTotal;
        this.montantPenalite = montantCrediter;
        this.client = client;
        this.entreprise = entreprise;
        this.vehicule = v;
    }

    public ContratLocation() {
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public float getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(float montantTotal) {
        this.montantTotal = montantTotal;
    }


    public int getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(int montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public ObjectId getId() {
        return id;
    }
}
