package com.example.demo.repository;

import com.example.demo.entity.Person;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, ObjectId> {

    List<Person> findAll();
}
