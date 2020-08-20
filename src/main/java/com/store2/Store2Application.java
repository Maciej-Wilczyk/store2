package com.store2;

import model.Magazine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.NoRepositoryBean;

@SpringBootApplication

public class Store2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Store2Application.class, args);
    }
    @Autowired
    MagazineRepository magazineRepository;
    @Override
    public void run(String... args) throws Exception {
        this.magazineRepository.save(new Magazine("Fruits"));
        this.magazineRepository.save(new Magazine("Vegetables"));
        this.magazineRepository.save(new Magazine("Meat"));
    }
}
