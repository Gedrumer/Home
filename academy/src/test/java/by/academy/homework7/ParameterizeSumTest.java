package by.academy.homework7;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junit.framework.Assert;

@RunWith(value = Parameterized.class)
public class ParameterizeSumTest extends Assert {
	private double valueA;
	private double valueB;
	private double expected;

	public ParameterizeSumTest(double valueA, double valueB, double expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sum {0} and {1} = {2}")
	public static Iterable<Double[]> dataForTestSum() {
		return (Iterable<Double[]>) Arrays.asList(
				new Double[][] { { 2.0, 2.0, 4.0 }, { 2.0, 3.0, 5.0 }, { 10.0, 6.0, 16.0 }, { 8.0, 3.5, 11.5 } });
	}

	@Test
	public void paramSumTest() {
		assertEquals(expected, Calculator.sum(valueA, valueB));
	}

}