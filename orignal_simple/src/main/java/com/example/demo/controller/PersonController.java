package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;


@RestController
@RequestMapping(path = "/api/person", produces = "application/json")
class PersonController {

    @Autowired
    PersonRepository personRepository;

    /*
     * person mapping
     */
    @GetMapping(path="/get")
    public ResponseEntity<List<Person>> findAll() {
        List<Person> personsList = personRepository.findAll();
        return new ResponseEntity<List<Person>>(personsList, HttpStatus.OK);
    }
}