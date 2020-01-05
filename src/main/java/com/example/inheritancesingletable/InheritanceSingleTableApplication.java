package com.example.inheritancesingletable;

import com.example.inheritancesingletable.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InheritanceSingleTableApplication {

    private final IDatabase iDatabase;

    public InheritanceSingleTableApplication(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public static void main(String[] args) {
        SpringApplication.run(InheritanceSingleTableApplication.class, args);
    }
    @Bean
    public CommandLineRunner runner(){
        return args -> {
            iDatabase.createTable();
        };
    }
}
