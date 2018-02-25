package com.wasut.kata;

import org.springframework.stereotype.Service;

/**
 * Created by Wasut on 11/4/2560.
 */
@Service
public class Palindrome {
    public boolean isPalindrome(String text){
        for (int i = 0; i < text.length() / 2 ; i++) {
            if(text.charAt(i) != text.charAt(text.length() - i - 1)){
                return false;
            }
        }

        return true;
    }

    public boolean isPalindromeByReverse(String text){
        String reverse = new StringBuilder(text).reverse().toString();

        return text.equals(reverse);
    }

    public boolean isPalindromeArray(String [] array) {
        return this.isPalindrome(String.join(",", array));
    }
}