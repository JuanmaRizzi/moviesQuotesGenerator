package com.aluracursos.screenmatch.quotes.service;


import com.aluracursos.screenmatch.quotes.dto.QuoteDTO;
import com.aluracursos.screenmatch.quotes.model.Quote;
import com.aluracursos.screenmatch.quotes.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository repository;

    public Quote selectById(Long id) {
        return  repository.selectById(id);
    }

    public QuoteDTO obtenerFraseAleatoria() {
        Quote frase= repository.obtenerFrases();
        return new QuoteDTO(frase.getTitle(), frase.getQuote(), frase.getAuthor(), frase.getPoster());
    }
}
