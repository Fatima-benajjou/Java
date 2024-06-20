package org.example.Exercices;

import javax.sql.RowSet;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
   /* public static void main(String[] args) {
        Chaise chaise1 = new Chaise (4, "chaine", " bleu", 14.4);
        Chaise chaise2 = new Chaise (3, "bambou", " gris", 130.99);
        Chaise chaise3 = new Chaise (1, "métal", " orange", 76.25);

        System.out.println(chaise1.toString());
        System.out.println(chaise2.toString());
        System.out.println(chaise3.toString());
    }*/

   /* public static void main(String[] args) {
        Film film1 = new Film("La Haine", "Mathieu Kassovitz", LocalDate.of(1995,05,31), "Drame");
        Film film2 = new Film("Avatar 2", "James Cameron", LocalDate.of(2022,12,14), "Action");

        System.out.println(film1);
        System.out.println(film2);
    }*/

    /*public static void main(String[] args) {
        Joueur joueur1 = new Joueur("Toto", 1 , 10);
        Joueur joueur2 = new Joueur("Tota", 2 , 101);
        Joueur joueur3 = new Joueur("Toti", 3 , 1002);

        joueur1.effectuerUneQuete();
        System.out.println(joueur1);

        joueur2.niveauSup();
        System.out.println(joueur2);

        joueur3.niveauSup();
        System.out.println(joueur3);

        System.out.println(" Le joueur " +joueur1.getNom()+ " effectue la quête " +joueur1.getNiveau());

    }*/

    /*public static void main(String[] args) {
        WaterTank citerne1 = new WaterTank("Watertank1",10, 1000, 1000);
        WaterTank citerne2 = new WaterTank("Watertank2",10, 1000, 200);
        citerne1.remplir(100);
        //citerne1.vider(20);
        //citerne1.controle();
        citerne1.getTotalPoidCiterne();
        System.out.println(citerne1);
    }*/

    /*public static void main(String[] args) {

        public class Main {
            public static void main(String[] args) {WaterTank watertank2 = new WaterTank(10, 10, 5); // fillLevel, MaxCapacity,weightLevel

                System.out.println("Poids total de la citerne 1 : " + watertank1.getTotalWeight());
                System.out.println("Poids total de la citerne 2 : " + watertank2.getTotalWeight());

                System.out.println("----------------------");

                System.out.println("Quantité d'eau dans la citerne 1 : " + watertank1.getFillLevel());
                watertank1.affichageCiterne();
                System.out.println("Quantité d'eau dans la citerne 2 : " + watertank2.getFillLevel());
                watertank2.affichageCiterne();
                System.out.println("Quantité d'eau dans toutes les citernes : " + WaterTank.getTotalFillLevels());

                System.out.println("----------------------");

                int excessWater = watertank1.fill(11);
                System.out.println("Quantité d'eau dans la citerne 1 après ajout de 11 litres: " + watertank1.getFillLevel() + "/" + watertank1.getMaxCapacity());
                System.out.println("Excès d'eau récupéré : " + excessWater);

                int waterTaken = watertank2.empty(11);
                System.out.println("Quantité d'eau dans la citerne 2 après tentative de retrait de 11 litres: " + watertank2.getFillLevel() + "/" + watertank2.getMaxCapacity());
                System.out.println("Quantité d'eau récupérée : " + waterTaken);

                System.out.println("----------------------");

                System.out.println("Quantité d'eau dans la citerne 1 : " + watertank1.getFillLevel());
                watertank1.affichageCiterne();
                System.out.println("Quantité d'eau dans la citerne 2 : " + watertank2.getFillLevel());
                watertank2.affichageCiterne();
                System.out.println("Quantité d'eau dans toutes les citernes : " + WaterTank.getTotalFillLevels());
            }
        }
    }*/

    /*public static void main(String[] args) {
        Plante plante1 = new Plante("Rose", 8.5, "Rouge") ;
        Plante plante2 = new Plante("Tulipe", 5, "Jaune") ;
        System.out.println(plante1);
        System.out.println(plante2);

        Arbre arbre1 = new Arbre("Olivier", 10,"vert", 10);
        System.out.println( arbre1);
    }

     */

    public static void main(String[] args) {

        Client client1 = new Client(1, "Dupont", "Martin",  "0606060606") ;
        client1.ajoutCompteBancaire(TypeCompte.PAYANT, 1000);
        IHM.affichageMenuPrin();
        //IHM.choixUser();

        switch (IHM.choixUser()) {
            case 1 -> IHM.affichageListeComptes (client1);
            case 2 -> IHM.affichageCreationCompte();
        }
























    }
}
