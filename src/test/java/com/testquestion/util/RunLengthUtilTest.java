package com.testquestion.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RunLengthUtilTest {

	@Test
	public void givenNullArgumentWhenRunLengthThenReturnException() {
		assertThrows(IllegalArgumentException.class, () -> {
			RunLengthUtil.runLength(null);
		});
	}
	
	@Test
	public void givenValidInputWhenRunLengthThenExpectCorrectResult() {
		assertEquals("3w2g1o2p", RunLengthUtil.runLength("wwwggopp"));
		assertEquals("2a2b1c1d1e", RunLengthUtil.runLength("aabbcde"));
		assertEquals("3w3b1w", RunLengthUtil.runLength("wwwbbbw"));
		assertEquals("3t2A2b2D1s1d1D", RunLengthUtil.runLength("tttAAbbDDsdD"));
	}
}
