package org.example;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

public class PortfolioTest {

    private Portfolio p;
    private Stonk gme;
    private Stonk nok;

    @Before
    public void setUp() {
        p = new Portfolio();
        gme = new Stonk("GME", new BigDecimal(""+50), 20);
        nok = new Stonk("NOK", new BigDecimal(""+5), 100);
        p.add(gme);
        p.add(nok);
    }

    @Test
    public void testSaveToDisk() throws IOException {
        p.add(new Stonk("TSLA",new BigDecimal(""+100),2));
        p.add(new Stonk("BB",new BigDecimal(""+10),200));
        p.saveToDisk("temp.txt");
        String str = FileUtils.readFileToString(new File("temp.txt"),"UTF-8");
        Assert.assertTrue(str.equals(p.toString()));
    }

    @Test
    public void testEmptyPortfolio() {
        Portfolio portfolio = new Portfolio();
        Assert.assertNotNull(portfolio);
    }

    @Test
    public void testAddStonk() {
        Assert.assertEquals(2, p.size());
    }

    @Test
    public void testRemoveStonk() {
        p.remove(new Stonk("GME", new BigDecimal(""+200), 2));
        p.remove(new Stonk("NOK", new BigDecimal(""+10), 1));
        Assert.assertEquals(0, p.size());
    }

    @Test
    public void testUpdatePortfolio() {
        p.update();
        BigDecimal totalValue = p.getTotalValue();
        //System.out.println(totalValue);
        Assert.assertTrue( totalValue.compareTo(new BigDecimal(""+0)) > 0 );
    }

    // test portfolio total value with fixed amount
    @Test
    public void testTotalValue() {
        gme.setPrice( new BigDecimal(""+150));
        nok.setPrice(new BigDecimal(""+15));
        Stonk tesla = new Stonk("TSLA",new BigDecimal(""+800), 2);
        p.add(tesla);
        BigDecimal total = new BigDecimal(""+((150 * 20) + (15 * 100) + (800 * 2)));
        Assert.assertEquals(total, p.getTotalValue()/*,new BigDecimal(""+0.1)*/);
    }


}
