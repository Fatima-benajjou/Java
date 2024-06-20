package org.example.Exercices;

import java.time.LocalDate;
import java.util.Date;

public class Film {
    private String titre;
    private String realisateur;
    private LocalDate dateSortie;
    private String genre;

    public Film () {};

    public Film(String titre, String realisateur, LocalDate dateSortie, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.dateSortie = dateSortie;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", dateSortie=" + dateSortie +
                ", genre='" + genre + '\'' +
                '}';
    }
}
