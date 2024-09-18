package com.example.designPatterns.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Autore autore1 = new Autore("Diego", "Basili");
        Autore autore2 = new Autore("Arianna", "Grande");
        List<Autore> listaAutori = new ArrayList<>();
        listaAutori.add(autore1);
        listaAutori.add(autore2);

        Libro libro= new Libro(listaAutori,30);

        Pagina pagina1 = new Pagina();

        Sezione sezione = new Sezione(List.of(pagina1,pagina1,pagina1,pagina1,pagina1,pagina1,pagina1,pagina1,pagina1,pagina1));
        Sezione sezione2 = new Sezione(List.of(pagina1,pagina1,pagina1,pagina1,pagina1,pagina1,pagina1));

        libro.setSezioneList(List.of(sezione,sezione,sezione,sezione,sezione2,sezione2));

        System.out.println("Il Libro ha " + libro.getTotalePagine() + " pagine!");
    }
}
