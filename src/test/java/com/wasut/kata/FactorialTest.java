package com.wasut.kata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Wasut on 2/1/2560.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FactorialTest {
    @Autowired
    private Factorial factorial;

    @Test
    public void correct(){
        Assert.assertEquals(1, factorial.calculate(1));
        Assert.assertEquals(2, factorial.calculate(2));
        Assert.assertEquals(6, factorial.calculate(3));
        Assert.assertEquals(24, factorial.calculate(4));
        Assert.assertEquals(120, factorial.calculate(5));
    }
}
