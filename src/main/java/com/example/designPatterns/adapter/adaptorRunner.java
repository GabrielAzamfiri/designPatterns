package com.example.designPatterns.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class adaptorRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        Info info = new Info("Diego", "Basili", LocalDate.of(1994, 5, 22));
        DataSource dataSource = new InfoAdapter(info);
        UserData userData = new UserData();
        userData.getData(dataSource);


        System.out.println(userData.getNomeCompleto() + " ha " + userData.getEta() + " anni!");

    }

}
