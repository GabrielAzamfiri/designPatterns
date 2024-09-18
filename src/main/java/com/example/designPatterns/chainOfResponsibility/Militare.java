package com.example.designPatterns.chainOfResponsibility;


import lombok.Getter;

@Getter
public abstract class Militare {
    protected String ruolo;
    protected int stipendio;
    protected Militare next;


    public Militare(String ruolo, int stipendio, Militare next) {
        this.ruolo = ruolo;
        this.stipendio = stipendio;
        this.next = next;
    }
    public Militare(String ruolo, int stipendio) {
        this.ruolo = ruolo;
        this.stipendio = stipendio;

    }

    public abstract void percepiscoImporto( int importo);

    public void next( int importo) {
        if (this.next != null) { // Se non siamo ancora alla fine della catena andiamo al prossimo filtro
            this.next.percepiscoImporto( importo); // <-- Richiamiamo il prossimo filtro
        } else { // Siamo arrivati alla fine della catena
            System.out.println("Siamo arrivati alla fine della catena");
        }
    }
}
