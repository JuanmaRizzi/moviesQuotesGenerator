package com.aluracursos.screenmatch.quotes.repository;

import com.aluracursos.screenmatch.quotes.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Long> {



    @Query("SELECT q FROM Quote q WHERE q.id = :id")
     Quote selectById(Long id);

@Query("SELECT q FROM Quote q ORDER BY FUNCTION('RANDOM') LIMIT 1")
public Quote obtenerFrases();
}
