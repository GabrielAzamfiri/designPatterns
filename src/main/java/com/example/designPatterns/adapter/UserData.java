package com.example.designPatterns.adapter;

import lombok.Getter;

import java.security.PrivateKey;
@Getter
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
