package com.wasut.kata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to it's position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HighestScoringWordTest {
    @Autowired
    private HighestScoringWord highestScoringWord;

    @Test
    public void testValidGetHighScoreWord(){
        Assert.assertEquals("taxi", highestScoringWord.high("man i need a taxi up to ubud"));
        Assert.assertEquals("abc", highestScoringWord.high("a ab abc"));
        Assert.assertEquals("zebra", highestScoringWord.high("It is a zebra"));
    }
}