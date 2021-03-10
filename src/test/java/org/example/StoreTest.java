package org.example;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class StoreTest {

    @Test
    public void testCSVToGames() throws IOException {
        URL url = new URL("https://pastebin.com/raw/KKMcjbTt");
        InputStream in = url.openStream();
        String csv = IOUtils.toString(in,"UTF-8");
        String[] lines = csv.split("\n");
        Assert.assertEquals(6,lines.length);

        String line = lines[0];
        //platform, name, date, publisher, genre, price, rating, score
        String[] words = line.split(",");
        List<String> platform = Arrays.asList(words[0].split(";"));
        String name = words[1];
        String[] temp = words[2].split("/");
        LocalDate date = LocalDate.of(Integer.parseInt(temp[2]),
                Integer.parseInt(temp[1]), Integer.parseInt(temp[0]));
        String publisher = words[3];
        List<String> genres = Arrays.asList(words[4].split(";"));
        BigDecimal price = new BigDecimal("" + words[5]);
        String rating = words[6];
        int score = Integer.parseInt(words[7]);
        Game game = new Game(platform, name, date, publisher, genres, price, rating, score);
    }
}
