package org.example;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    public void printGame() {
        ArrayList<Game> myGames = new ArrayList<>();

        Game souls = new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Xbox 1", "Microsoft Windows")),
                "Dark Souls III", LocalDate.of(2016, 3, 24),"FromSoftware, Inc",
                Arrays.asList("Action RPG","Action-Adventure"),new BigDecimal("59.99"),"M",87);
        myGames.add(souls);
        Game kerbal = new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Xbox 1", "Microsoft Windows"
                ,"Linux","Classic Mac OS","Wii U")),
                "Kerbal Space Program", LocalDate.of(2011, 6, 24),"Squad",
                Arrays.asList("Indie","Simulation","Space Flight Simulator"), new BigDecimal("39.99"),"E",75);
        myGames.add(kerbal);
        Game star = new Game(new ArrayList<String>(Arrays.asList("Microsoft Windows")),"Stardew Valley",
                LocalDate.of(2016, 2, 26),"ConcernedApe",
                Arrays.asList("Role Playing","Simulation"),new BigDecimal("14.99"),"E 10",90);
        myGames.add(star);
        Game duck = new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Microsoft Windows", "Nintendo Switch")),"Duck Game",
                LocalDate.of(2014, 5, 13),"Adult Swim",
                Arrays.asList("Platform","Shooter","Indie"),new BigDecimal("12.99"),"E 10",85);
        myGames.add(duck);
        for (int i = 0; i < myGames.size(); i++){
            myGames.get(i).printGame();
        }
    }





    /*
    public static void main(String[] args) {
        Game g1;
        Game g2;
        Game g3;
        Game g4;
        g1 = new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Xbox 1", "Microsoft Windows")),"Dark Souls III",
                LocalDate.of(2016, 3, 24),"FromSoftware, Inc",
                Arrays.asList("Action RPG","Action-Adventure"),new BigDecimal("59.99"),"M");
        g2 = new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Xbox 1", "Microsoft Windows","Linux","Classic Mac OS","Wii U")),
                "Kerbal Space Program", LocalDate.of(2011, 6, 24),"Squad",
                Arrays.asList("Indie","Simulation","Space Flight Simulator"), new BigDecimal("39.99"),"E");
        g3 = new Game(new ArrayList<String>(Arrays.asList("Microsoft Windows")),"Stardew Valley",
                LocalDate.of(2016, 2, 26),"ConcernedApe",
                Arrays.asList("Role Playing","Simulation"),new BigDecimal("14.99"),"E 10");
        g4 = new Game(new ArrayList<String>(Arrays.asList("PlayStation 4", "Microsoft Windows", "Nintendo Switch")),"Duck Game",
                LocalDate.of(2014, 5, 13),"FromSoftware, Inc",
                Arrays.asList("Platform","Shooter","Indie"),new BigDecimal("12.99"),"E 10");
    }
    */

}
