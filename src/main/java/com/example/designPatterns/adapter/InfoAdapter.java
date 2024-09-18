package com.example.designPatterns.adapter;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
@AllArgsConstructor
public class InfoAdapter implements DataSource{
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Period period = Period.between(info.getDataDiNascita(), LocalDate.now());
        return period.getYears();
    }
}
