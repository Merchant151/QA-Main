package org.example;

import java.math.BigDecimal;

/**
 * Class represents a "Stonk" with a ticker and a price
 */
public class Stonk {
    private String ticker;
    private BigDecimal price;
    private int shares;
    /**
     * construct a Stonk object with a ticker
     * @param gme ticker as a string
     */
    public Stonk(String ticker){
        this.ticker = ticker;
    }

    /**
     * Create Stonk object woth ticker, price and number of shares
     * @param ticker string for Stonk
     * @param price represents price of Stonk
     * @param shares Number of shares
     */
    public Stonk(String ticker, BigDecimal price, int shares) {
        this.ticker = ticker;
        this.price = price;
        this.shares = shares;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
