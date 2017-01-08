package com.wasut.kata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Wasut on 8/1/2560.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PrimeNumberTest {
    @Autowired
    private PrimeNumber primeNumber;

    @Test
    public void correctPrime(){
        Assert.assertEquals(true, primeNumber.isPrime(2L));
        Assert.assertEquals(true, primeNumber.isPrime(3L));
        Assert.assertEquals(true, primeNumber.isPrime(5L));
        Assert.assertEquals(true, primeNumber.isPrime(23L));
        Assert.assertEquals(true, primeNumber.isPrime(29L));
        Assert.assertEquals(true, primeNumber.isPrime(47L));
        Assert.assertEquals(true, primeNumber.isPrime(101L));
    }

    @Test
    public void wrongPrime(){
        Assert.assertEquals(false, primeNumber.isPrime(4L));
        Assert.assertEquals(false, primeNumber.isPrime(6L));
        Assert.assertEquals(false, primeNumber.isPrime(10L));
        Assert.assertEquals(false, primeNumber.isPrime(100L));
        Assert.assertEquals(false, primeNumber.isPrime(250L));
        Assert.assertEquals(false, primeNumber.isPrime(375L));
        Assert.assertEquals(false, primeNumber.isPrime(44L));
    }
}
