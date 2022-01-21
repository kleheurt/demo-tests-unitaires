package dev.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStringUtils {
	
	@Test
	public void testLevenshteinDistance() {
		
		int res1 = StringUtils.levenshteinDistance("a", "a");
		assertEquals(res1, 0);
		
		int res2 = StringUtils.levenshteinDistance("chat", "chats");
		assertEquals(res2, 1);
		
		int res3 = StringUtils.levenshteinDistance("machins", "machine");
		assertEquals(res3, 1);
		
		int res4 = StringUtils.levenshteinDistance("aviron", "avion");
		assertEquals(res4, 1);
		
	}
	
	@Test (expected = NullPointerException.class)
	public void testLevenshteinDistanceNull() {
		StringUtils.levenshteinDistance(null, null);
	}
}
