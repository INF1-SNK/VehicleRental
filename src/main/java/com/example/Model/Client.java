package com.example.Model;

import org.bson.types.ObjectId;


public class Client {

    private ObjectId id;
    private String nom;
    private String prenom;
    private Enum<Sexe> sexe;
    private int age;
    private String adresse;
    private String mail;
    private String mdp;
    private String nomCB;
    private int numeroBancaire;
    private int codeCVV;

    public Client(String nom, String prenom, Enum<Sexe> sexe, int age, String adresse, String mail, String mdp, String nomCB, int numeroBancaire, int codeCVV) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        this.adresse = adresse;
        this.mail = mail;
        this.mdp = mdp;
        this.nomCB = nomCB;
        this.numeroBancaire = numeroBancaire;
        this.codeCVV = codeCVV;
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

    public String getNomCB() {
        return nomCB;
    }

    public void setNomCB(String nomCB) {
        this.nomCB = nomCB;
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

    public enum Sexe {M, F}
}
