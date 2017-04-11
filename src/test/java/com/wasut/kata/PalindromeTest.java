package com.wasut.kata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Wasut on 11/1/2560.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PalindromeTest {
    @Autowired
    private Palindrome palindrome;

    @Test
    public void correctPalindrome(){
        Assert.assertEquals(true, palindrome.isPalindrome("elle"));
        Assert.assertEquals(true, palindrome.isPalindrome("191"));
        Assert.assertEquals(true, palindrome.isPalindrome("manam"));
        Assert.assertEquals(true, palindrome.isPalindrome("testset"));
        Assert.assertEquals(true, palindrome.isPalindrome("pop"));
        Assert.assertEquals(true, palindrome.isPalindrome("paoap"));
        Assert.assertEquals(true, palindrome.isPalindrome("ppapp"));
        Assert.assertEquals(true, palindrome.isPalindrome("1538351"));
    }

    @Test
    public void falsePalindrome(){
        Assert.assertEquals(false, palindrome.isPalindrome("hello"));
        Assert.assertEquals(false, palindrome.isPalindrome("123"));
        Assert.assertEquals(false, palindrome.isPalindrome("world"));
        Assert.assertEquals(false, palindrome.isPalindrome("poooo"));
        Assert.assertEquals(false, palindrome.isPalindrome("sinister"));
        Assert.assertEquals(false, palindrome.isPalindrome("fate"));
        Assert.assertEquals(false, palindrome.isPalindrome("success"));
    }

    @Test
    public void correctPalindromeByReverse(){
        Assert.assertEquals(true, palindrome.isPalindromeByReverse("elle"));
        Assert.assertEquals(true, palindrome.isPalindromeByReverse("191"));
        Assert.assertEquals(true, palindrome.isPalindromeByReverse("manam"));
    }

    @Test
    public void falsePalindromeByReverse(){
        Assert.assertEquals(false, palindrome.isPalindromeByReverse("hello"));
        Assert.assertEquals(false, palindrome.isPalindromeByReverse("123"));
        Assert.assertEquals(false, palindrome.isPalindromeByReverse("world"));
    }
}
