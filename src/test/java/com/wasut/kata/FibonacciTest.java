package com.wasut.kata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
    The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
    The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the
    sum of the previous two values,so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class FibonacciTest {
    @Autowired
    private Fibonacci fibonacci;

    @Test
    public void correct(){
        Assert.assertEquals(0, fibonacci.calculate(0));
        Assert.assertEquals(1, fibonacci.calculate(1));
        Assert.assertEquals(1, fibonacci.calculate(2));
        Assert.assertEquals(2, fibonacci.calculate(3));
        Assert.assertEquals(3, fibonacci.calculate(4));
        Assert.assertEquals(5, fibonacci.calculate(5));
        Assert.assertEquals(8, fibonacci.calculate(6));
        Assert.assertEquals(13, fibonacci.calculate(7));
    }
}