package com.testquestion.util;

import java.util.HashMap;
import java.util.Map;

public class RunLengthUtil {

	public static String runLength(String input) {
		validateInput(input);
		
		char[] characterArray = input.toCharArray();
		Map<Character, Integer> result = new HashMap<Character, Integer>();
		
		for (char character : characterArray) {
			if (result.containsKey(character)) {
				Integer count = result.get(character);
				result.put(character, count+1);
			} else {
				result.put(character, 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		result.entrySet().stream().forEach(entry -> sb.append(entry.getValue()).append(entry.getKey()));
		
		return sb.toString();
	}
	
	private static void validateInput(String input) {
		if (input == null) {
			throw new IllegalArgumentException("The input cannot be null");
		} 
	}
}
