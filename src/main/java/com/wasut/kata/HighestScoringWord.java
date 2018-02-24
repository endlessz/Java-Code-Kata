package com.wasut.kata;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Comparator;

@Service
public class HighestScoringWord {
	public String high(String text) {
		String [] words = text.split(" ");

		return Arrays.stream(words).max(Comparator.comparingInt(
				word -> this.getScoreFromWord(word)
			)).get();
	}

	private int getScoreFromWord(String word) {
		return word.toLowerCase().chars().map(character -> character - 96).sum();
	}
}