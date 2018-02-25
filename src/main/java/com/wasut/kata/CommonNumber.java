package com.wasut.kata;

import org.springframework.stereotype.Service;

@Service
public class CommonNumber {
    public int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        return gcd(number2, number1 % number2);
    }

    public int lcm(int number1, int number2) {
        return number1 * number2 / this.gcd(number1, number2);
    }
}