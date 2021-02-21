package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
//import sun.awt.X11.XSystemTrayPeer;

import javax.swing.plaf.PanelUI;
import java.math.BigDecimal;
import java.security.PublicKey;
import java.time.LocalDate;
/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testLocalDate(){
        LocalDate today = LocalDate.of(2021,1,27);
        System.out.println(today);
        System.out.println(today.getDayOfYear());
    }

    @Test
    public void testcalc() {
        //System.out.println(0.1+0.2); this is just an example from in class
        BigDecimal balance = new BigDecimal("1.00");
        BigDecimal newBalance =
                balance.subtract(new BigDecimal("0.3")).subtract(new BigDecimal("0.7"));
        System.out.println(newBalance);
        System.out.println(1.00 - 0.1 - 0.3);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
