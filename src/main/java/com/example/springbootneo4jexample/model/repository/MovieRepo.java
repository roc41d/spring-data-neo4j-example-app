package com.example.springbootneo4jexample.model.repository;

import com.example.springbootneo4jexample.model.node.Movie;
import com.example.springbootneo4jexample.util.CypherQueries;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

public interface MovieRepo extends Neo4jRepository<Movie, Long> {

    @Query(value = CypherQueries.GET_MOVIE)
    Movie getMovieByTile(@Param("title") String tile);
}
