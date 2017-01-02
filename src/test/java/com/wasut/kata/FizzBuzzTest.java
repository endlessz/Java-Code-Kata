package com.wasut.kata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
    For a given natural number greater than zero return:
    - “fizz” if the number is dividable by 3
    - “buzz” if the number is dividable by 5
    - “fizzbuzz” if the number is dividable by 15
    - the same number if no other requirement is fulfilled
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzBuzzTest {
    @Autowired
    private FizzBuzz fizzBuzz;

    @Test
    public void canDivideOnly3(){
        Assert.assertEquals("fizz", fizzBuzz.calculate(3));
        Assert.assertEquals("fizz", fizzBuzz.calculate(6));
        Assert.assertEquals("fizz", fizzBuzz.calculate(9));
    }

    @Test
    public void canDivideOnly5(){
        Assert.assertEquals("buzz", fizzBuzz.calculate(5));
        Assert.assertEquals("buzz", fizzBuzz.calculate(10));
        Assert.assertEquals("buzz", fizzBuzz.calculate(20));
    }

    @Test
    public void canDivideBy3And5(){
        Assert.assertEquals("fizzbuzz", fizzBuzz.calculate(15));
        Assert.assertEquals("fizzbuzz", fizzBuzz.calculate(30));
        Assert.assertEquals("fizzbuzz", fizzBuzz.calculate(45));
    }

    @Test
    public void notFizzAndBuzz(){
        Assert.assertEquals("1", fizzBuzz.calculate(1));
        Assert.assertEquals("2", fizzBuzz.calculate(2));
        Assert.assertEquals("4", fizzBuzz.calculate(4));
    }
}