package com.example.designPatterns.composite;

import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class Sezione implements Pagine{
    private List<Pagina> paginaList;





    public void addPagina(Pagina pagina){
        paginaList.add(pagina);
    }

    @Override
    public int getNumeroPagine() {
        return paginaList.size();
    }
}
