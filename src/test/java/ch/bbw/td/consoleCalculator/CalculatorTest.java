package ch.bbw.td.consoleCalculator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.td.consolecalculator.Calculator;

public class CalculatorTest {
	Calculator testee;
	

	
	@Before
	public void setUp() {
		testee = new Calculator();
	}
	
	//Testerstellung für eine + Rechnung mit 2 positiven zahlen
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSumme2negativIsOk() {
		assertTrue(testee.summe(-10, -10) == -20);
	}
	
	@Test
	public void testSumme1negativ1positivIsOk() {
		assertTrue(testee.summe(-10, 20)== 10);
	}
	
	@Test
	public void testSumme1positiv1negativIsOk() {
		assertTrue(testee.summe(20, -10)== 10);
	}
	
	@Test
	public void testSumme2mal0IsOk() {
		assertTrue(testee.summe(0, 0)== 0);
	}
	
	@Test
	public void testSumme2malMinus0IsOk() {
		assertTrue(testee.summe(-0, -0)== 0);
	}
	
	@Test
	public void testSumme1Plus01Minus0IsOk() {
		assertTrue(testee.summe(0, -0)== 0);
	}
	
	@Test
	public void testSumme1Minus01Plus0IsOk() {
		assertTrue(testee.summe(-0, 0)== 0);
	}
	
	@Test
	public void testSummePlusMinus0IsOk() {
		assertTrue(testee.summe(5, -0)== 5);
	}
	
	@Test
	public void testSummeMinus0PlusIsOk() {
		assertTrue(testee.summe(-0, 5)== 5);
	}
	
	@Test
	public void testSummeMinus0MinusIsOk() {
		assertTrue(testee.summe(-0, -5)== -5);
	}
	
	@Test
	public void testSummeMinusMinus0IsOk() {
		assertTrue(testee.summe(-5, -0)== -5);
	}
	
	@Test
	public void testSummeMinusPlus0IsOk() {
		assertTrue(testee.summe(-5, 0)== -5);
	}
	
	@Test
	public void testSummePlus0MinusIsOk() {
		assertTrue(testee.summe(0, -5)== -5);
	}
	
	@Test
	public void testSumme0PlusIsOk() {
		assertTrue(testee.summe(0, 5)== 5);
	}
	
	@Test
	public void testSummePlus0IsOk() {
		assertTrue(testee.summe(5, 0)== 5);
	}
	

	
	//Testerstellung für eine - Rechnung mit zwei positiven Zahlen
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		
		assertTrue(testee.subtraktion(25, 10) == 15);
	}
	
	@Test
	public void testSubtraction2negativIsOk() {
		assertTrue(testee.subtraktion(-10, -10) == 0);
	}
	
	@Test
	public void testSubtraction1negativ1positivIsOk() {
		assertTrue(testee.subtraktion(-10, 20)== -30);
	}
	
	@Test
	public void testSubtraction1positiv1negativIsOk() {
		assertTrue(testee.subtraktion(20, -10)== 30);
	}
	
	@Test
	public void testSubtraction2mal0IsOk() {
		assertTrue(testee.subtraktion(0, 0)== 0);
	}
	
	@Test
	public void testSubtraction2malMinus0IsOk() {
		assertTrue(testee.subtraktion(-0, -0)== 0);
	}
	
	@Test
	public void testSubtraction1Plus01Minus0IsOk() {
		assertTrue(testee.subtraktion(0, -0)== 0);
	}
	
	@Test
	public void testSubtraction1Minus01Plus0IsOk() {
		assertTrue(testee.subtraktion(-0, 0)== 0);
	}
	
	@Test
	public void testSubtractionPlusMinus0IsOk() {
		assertTrue(testee.subtraktion(5, -0)== 5);
	}
	
	@Test
	public void testSubtractionMinus0PlusIsOk() {
		assertTrue(testee.subtraktion(-0, 5)== -5);
	}
	
	@Test
	public void testSubtractionMinus0MinusIsOk() {
		assertTrue(testee.subtraktion(-0, -5)== 5);
	}
	
	@Test
	public void testSubtractionMinusMinus0IsOk() {
		assertTrue(testee.subtraktion(-5, -0)== -5);
	}
	
	@Test
	public void testSubtractionMinusPlus0IsOk() {
		assertTrue(testee.subtraktion(-5, 0)== -5);
	}
	
	@Test
	public void testSubtractionPlus0MinusIsOk() {
		assertTrue(testee.subtraktion(0, -5)== 5);
	}
	
	@Test
	public void testSubtraction0PlusIsOk() {
		assertTrue(testee.subtraktion(0, 5)== -5);
	}
	
	@Test
	public void testSubtractionPlus0IsOk() {
		assertTrue(testee.subtraktion(5, 0)== 5);
	}

}
