package com.example.springbootneo4jexample.model.repository;

import com.example.springbootneo4jexample.model.relationship.ActedIn;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ActedInRepo extends Neo4jRepository<ActedIn, Long> {
}
