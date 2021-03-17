package org.example;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents the portfolio of Stonks
 */
public class Portfolio {

    private List<Stonk> stonks = new ArrayList<>();

    /**
     * Need default constructor for serialization
     */
    public Portfolio() {
    }


    /**
     * Adds Stonk to the portfolio
     *
     * @param stonk the stonk to add
     */
    public void add(Stonk stonk) {
        stonks.add(stonk);
    }


    /**
     * Returns the size of the portfolio
     *
     * @return size of portfolio
     */
    public int size() {
        return stonks.size();
    }

    /**
     * Removes given stonk from portflio
     *
     * @param stonk stonk to be removed
     */
    public void remove(Stonk stonk) {
        stonks.remove(stonk);
    }

    /**
     * Updates the portfolio with the latest price of each stonk
     */
    public void update() {
        for (int i = 0; i < stonks.size(); i++) {
            Stonk current = stonks.get(i);
            current.setPrice(StonkUtility.getCurrentPriceOfStonk(current.getTicker()));
        }
    }

    /**
     * Returns the total dollar value of the portfolio ( shares * price )
     *
     * @return dollar amount of portfolio value
     */
    public BigDecimal getTotalValue() {
        //double total = 0;
        BigDecimal total = new BigDecimal("" + 0);
        for (int i = 0; i < stonks.size(); i++) {
            //total += stonks.get(i).getPrice() * stonks.get(i).getShares();
            total = total.add(stonks.get(i).getPrice().multiply(new BigDecimal("" + stonks.get(i).getShares())));
        }
        return total;
    }

    /**
     * Write the portfolio as a string to file
     *
     * @param filename file to write the portfolio
     */
    public void saveToDisk(String filename) throws IOException {
        FileUtils.writeStringToFile(new File(filename), this.toString(), "UTF-8");
    }

    @Override
    public String toString() {
        String line = "";
        for (int i = 0; i < stonks.size(); i++) {
            if (i == stonks.size() - 1) {
                String entry = stonks.get(i).getTicker() + ":" + stonks.get(i).getShares();
                line += entry;
            } else {
                String entry = stonks.get(i).getTicker() + ":" + stonks.get(i).getShares() + ",";
                line += entry;
            }
        }
        return line;
    }
}