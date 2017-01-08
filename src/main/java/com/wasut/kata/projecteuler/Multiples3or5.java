package com.wasut.kata.projecteuler;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wasut on 8/1/2560.
 *
 *  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 *  The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
@Service
public class Multiples3or5 {

    public int sumNumber(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public List<Integer> findMultiples3or5Below(int number){
        List<Integer> answers = new ArrayList<>();

        for (int i = 3; i < number; i++){
            if(isMultiple3or5(i)){
                answers.add(i);
            }
        }

        return answers;
    }

    public boolean isMultiple3or5(int number){
        if(number % 3 == 0 || number % 5 == 0){
            return true;
        }

        return false;
    }
}
