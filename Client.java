package org.example.Exercices;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    private int identifiant;
    private String nom;
    private String prenom;
    private List<CompteBancaire> listeCompte ; //Private listeCompte []  // Arrays.toString(new String[3];
 private String telephone;

    public Client(int identifiant, String nom, String prenom, String telephone) {
        this.identifiant= identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.listeCompte = new ArrayList<>();
        this.telephone = telephone;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<CompteBancaire> getListeCompte() {
        return listeCompte;
    }

    public String getTelephone() {
        return telephone;
    }

    public void ajoutCompteBancaire (TypeCompte type, double montant ) {


        switch (type){
            case PAYANT -> listeCompte.add(new ComptePayant(montant,this)) ;
            case COURANT -> listeCompte.add(new CompteCourant(montant,this)) ;
            case EPARGNE ->  listeCompte.add(new CompteEpargne(montant,this));
        }


    }

}

