package org.example;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 *
 *
 * Represents a video game object
 *
 *
 */
public class Game {

    private List<String> platform;
    private String name;
    private LocalDate date;
    private String developer;
    private List<String> genre;
    private BigDecimal price;
    private String rating;

    public Game() {
    }

    public Game(List<String> platform, String name, LocalDate date, String developer, List<String> genre, BigDecimal price, String rating) {
        this.platform = platform;
        this.name = name;
        this.date = date;
        this.developer = developer;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public List<String> getPlatform() {
        return platform;
    }

    public void setPlatform(List<String> platform) {
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void printGame(){
        System.out.println(platform);
        System.out.println(name);
        System.out.println(date);
        System.out.println(developer);
        System.out.println(genre);
        System.out.println(price);
        System.out.println(rating);
    }
}
