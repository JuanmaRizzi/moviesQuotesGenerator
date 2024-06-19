package com.aluracursos.screenmatch.quotes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie_quotes")
public class Quote {
    @Id
   private Long id;
    private String title;
    public String quote;
    public  String author;
    public String  poster;

    public Quote() {
    }

    public Quote(Long id, String title, String quote, String author, String poster) {
        this.id = id;
        this.title = title;
        this.quote = quote;
        this.author = author;
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }



    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
