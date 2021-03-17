package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class UserTest {

    @Test
    public void testUserPortfolio() {
        User user = new User();
        Assert.assertNotNull(user);
        boolean isEmpty = user.isPortfolioEmpty();
        Assert.assertEquals(false, isEmpty);
        user.loadPortfolio();
        Assert.assertEquals(3, user.getPortfolio().size());
    }

    @Test
    public void testSavePortfolio() {
        User user = new User();
        Portfolio p = user.getPortfolio();
        p.add(new Stonk("GME",new BigDecimal(""+50),100));
        p.add(new Stonk("AMC",new BigDecimal(""+10),100));
        p.add(new Stonk("NOK",new BigDecimal(""+5) ,100));
        user.savePortfolio();

    }
}
