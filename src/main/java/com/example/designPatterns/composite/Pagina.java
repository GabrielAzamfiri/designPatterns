package com.example.designPatterns.composite;

public class Pagina implements Pagine{
    private int nrPagina;

    public Pagina() {
        this.nrPagina = 1;
    }


    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("La pagina è solo una");
    }
}
