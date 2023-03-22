package com.random.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Randomness {

    @Id
    @GeneratedValue
    private Long id;
    private String phrase;
    private String photo;

    public Long getId() {
        return id;
    }

    public Randomness() {
    }

    public Randomness(String phrase, String photo) {
        this.phrase = phrase;
        this.photo = photo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
