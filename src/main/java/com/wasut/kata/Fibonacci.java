package com.wasut.kata;

import org.springframework.stereotype.Service;

/**
 * Created by Wasut on 2/1/2560.
 */
@Service
public class Fibonacci {
    public int calculate(int number){
        if(number <= 1){
            return number;
        }

        return calculate(number - 1) + calculate(number - 2);
    }
}