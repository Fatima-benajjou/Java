package org.example.Exercices;

public class Operation {
    private int numero;
    private double montant;
    private Statut statutDepotRetrait;

    public Operation(int numero, double montant, Statut statutDepotRetrait) {
        this.numero = numero;
        this.montant = montant;
        this.statutDepotRetrait = statutDepotRetrait;
    }
}
