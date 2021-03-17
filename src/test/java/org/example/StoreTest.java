package org.example;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import yahoofinance.Stock;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class StoreTest {

    private Store gamestop;
    @Before
    public void loadStore(){
        gamestop = new Store();
        gamestop.loadInventoryFromWeb("https://pastebin.com/raw/UnZQxLJL");
    }
    @Test
    public void testLoadInventory(){
        //Store gamestop = new Store();
        //gamestop.loadInventoryFromWeb("https://pastebin.com/raw/UnZQxLJL");
        Assert.assertEquals(6,gamestop.getInventory().getSize());
    }

    @Test
    public void testFindCHeapestGame(){
        Game g = gamestop.getInventory().findCheapestGame();
        //g.printGame();
        //gamestop.getInventory().inventory.get(3).printGame();
        Assert.assertEquals(gamestop.getInventory().inventory.get(4),g);
    }

    @Test
    public void testFindMostExpensiveGame(){
        Game g = gamestop.getInventory().findMostExpensiveGame();
        Assert.assertEquals(gamestop.getInventory().inventory.get(5),g);
    }

    @Test
    public void testGetAveragePriceOfAllGames(){
        // (59.99 + 59.99 + 59.99 + 60 + 20 + 60) / 6 = 53.33
        MathContext m = new MathContext(4);
        BigDecimal x = gamestop.getInventory().getAveragePriceOfAllGames();
        //System.out.println("" + x);
        Assert.assertEquals(new BigDecimal(""+53.33),x);
    }

    @Test
    public void testCSVToGames() throws IOException {
        URL url = new URL("https://pastebin.com/raw/UnZQxLJL");
        InputStream in = url.openStream();
        String csv = IOUtils.toString(in, "UTF-8");
        String[] lines = csv.split("\n");
        Assert.assertEquals(6, lines.length);

        for (int i = 0; i < lines.length; i++){
            Game g = Store.getGameFromLine(lines[i]);
            g.printGame();
        }
        //game.printGame();
    }
}
