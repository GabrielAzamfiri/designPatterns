package com.example.designPatterns.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Libro {
    private List<Autore> autoreList;
    private int prezzo;
    private List<Sezione> sezioneList;


    public Libro(List<Autore> autoreList, int prezzo) {
        this.autoreList = autoreList;
        this.prezzo = prezzo;
    }

    public int getTotalePagine(){
        int totale = 0;
        for (Sezione sezione :sezioneList) {
          totale +=  sezione.getNumeroPagine();
        }
        return totale;
    }
}
