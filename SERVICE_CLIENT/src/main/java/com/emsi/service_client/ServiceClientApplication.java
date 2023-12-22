package com.emsi.service_client;

import com.emsi.service_client.Entity.Client;
import com.emsi.service_client.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
    }


    @Bean
    CommandLineRunner initializeH2Database(ClientRepository clientRepository){
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "SOUMAYA EL OUALID", Float.parseFloat("23")));
            clientRepository.save(new Client(Long.parseLong("2"), "SOUMAYA ELD", Float.parseFloat("15")));
            clientRepository.save(new Client(Long.parseLong("3"), " EL OUALID SOUMAYA", Float.parseFloat("16")));
        };
    }

}
