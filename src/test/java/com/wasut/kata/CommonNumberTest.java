package com.wasut.kata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonNumberTest {
    @Autowired
    private CommonNumber commonNumber;

    @Test
    public void testValidGCD(){
        Assert.assertEquals(5, commonNumber.gcd(5, 10));
        Assert.assertEquals(5, commonNumber.gcd(10, 5));
        Assert.assertEquals(1, commonNumber.gcd(17, 13));
    }

    @Test
    public void testValidLCM(){
        Assert.assertEquals(10, commonNumber.lcm(5, 10));
        Assert.assertEquals(30, commonNumber.lcm(10, 30));
        Assert.assertEquals(300, commonNumber.lcm(60, 50));
    }
}
