package org.example.Exercices;

public class Chaise {
    private int nbPied =4;
    private String materiaux = "bois";
    private String couleur = "vert";
    private double prix;

    public Chaise(int nbPied, String materiaux, String couleur, double prix) {
        this.nbPied = nbPied;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;
    }

public Chaise () {}

    @Override
    public String toString () {
        return (" Je suis une chaise avec " +nbPied+ " pieds en chaine de couleur bleu à un prix de " +prix);

    }
}
