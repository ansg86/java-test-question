package com.testquestion;

import com.testquestion.util.RunLengthUtil;
import com.testquestion.util.WordSplitUtil;

public class MainClass {

	public static void main(String args[]) {

		// Q1 testing
		String[] testInput = {"hellocat", "apple,bat,cat,goodbye,hello,yellow,why"};
		System.out.println(WordSplitUtil.wordSplit(testInput));
		
		// Q2 testing
		System.out.println(RunLengthUtil.runLength("wwwbbbw"));
	}
}
