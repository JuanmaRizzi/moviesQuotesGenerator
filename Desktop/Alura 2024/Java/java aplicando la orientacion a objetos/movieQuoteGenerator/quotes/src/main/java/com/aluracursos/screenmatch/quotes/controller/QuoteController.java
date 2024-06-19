package com.aluracursos.screenmatch.quotes.controller;


import com.aluracursos.screenmatch.quotes.dto.QuoteDTO;
import com.aluracursos.screenmatch.quotes.model.Quote;
import com.aluracursos.screenmatch.quotes.repository.QuoteRepository;
import com.aluracursos.screenmatch.quotes.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @Autowired
    private QuoteService service;


    @GetMapping("/series/frases")
/* en ingles, metodo hecho pór mi; español hecho por la profe
    public Quote show(Long id){
         id =(long)(Math.random() * 10) + 1;

        return service.selectById(Long.valueOf(id));

    }
 */

    // em esáñol hecho por la profe
    public QuoteDTO obtenerFraseAleatoria(){
       return  service.obtenerFraseAleatoria();

    }
}
