package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;

public class StonkUtilityTest {

    /**
     * Test stock retrieval based on ticker
     */
    @Test
    public void testStonkPrice() {
        Stonk s = new Stonk("GME");
        BigDecimal currentPrice = StonkUtility.getCurrentPriceOfStonk(s.getTicker());
        Assert.assertTrue(currentPrice.floatValue() > 0);
    }
}
