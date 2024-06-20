package org.example.Exercices;

import java.util.ArrayList;
import java.util.List;

public abstract class CompteBancaire {

    protected double solde;
    protected Client client;
    protected List<Operation> liste_operation ;


    public CompteBancaire(double solde, Client client) {
        this.solde = solde;
        this.client = client;
        this.liste_operation = new ArrayList<>();
    }

    public double getSolde() {
        return solde;
    }

    public Client getClient() {
        return client;
    }

    public List<Operation> getListe_operation() {
        return liste_operation;
    }

    public void ajouterOperation (Operation nouvelleOperation) {
        liste_operation.add(nouvelleOperation);

    }

    public void supprimerOperation (Operation suppressionOp) {
        liste_operation.remove(suppressionOp) ;
    }
}
