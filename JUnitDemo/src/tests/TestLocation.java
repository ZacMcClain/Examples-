package tests;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import game.Location;


public class TestLocation {
	private Location location;

	@Before
	public void setUp(){
	  location = new Location();
	  System.out.println("In @Before");
	}
	
	@Test
	public void testMove() {
	  location.move(5, 10);
	  Assert.assertEquals(5, location.getX());
	  Assert.assertEquals(10, location.getY());
	}
	@Test
	public void testMove2() {
	  location.move(5, 10);
	  Assert.assertEquals(5, location.getX());
	  Assert.assertEquals(10, location.getY());
	  location.move(5, 10);
	  Assert.assertEquals(10, location.getX());
	  Assert.assertEquals(20, location.getY());
	}

	

}
