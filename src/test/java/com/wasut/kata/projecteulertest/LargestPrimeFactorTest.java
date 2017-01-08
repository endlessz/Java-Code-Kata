package com.wasut.kata.projecteulertest;

import com.wasut.kata.projecteuler.LargestPrimeFactor;
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
public class LargestPrimeFactorTest {
    @Autowired
    private LargestPrimeFactor largestPrimeFactor;

    @Test
    public void testExampleAnswer(){
        Integer [] answer = {5, 7, 13, 29};

        List<Integer> list = largestPrimeFactor.findPrimeFactor(13195L);
        System.out.println(list.toString());

        int index = 0;
        for(Integer number : list){
            Assert.assertEquals(answer[index++], number);
        }
    }

    @Test
    public void findAnswerTest(){
        List<Integer> list = largestPrimeFactor.findPrimeFactor(600851475143L);

        System.out.println(list.toString());
    }
}
