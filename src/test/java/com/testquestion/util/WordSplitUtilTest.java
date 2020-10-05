package com.testquestion.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class WordSplitUtilTest {

	@Test
	public void givenNullArgumentWhenWordSplitThenReturnException() {
		assertThrows(IllegalArgumentException.class, () -> {
			WordSplitUtil.wordSplit(null);
		});
	}
	
	@Test
	public void givenSizeOneArgumentWhenWordSplitThenReturnException() {
		assertThrows(IllegalArgumentException.class, () -> {
			String[] input = {"test"};
			WordSplitUtil.wordSplit(input);
		});
	}
	
	@Test
	public void givenValidInputWhenWordSplitThenExpectCorrectResult() {
		String[] input = {"hellocat", "apple,bat,cat,goodbye,hello,yellow,why"};
		assertEquals("hello,cat", WordSplitUtil.wordSplit(input));
		
		String[] input2 = {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
		assertEquals("base,ball", WordSplitUtil.wordSplit(input2));
		
		String[] input3 = {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
		assertEquals("abcg,efd", WordSplitUtil.wordSplit(input3));
	}
	
	@Test
	public void givenInputNotExistsInDictionaryWhenWordSplitThenExpectNotPossible() {
		String[] input = {"hellocat", "apple,bat,cat,goodbye,helloMe,yellow,why"};
		assertEquals("not possible", WordSplitUtil.wordSplit(input));
	}
}
