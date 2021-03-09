package org.example;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Utilities method for Stonk info such as price, etc.
 */
public class StonkUtility {
    /**
     * Returns price of a Stonk given a ticker
     * @param ticker string value of ticker
     * @return current price of Stonk
     */
    public static BigDecimal getCurrentPriceOfStonk(String ticker) {
        Stock stock;
        try {
            stock = YahooFinance.get(ticker);
        }catch (IOException e){
            throw new RuntimeException("Stonk could not be retrieved");
        }
        return stock.getQuote().getPrice();
    }
}
