package com.example.designPatterns.chainOfResponsibility;

import lombok.Setter;


public class Colonnello extends Militare {


    public Colonnello(String ruolo, int stipendio, Militare next) {
        super(ruolo, stipendio, next);
    }

    @Override
    public void percepiscoImporto( int importo) {
        if (stipendio >= importo) {
            System.out.println("Il " + ruolo + " percepisce almeno " + importo + " come stipendio!"+ " (" + stipendio + ")");
            this.next( importo );
        } else {
            this.next( importo );
        }
    }
}
