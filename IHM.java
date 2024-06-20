package org.example.Exercices;

import java.util.Scanner;

public class IHM {
    private static Scanner scanner = new Scanner(System.in);
    public static void affichageMenuPrin () {
        System.out.println("=== Menu Principal ===");
        System.out.println("1. Lister les comptes bancaires");
        System.out.println("2. Créer un compte bancaire");
        System.out.println("3. Effectuer un dépot");
        System.out.println("4. Effectuer un retrait");
        System.out.println("5. Afficher les opérations et le solde");
        System.out.println("0. Quitter le programme");
    }

    public static int choixUser() {
        int n;
        System.out.println("entrez un choix : ");

        n = scanner.nextInt();
        return n ;

        }
        public static void listerCompte () {
        
        }

        public static void affichageCreationCompte () {
            System.out.println("""
        === Creation Compte ===
        1 . Créer un compte Courant 
        2 . Créer un compte épargne
        3 . Créer un compte payant
        """);
        }

public static void affichageListeComptes (Client clientUser) {
    System.out.println("Votre Liste de comptes : "
    +clientUser.getListeCompte());
}

}

