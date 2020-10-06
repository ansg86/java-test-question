package com.testquestion.util;

public class RunLengthUtil {

	public static String runLength(String input) {
		validateInput(input);

		// prepare input for further process
		char[] characterArray = input.toCharArray();
		StringBuilder result = new StringBuilder();

		// initialize count
		int count = 1;

		for (int i = 0; i < characterArray.length; i++) {
			// if the subsequent character is a match , update count
			// ensure the next character(i+1) does not exceed the characterArray.length
			if (i + 1 < characterArray.length && characterArray[i] == characterArray[i + 1]) {
				count++;
			} else {
				// if it no longer match, append output to stringBuilder, and reinitialize count
				// to 1
				result.append(count).append(characterArray[i]);
				count = 1;
			}

		}

		return result.toString();
	}

	private static void validateInput(String input) {
		if (input == null) {
			throw new IllegalArgumentException("The input cannot be null");
		}
	}
}
