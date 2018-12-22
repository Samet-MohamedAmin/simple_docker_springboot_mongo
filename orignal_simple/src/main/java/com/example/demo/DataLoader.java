package com.example.demo;


import com.example.demo.repository.PersonRepository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    
    final static Logger logger = Logger.getLogger(DataLoader.class);

    // @Autowired
    // PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        // logger.info("hello");
        // Person person = Person.builder()
        //                         .firstName("Good")
        //                         .lastName("Person")
        //                         .build();
        // logger.info(person);
        // logger.info("saving instance");
        // personRepository.save(person);
        // logger.info("persistance test");
        // List<Person> personsResult = personRepository.findAll();
        // logger.info(personsResult);

    }
}
