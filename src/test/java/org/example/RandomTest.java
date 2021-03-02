package org.example;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

public class RandomTest {
    @Test
    public void testNum(){
        System.out.println(RandomUtils.nextInt(1,101));
        System.out.println(RandomUtils.nextDouble(1,101));
        System.out.println(RandomStringUtils.randomAlphanumeric(1,101));
    }
}
