package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Test to calculate value of protfolio
     */
    @Test
    public void testValueOfPortfolio(){
        //BB, NOK, GME, AMC
        //we have a budget of $1000, purchased on 2/10/2021 Wednesday
        Stonk bb = new Stonk("BB", new BigDecimal("13.10"),15);
        Stonk nok = new Stonk("NOK", new BigDecimal("4.17"),15);
        Stonk gme = new Stonk("GME", new BigDecimal("51.20"),10);
        Stonk amc = new Stonk("AMC", new BigDecimal("5.8"),30);
        Portfolio portfolio = new Portfolio();
        portfolio.add(bb);
        portfolio.add(nok);
        portfolio.add(gme);
        portfolio.add(amc);

    }


}
