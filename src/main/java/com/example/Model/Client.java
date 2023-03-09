package com.example.Model;

import org.bson.types.ObjectId;

public class Client {

    public enum Sexe { M, F }

    private ObjectId id;
    private String nom;
    private String prenom;
    private Enum<Sexe> sexe;
    private int age;
    private String adresse;
    private String mail;
    private String mdp;



    public Client(String nom, String prenom, Enum<Sexe> sexe, int age, String adresse, String mail, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        this.adresse = adresse;
        this.mail = mail;
        this.mdp = mdp;
    }

    public Client() {
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Enum getSexe() {
        return sexe;
    }

    public void setSexe(Enum<Sexe> sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public ObjectId getId() {
        return id;
    }
}
