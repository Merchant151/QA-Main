package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Inventory {

    ArrayList<Game> inventory = new ArrayList<Game>();

    /**
     * No arg constructor default inventory constructor
     */
    public Inventory(){

    }

    /**
     *
     * This constructs the initial inventory which is just a list of games
     *
     * @param inventory this is the list of games for the inventory
     */
    public Inventory(ArrayList<Game> inventory){
        this.inventory = inventory;
    }

    /**
     *  Adds Game object to inventory
     * @param g a Game Object
     */
    public void add(Game g){
        inventory.add(g);
    }

    /**
     * Remove Game object from inventory this will only remove the <b>first</b> instance of the ojbect that occurs in the list
     * @param g
     */
    public void remove(Game g){
        inventory.remove(g);
    }

    /**
     * Gets the cheapest (in terms of price) game in the inventory. if more than one game have the cheapest price, the
     * Latest game that was added to the inventory with the cheapest prcie is returned
     * Also the inventory has to be NON-EPMPTY!
     *
     * @return cheapest game of the lowest price
     */
    public Game findCheapestGame(){
        BigDecimal price = inventory.get(0).getPrice();
        Game highest = inventory.get(0);
        for(Game g: inventory) {
            if(highest.getPrice().compareTo(g.getPrice()) >= 0){
                highest = g;
            }
        }
        return highest;
    }

    /**
     *
     * If more than one game has the highest score, then the game that was added latest
     * (with the highest score) is returned
     *
     * @return returns Game with the highest score
     */
    public Game findmostHighlyRatedGame(){
        Game highest = inventory.get(0);
        for(Game g: inventory) {
            if(highest.getScore() <= g.getScore()){
                highest = g;
            }
        }
        return highest;
    }

    /*public void printAveragePriceOfAllGames(){
        for(Game g: inventory){
            g.printGame();
        }
    } */
    public int getSize(){
        return inventory.size();
    }

    /**
     *  Returns the average price of all games in the inventory
     * @return average price of games in inventory
     */
    public BigDecimal getAveragePriceOfAllGames() {
        BigDecimal total = new BigDecimal("0");
        for(Game g: inventory){
            total = total.add(g.getPrice());

        }
        return total.divide(new BigDecimal(inventory.size() + ""));
    }

    /**
     *  Print to console the average price of all games in inventory
     */
    public void printAveragePriceOfAllGames(){
        System.out.println(getAveragePriceOfAllGames());
    }

}
