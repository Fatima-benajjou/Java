package org.example.Exercices;

public class WaterTank {
    private String nom;
    private double poids = 10;
    private double capaciteMax = 2000;
    private double niveauRemp = 0;
    private double totalCiterne;

    public WaterTank() {
    }

    ;

    public WaterTank(String nom, double poids, double capaciteMax, double niveauRemp) {
        this.nom = nom;
        this.poids = poids;
        this.capaciteMax = capaciteMax;
        this.niveauRemp = niveauRemp;
    }

    public String getNom() {
        return nom;
    }

    public double getCapaciteMax() {
        return capaciteMax;
    }


    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getNiveauRemp() {
        return niveauRemp;
    }

    public void setNiveauRemp(double niveauRemp) {
        this.niveauRemp = niveauRemp;
    }

    public double getTotalPoidCiterne() {
        return poids+niveauRemp;
    }



    public void remplir(double ajoutEau) {
        niveauRemp += ajoutEau;
        System.out.println("nouveau niveau d'eau est " +niveauRemp+ " pour " +nom);
    }

    public void vider(double retireEau) {
        niveauRemp -= retireEau;
        System.out.println("nouveau niveau d'eau est " +niveauRemp+ " pour " +nom);
    }

    public void controle() {
        if (niveauRemp > capaciteMax) {
            System.out.println("Capacité Maximal déspassé");
        }


        //else {niveauRemp < 0;
        // System.out.println( "Le volume d'eau ne peut pas être négatif");


    }

    @Override
    public String toString() {
        return "WaterTank{" +
                "nom='" + nom + '\'' +
                ", poids=" + poids +
                ", capaciteMax=" + capaciteMax +
                ", niveauRemp=" + niveauRemp +
                ", totalCiterne=" + totalCiterne +
                '}';
    }
}
