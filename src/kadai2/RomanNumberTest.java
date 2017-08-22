package kadai2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberTest {

	@Test
	public void testIncludingNineOrFour() {
		RomanNumberHenkan rNH = new RomanNumberHenkan();
		assertEquals("XIX",rNH.romanNumberHenkan(19));
		assertEquals("XIV",rNH.romanNumberHenkan(14));
		assertEquals("IX",rNH.romanNumberHenkan(9));
		assertEquals("IV",rNH.romanNumberHenkan(4));
	}

	@Test
	public void testFiveNoBaisu() {
		RomanNumberHenkan rNH = new RomanNumberHenkan();
		assertEquals("XX",rNH.romanNumberHenkan(20));
		assertEquals("XV",rNH.romanNumberHenkan(15));
		assertEquals("X",rNH.romanNumberHenkan(10));
		assertEquals("V",rNH.romanNumberHenkan(5));
	}

	@Test
	public void testSixToEight() {
		RomanNumberHenkan rNH = new RomanNumberHenkan();
		assertEquals("VIII",rNH.romanNumberHenkan(8));
		assertEquals("VII",rNH.romanNumberHenkan(7));
		assertEquals("VI",rNH.romanNumberHenkan(6));
	}

	@Test
	public void testSixteenToEighteen() {
		RomanNumberHenkan rNH = new RomanNumberHenkan();
		assertEquals("XVIII",rNH.romanNumberHenkan(18));
		assertEquals("XVII",rNH.romanNumberHenkan(17));
		assertEquals("XVI",rNH.romanNumberHenkan(16));
	}

	@Test
	public void testOneToThree() {
		RomanNumberHenkan rNH = new RomanNumberHenkan();
		assertEquals("III",rNH.romanNumberHenkan(3));
		assertEquals("II",rNH.romanNumberHenkan(2));
		assertEquals("I",rNH.romanNumberHenkan(1));
		assertEquals("XIII",rNH.romanNumberHenkan(13));
		assertEquals("XII",rNH.romanNumberHenkan(12));
		assertEquals("XI",rNH.romanNumberHenkan(11));
	}

	@Test
	public void testLessThanZero() {
		RomanNumberHenkan rNH = new RomanNumberHenkan();
		assertEquals("変換できません",rNH.romanNumberHenkan(0));
		assertEquals("変換できません",rNH.romanNumberHenkan(-100));
	}

	@Test
	public void testMoreThanTwenty() {
		RomanNumberHenkan rNH = new RomanNumberHenkan();
		assertEquals("変換できません",rNH.romanNumberHenkan(21));
		assertEquals("変換できません",rNH.romanNumberHenkan(22));
	}




}
