package com.wasut.kata;

import org.springframework.stereotype.Service;

/**
 * Created by Wasut on 2/1/2560.
 */
@Service
public class Factorial {
    public int calculate(int number){
        if(number == 1){
            return number;
        }

        return number * calculate(number - 1);
    }

    public int calculateByLoop(int number){
        int result = 1;

        for (int i = 2; i <= number; i++){
            result *= i;
        }

        return result;
    }
}