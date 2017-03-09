package com.wasut.kata.codeforces;

import java.util.Scanner;

/**
   Sometimes some words like "localization" or "internationalization" are so long
   that writing them many times in one text is quite tiresome.

   This abbreviation is made like this: we write down the first and the last letter of a word and betweeื them
   we write the number of letters between the first and the last letters.
   That number is in decimal system and doesn't contain any leading zeroes.

    Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".
 */
public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int round = scanner.nextInt();
        String text = "";

        for (int i = 0; i < round; i++){
            text = scanner.next();
            System.out.println(tooLongWord(text));
        }
    }

    private static String tooLongWord(String text){
        if(text.length() <= 10){
            return text;
        }

        String firstChar = String.valueOf(text.charAt(0));
        String lastChar = String.valueOf(text.charAt(text.length() - 1));

        return firstChar + (text.length() - 2) + lastChar;
    }
}
