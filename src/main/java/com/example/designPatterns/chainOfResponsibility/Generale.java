package com.example.designPatterns.chainOfResponsibility;

import lombok.Setter;


public class Generale extends Militare  {


    public Generale(String ruolo, int stipendio) {
        super(ruolo, stipendio);
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
