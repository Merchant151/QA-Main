package org.example;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import yahoofinance.Stock;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class StoreTest {

    @Test
    public void testLoadInventory(){
        Store gamestop = new Store();
        gamestop.loadInventoryFromWeb("https://pastebin.com/raw/UnZQxLJL");
        Assert.assertEquals(6,gamestop.getInventory().getSize());
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
