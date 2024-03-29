package by.academy.homework7;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junit.framework.Assert;

@RunWith(value = Parameterized.class)
public class ParameterizeSubstractTest extends Assert {
	private double valueA;
	private double valueB;
	private double expected;

	public ParameterizeSubstractTest(double valueA, double valueB, double expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:substract {0} and {1} = {2}")
	public static Iterable<Double[]> dataForTestSubstract() {
		return (Iterable<Double[]>) Arrays.asList(
				new Double[][] { { 2.0, 1.0, 1.0 }, { 6.0, 2.0, 4.0 }, { 10.0, 5.0, 5.0 }, { 20.0, 8.5, 11.5 } });
	}

	@Test
	public void paramSubstractTest() {
		assertEquals(expected, Calculator.substract(valueA, valueB));
	}

}