package com.company;

import java.util.Date;

public class News {
    String titre;
    Integer idJournaliste;
    String contenu;
    Date datePubli;
    String nomAuteur;
    Integer facteurConfiance;
    String tags;

    public News(String titre, Integer idJournaliste, String contenu, Date datePubli, String nomAuteur, Integer facteurConfiance, String tags) {
        this.titre = titre;
        this.idJournaliste = idJournaliste;
        this.contenu = contenu;
        this.datePubli = datePubli;
        this.nomAuteur = nomAuteur;
        this.facteurConfiance = facteurConfiance;
        this.tags = tags;
    }

    public String getTitre() {
        return titre;
    }

    public Integer getIdJournaliste() {
        return idJournaliste;
    }

    public String getContenu() {
        return contenu;
    }

    public Date getDatePubli() {
        return datePubli;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public Integer getFacteurConfiance() {
        return facteurConfiance;
    }

    public String getTags() {
        return tags;
    }
}


