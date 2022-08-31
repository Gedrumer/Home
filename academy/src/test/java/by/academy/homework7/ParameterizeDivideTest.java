package by.academy.homework7;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junit.framework.Assert;

@RunWith(value = Parameterized.class)
public class ParameterizeDivideTest extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public ParameterizeDivideTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:divide {0} and {1} = {2}")
	public static Iterable<Integer[]> dataForTestDivide() {
		return (Iterable<Integer[]>) Arrays.asList(
				new Integer[][] { { 6, 2, 3 }, { 8, 2, 4 }, { 10, 5, 2 }, { 12, 3, 4 }, { 15, 15, 1 }, { 21, 3, 7 } });
	}

	@Test
	public void paramDivideTest() {
		assertEquals(expected, Calculator.divide(valueA, valueB));
	}

}