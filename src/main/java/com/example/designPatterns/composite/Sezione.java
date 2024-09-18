package com.example.designPatterns.composite;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;
@ToString
@AllArgsConstructor
public class Sezione implements Pagine{
    private List<Pagina> paginaList;
    private List<Sezione> sottoSezioni;





    public void addPagina(Pagina pagina){
        paginaList.add(pagina);
    }

    @Override
    public int getNumeroPagine() {
        int totalePagine=paginaList.size();
        for(Sezione sezione :sottoSezioni){
            totalePagine += sezione.getNumeroPagine();

    }
        return totalePagine;
    }

    @Override
    public void stampa() {
        System.out.println("Il numero di pagine della sezione è " + getNumeroPagine() );

    }
}
