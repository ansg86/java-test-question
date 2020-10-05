package com.testquestion.util;

import java.util.Arrays;
import java.util.List;

public class WordSplitUtil {

	public static String wordSplit(String[] input) {
		validateInput(input);

		// initialize stringBuilder
		StringBuilder result = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();

		// prepare mainWord for further processing
		String mainWord = input[0];
		char[] words = mainWord.toCharArray();

		// prepare dictionaryWords for further processing
		List<String> dictionaryWords = Arrays.asList(input[1].split(","));

		for (int i = 0; i < words.length; i++) {
			// append char by char to string, for later comparison
			stringBuilder.append(words[i]);

			// if there is first word match
			if (dictionaryWords.contains(stringBuilder.toString())) {

				String secondWord = mainWord.substring(i + 1, words.length);
				// proceed with second word match
				if (dictionaryWords.contains(secondWord)) {
					result = result.append(stringBuilder).append(",").append(secondWord);
					break;
				}
			}
		}

		if (result.length() == 0) {
			result.append("not possible");
		}

		return result.toString();
	}

	private static void validateInput(String[] input) {
		if (input == null) {
			throw new IllegalArgumentException("The input cannot be null");
		} 
		
		if (input.length != 2) {
			throw new IllegalArgumentException("The input must be a size 2 array");
		}
	}
}
