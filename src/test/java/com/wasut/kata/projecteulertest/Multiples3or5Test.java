package com.wasut.kata.projecteulertest;

import com.wasut.kata.projecteuler.Multiples3or5;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Wasut on 8/1/2560.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Multiples3or5Test {
    @Autowired
    private Multiples3or5 multiples3or5;

    @Test
    public void correctMultiple3or5(){
        Assert.assertEquals(true, multiples3or5.isMultiple3or5(5));
        Assert.assertEquals(true, multiples3or5.isMultiple3or5(9));
        Assert.assertEquals(true, multiples3or5.isMultiple3or5(15));
        Assert.assertEquals(true, multiples3or5.isMultiple3or5(25));
        Assert.assertEquals(true, multiples3or5.isMultiple3or5(33));
        Assert.assertEquals(true, multiples3or5.isMultiple3or5(99));
    }

    @Test
    public void multiple3or5Below20(){
        List<Integer> list = multiples3or5.findMultiples3or5Below(20);

        Assert.assertEquals(8, list.size());
        Assert.assertEquals("[3, 5, 6, 9, 10, 12, 15, 18]", list.toString());
    }

    @Test
    public void findAnswerBelow1000(){
        List<Integer> list = multiples3or5.findMultiples3or5Below(1000);

        System.out.println("Answer is " + multiples3or5.sumNumber(list));
    }
}