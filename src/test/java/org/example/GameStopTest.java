package org.example;

import org.junit.Test;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;

public class GameStopTest{

    @Test
    public void printGameStopStock() throws IOException{
        Stock gme = YahooFinance.get("GME");
        System.out.println(gme.getQuote().getPrice());
    }
}
