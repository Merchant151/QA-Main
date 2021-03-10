package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Unit test for simple App.
 */
public class PortfolioTest
{
    private Portfolio portfolio;

    @Before
    public void setUp() {
        //BB, NOK, GME, AMC
        //we have a budget of $1000, purchased on 2/10/2021 Wednesday
        Stonk bb = new Stonk("BB", new BigDecimal("10"),10);
        Stonk nok = new Stonk("NOK", new BigDecimal("4"),30);
        Stonk gme = new Stonk("GME", new BigDecimal("50"),10);
        Stonk amc = new Stonk("AMC", new BigDecimal("5"),30);
        portfolio = new Portfolio();
        portfolio.add(bb);
        portfolio.add(nok);
        portfolio.add(gme);
        portfolio.add(amc);
    }

    @Test
    public void testSizeOfPortfolio() {
        Assert.assertEquals(4,portfolio.getSize());
    }


    /**
     * Test to calculate value of protfolio
     */
    @Test
    public void testValueOfPortfolio(){
        double total = (10*10)+(4*30)+(50*10)+(5*30);
        Assert.assertEquals(total,portfolio.getTotalValue(),0.1);
    }


}
