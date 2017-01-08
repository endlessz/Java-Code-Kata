package com.wasut.kata.projecteuler;

import com.wasut.kata.PrimeNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *  The prime factors of 13195 are 5, 7, 13 and 29.
 *
 *  What is the largest prime factor of the number 600851475143 ?
 *
 *  https://projecteuler.net/problem=3
 */
@Service
public class LargestPrimeFactor {
    @Autowired
    private PrimeNumber primeNumber;

    public List<Integer> findPrimeFactor(Long number){
        List<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= number; i++){
            if(primeNumber.isPrime(number)){
                primeFactors.add(number.intValue());
                break;
            }

            if(number % i == 0){
                primeFactors.add(i);
                number /= i;
            }
        }

        return primeFactors;
    }
}
