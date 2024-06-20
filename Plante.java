package org.example.Exercices;

public class Plante {
    private String nom;
    private double hauteur;
    private String couleur;

    public Plante(String nom, double hauteur, String couleur) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Plante{" +
                "nom='" + nom + '\'' +
                ", hauteur=" + hauteur +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
