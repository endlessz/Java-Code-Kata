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
        Assert.assertEquals(true, primeNumber.isPrime(2));
        Assert.assertEquals(true, primeNumber.isPrime(3));
        Assert.assertEquals(true, primeNumber.isPrime(5));
        Assert.assertEquals(true, primeNumber.isPrime(23));
        Assert.assertEquals(true, primeNumber.isPrime(29));
        Assert.assertEquals(true, primeNumber.isPrime(47));
        Assert.assertEquals(true, primeNumber.isPrime(101));
    }

    @Test
    public void wrongPrime(){
        Assert.assertEquals(false, primeNumber.isPrime(4));
        Assert.assertEquals(false, primeNumber.isPrime(6));
        Assert.assertEquals(false, primeNumber.isPrime(10));
        Assert.assertEquals(false, primeNumber.isPrime(100));
        Assert.assertEquals(false, primeNumber.isPrime(250));
        Assert.assertEquals(false, primeNumber.isPrime(375));
        Assert.assertEquals(false, primeNumber.isPrime(44));
    }
}
