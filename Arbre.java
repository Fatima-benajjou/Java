package org.example.Exercices;

public class Arbre extends Plante {


    private final double circonf;

    public Arbre(String nom, double hauteur, String couleur, double circonf) {
        super(nom, hauteur, couleur);
        this.circonf = circonf;
    }

    @Override
    public String toString() {
        return  "Arbre{" + super.toString() +
                "circonf=" + circonf +
                '}';
    }

}
