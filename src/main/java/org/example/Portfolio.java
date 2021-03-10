package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a collection of Stonks. You can get total value of portfolio and save to disk
 */
public class Portfolio {

    private List<Stonk> stonks;

    /**
     * Creates empty protfolio
     */
    public Portfolio(){
        this.stonks = new ArrayList<Stonk>();
    }

    /**
     * Add stonk to portfolio
     * @param stonk stonk to be added
     */
    public void add(Stonk stonk){
        stonks.add(stonk);
    }

    public double getTotalValue(){
        //BigDecimal total = new BigDecimal("0");
        double total = 0;
        for (int i = 0; i < stonks.size(); i++){
            //total = total.add(stonks.get(i).getPrice().multiply(new BigDecimal(+ stonks.get(i).getShares())));
            total += stonks.get(i).getPrice().doubleValue() * stonks.get(i).getShares();
        }
        return total;
    }

    /**
     * Returns the size of the inventory
     * @return size of inventory
     */
    public int getSize() {
        return stonks.size();
    }
}
