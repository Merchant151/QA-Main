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
     *
     * @param ticker string value of ticker
     * @return current price of Stonk
     */
    public static BigDecimal getCurrentPriceOfStonk(String ticker) {
        Stock stock;
        try {
            stock = YahooFinance.get(ticker);
        } catch (IOException e) {
            throw new RuntimeException("Stonk could not be retrieved");
        } catch (NullPointerException e) {
            return new BigDecimal(""+0.0);
        }
        try {
            return stock.getQuote().getPrice();
        }catch (Exception e){//lol
            return new BigDecimal(""+0.0);
        }
    }

    /**
     * Grab the current (latest) price of a stonk given the ticker
     *
     * @param ticker the stonk ticker as a double
     */
    public static double getPriceOfStonk(String ticker) {
        double price = 0;
        try {
            Stock stock = YahooFinance.get(ticker);
            price = stock.getQuote().getPrice().doubleValue();
        } catch (IOException e) {
            throw new RuntimeException("Stonk data could not be retrived!");
        } catch (NullPointerException e) {
            return 0; //indicate that Stonk does not exist
        }
        return price;

    }
}
