package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class InventoryTest {

    @Test
    public void testEmptyInventory(){

    }

    @Test
    public void testAddInventory() {

    }

    @Test
    public void testRemoveInventory(){

    }

    @Test
    public void testCheapestGame(){
        Game g =new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Microsoft Windows", "Nintendo Switch")),"Duck Game",
                LocalDate.of(2014, 5, 13),"Adult Swim",
                Arrays.asList("Platform","Shooter","Indie"),new BigDecimal("12.99"),"E 10",85);
        Game g2 = new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Xbox 1", "Microsoft Windows"
                ,"Linux","Classic Mac OS","Wii U")),
                "Kerbal Space Program", LocalDate.of(2011, 6, 24),"Squad",
                Arrays.asList("Indie","Simulation","Space Flight Simulator"), new BigDecimal("39.99"),"E",75);
        Inventory inv = new Inventory();
        inv.add(g);
        inv.add(g2);
        Assert.assertEquals(2,inv.getSize());
        Game cheapest = inv.findCheapestGame();
        Assert.assertNotNull(cheapest);
        Assert.assertEquals(new BigDecimal("12.99"),cheapest.getPrice());
    }

    @Test
    public void testGameScore() {
        Game g =new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Microsoft Windows", "Nintendo Switch")),"Duck Game",
                LocalDate.of(2014, 5, 13),"Adult Swim",
                Arrays.asList("Platform","Shooter","Indie"),new BigDecimal("12.99"),"E 10",85);
        Game g2 = new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Xbox 1", "Microsoft Windows"
                ,"Linux","Classic Mac OS","Wii U")),
                "Kerbal Space Program", LocalDate.of(2011, 6, 24),"Squad",
                Arrays.asList("Indie","Simulation","Space Flight Simulator"), new BigDecimal("39.99"),"E",75);
        Inventory inv = new Inventory();
        inv.add(g);
        inv.add(g2);
        Assert.assertTrue(inv.findmostHighlyRatedGame().equals(g));
    }
    @Test
    public void testAveragePrice() {
        Game g =new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Microsoft Windows", "Nintendo Switch")),"Duck Game",
                LocalDate.of(2014, 5, 13),"Adult Swim",
                Arrays.asList("Platform","Shooter","Indie"),new BigDecimal("10"),"E 10",85);
        Game g2 = new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Xbox 1", "Microsoft Windows"
                ,"Linux","Classic Mac OS","Wii U")),
                "Kerbal Space Program", LocalDate.of(2011, 6, 24),"Squad",
                Arrays.asList("Indie","Simulation","Space Flight Simulator"), new BigDecimal("20"),"E",75);
        Inventory inv = new Inventory();
        inv.add(g);
        inv.add(g2);
        BigDecimal average = inv.getAveragePriceOfAllGames();
        Assert.assertEquals(new BigDecimal("15"),average);

    }
}
