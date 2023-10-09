package com.springboot.WebApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titles, anons, full_text;
    private int views;
    public Post(String titles, String anons, String full_text){
        this.titles = titles;
        this.anons = anons;
        this.full_text = full_text;
    }
    public Post(){}

}
