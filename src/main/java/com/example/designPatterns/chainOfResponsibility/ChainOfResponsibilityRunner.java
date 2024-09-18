package com.example.designPatterns.chainOfResponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainOfResponsibilityRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Generale generale = new Generale("Generale", 5000);
        Colonnello colonnello= new Colonnello("Colonnello", 4000,generale);
        Maggiore maggiore  = new Maggiore("Maggiore", 3000,colonnello);
        Capitano capitano = new Capitano("Capitano", 2000,maggiore);
        Tenente tenente = new Tenente("Tenente", 1000,capitano);


        tenente.percepiscoImporto(3500);
    }
}
