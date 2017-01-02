package com.wasut.kata;

import org.springframework.stereotype.Service;

/**
 * Created by Wasut on 2/1/2560.
 */
@Service
public class FizzBuzz {
    public String calculate(int number){
        String result = "";

        if(number % 3 == 0) {
            result += "fizz";
        }

        if(number % 5 == 0){
            result += "buzz";
        }

        return result.equals("") ? String.valueOf(number) : result;
    }
}