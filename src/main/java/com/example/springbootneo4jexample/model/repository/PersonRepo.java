package com.example.springbootneo4jexample.model.repository;

import com.example.springbootneo4jexample.model.node.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonRepo extends Neo4jRepository<Person, Long> {
}
