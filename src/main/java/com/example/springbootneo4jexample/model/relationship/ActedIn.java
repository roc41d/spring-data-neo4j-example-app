package com.example.springbootneo4jexample.model.relationship;

import com.example.springbootneo4jexample.model.node.Movie;
import com.example.springbootneo4jexample.model.node.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RelationshipEntity(type = "ACTED_IN")
public class ActedIn {

    @Id
    @GeneratedValue
    Long id;

    @StartNode
    Person person;
    @EndNode
    Movie movie;
}
