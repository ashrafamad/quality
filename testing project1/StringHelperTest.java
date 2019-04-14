package com.ashraf.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	// AACD => CD 
	//ACD => CD 
	//CDEF=>CDEF 
	//CDAA => CDAA

	StringHelper helper;
	
	
	@Before
	public void before(){
		helper = new StringHelper();
		System.out.println("@before....");
	}
	

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() 
	{
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		//assertEquals(expected, actual)
	
	}

	
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}


	

	// ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse( 
				helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue( 
				helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

	
	@After
	public void afterTestCase(){
		helper = null;
		System.out.println("@after....");
	}
	

	
}