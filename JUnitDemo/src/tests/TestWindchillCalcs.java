package tests;
import junit.framework.Assert;
import org.junit.*;
import windchill.MyTempConverter;
import windchill.BadInputException;

public class TestWindchillCalcs {
	@Test
	public void testWindchill()
	{
		long expected = -11;
		long actual = MyTempConverter.windChill(5, 0);
		Assert.assertEquals(expected, actual);
		expected = 3;
		actual = MyTempConverter.windChill(10, 15);
		Assert.assertEquals(expected, actual);
	}	
	
	@Test (expected = BadInputException.class)
	public void testWindchillLowSpeed() throws BadInputException
	{
		// This call should generate an exception, so no assert needed
		long actual = MyTempConverter.windChill(4, 10);
	}
}
