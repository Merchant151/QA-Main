package org.example;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 *
 *
 * Represents a video game object for video game such as PC games consoles games mobile games, etc.
 * This class will be used in a retro-game collection or online game store.
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
    private int score;

    public Game() {
    }

    /**
     *  Constructor that requires you to enter relevant information of a Game
     *
     * @param platform a {@code List} of platforms of the game, e.g. PC, PS5, switch, etc
     * @param name the name of the game
     * @param date the released (the day, month and year) of a game
     * @param developer the developer of the game
     * @param genre a { List} of genres of a game, e.g. rpg, action, puzzle, etc
     * @param price the price of the game as a floating point value represented as a {@code BigDecimal}
     * @param rating the rating of a game, e.g. PG, M, E, etc
     * @param score a number of 0 to 100 that indicates how good a game is
     */
    public Game(List<String> platform, String name, LocalDate date, String developer, List<String> genre, BigDecimal price, String rating, int score) {
        this.platform = platform;
        this.name = name;
        this.date = date;
        this.developer = developer;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    /**
     *  This Method sprints the info of a game object
     *
     */
    public void printGame(){
        System.out.println(platform);
        System.out.println(name);
        System.out.println(date);
        System.out.println(developer);
        System.out.println(genre);
        System.out.println(price);
        System.out.println(rating);
        System.out.println(score);
    }
}
