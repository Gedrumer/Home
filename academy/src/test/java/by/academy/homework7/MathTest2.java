package by.academy.homework7;

import org.junit.Test;
import junit.framework.Assert;

public class MathTest2 {
	@Test
	public void testMaxMath() {
		Assert.assertEquals(8, (int) (Math.max(8.0, 6.0)));
	}
}