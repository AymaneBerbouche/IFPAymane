package com.company;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CollectNews {

    public void ReadIdNews(String nom, String tags,List<News> listNews) {
        for (News n : ListNews) {
            if (n.getNomAuteur() == nom){ System.out.println("Titre: " + n.getTitre() + " IdJournaliste: " + n.getIdJournaliste() + " Contenu: " + n.getContenu() + " Date publication: " + n.getDatePubli() + "Nom Auteur: " + n.getNomAuteur() + "facteur confiance: " + n.getFacteurConfiance()); }
            if (n.getNomAuteur() == tags){ System.out.println("Titre: " + n.getTitre() + " IdJournaliste: " + n.getIdJournaliste() + " Contenu: " + n.getContenu() + " Date publication: " + n.getDatePubli() + "Nom Auteur: " + n.getNomAuteur() + "facteur confiance: " + n.getFacteurConfiance());}
        }
    }
}