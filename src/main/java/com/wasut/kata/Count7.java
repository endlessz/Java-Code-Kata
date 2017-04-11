package com.wasut.kata;

import org.springframework.stereotype.Service;

/**
 * Created by Wasut on 11/4/2560.
 */
@Service
public class Count7 {

    public int count(int number){
        if(number == 7){
            return 1;
        }

        if(number < 10){
            return 0;
        }

        int lastNumber = number % 10;
        int remaining = number / 10;

        return count(lastNumber) + count(remaining);
    }
}