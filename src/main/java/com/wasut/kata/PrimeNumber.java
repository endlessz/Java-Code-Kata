package com.wasut.kata;

import org.springframework.stereotype.Service;

/**
 * Created by Wasut on 8/1/2560.
 */
@Service
public class PrimeNumber {
    public boolean isPrime(Long number){
        if(number <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i ++){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }
}
