package com.example.springbootneo4jexample.util;

public class CypherQueries {

    public static final String GET_MOVIES = "" +
            " match (m:Movie) " +
            " return m limit $limit";
    public static final String GET_MOVIE = "" +
            " match (m:Movie {name: $title})" +
            " return m";
    public static final String GET_ACTOR = "" +
            " match (p:Person {name: $name})" +
            " return p";
    public static final String GET_ACTORS = "" +
            " match (p:Person)" +
            " return p" +
            " limit $limit";
    public static final String GET_ACTOR_MOVIES = "" +
            " match (p:Person {name: $name})-[:ACTED_IN]->(m:Movie)" +
            " return {p, collect(m)}";
}
