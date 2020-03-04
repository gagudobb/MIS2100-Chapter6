package Gudobba.Gavin.Chapter6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath testObject = new SimpleMath();
		assertEquals(0,testObject.divide(0, 7));
		fail("Not yet implemented");}
	@Test
	public void testThatSmallerNumeratorReturnsDecimal() {	
		SimpleMath testObject2 = new SimpleMath();
		assertEquals(.25,testObject2.divide(1, 4));
		fail("Not yet implemented");}
	@Test
	public void testThatSmallerDenominatorReturnsException() {
		SimpleMath testObject3 = new SimpleMath();
		testObject3.divide(6, 0);
		fail("Not yet implemented");}}



