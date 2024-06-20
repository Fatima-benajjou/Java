package org.example.Exercices;

public class Joueur {
    private String nom;
    private Integer niveau;
    private int pointExp;

    public Joueur() {
    }


    public Joueur(String nom, Integer niveau, int pointExp) {
        this.nom = nom;
        this.niveau = niveau;
        this.pointExp = pointExp;
    }

    public String getNom() {
        return nom;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public int getPointExp() {
        return pointExp;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

    public void setPointExp(int pointExp) {
        this.pointExp = pointExp;
    }

    // Méthode  pour ajouter 10 point d'expérience
    public void effectuerUneQuete() {
        pointExp += 10;
    }

    public void niveauSup() {
        if (pointExp >= 100) {
            niveau = niveau + 1;
            pointExp = 0;
        }
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                ", pointExp=" + pointExp +
                '}';
    }
}








