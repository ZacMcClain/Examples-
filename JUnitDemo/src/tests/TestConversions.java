package tests;

import junit.framework.Assert;

import org.junit.Test;
import utilities.MyConverter;

public class TestConversions {
	public static double EPSILON = .0001;

	@Test
	public void testFeetToMeters()
	{
		double expected = 0.0508;
		double actual = MyConverter.englishToMeters(0, 2);	
		Assert.assertEquals(expected, actual, EPSILON);
		expected = 0.3556;
		actual = MyConverter.englishToMeters(1, 2);	
		Assert.assertEquals(expected, actual, EPSILON);
	}
	
	@Test
	public void testYardToFeet()
	{
		Assert.assertEquals(12, MyConverter.yardsToFeet(4));
	}
}
