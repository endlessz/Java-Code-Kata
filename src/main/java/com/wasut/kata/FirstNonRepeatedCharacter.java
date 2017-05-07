package com.wasut.kata;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by Wasut on 7/5/2560.
 */
@Service
public class FirstNonRepeatedCharacter {
    public String findFirstNonRepeat(String word){
        Map<String, Integer> words = findRepeat(word);
        
        for(int i = 0; i < word.length(); i++){
            String first = String.valueOf(word.charAt(i));
            
            if(words.get(first) > 1){
                continue;
            }
            
            return first;
        }
        
        return "";
    }
    
    private HashMap<String, Integer> findRepeat(String text){
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        
        for(int i = 0; i < text.length(); i++){
            String ch = String.valueOf(text.charAt(i));
            
            if(words.containsKey(ch)){
                words.put(ch, words.get(ch) + 1);
                continue;
            }
            
            words.put(ch, 1);
        }
        
        return words;
    }
}