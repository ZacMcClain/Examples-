import java.util.Random;
import java.util.*;

public class TestThing {

	Map<String, Integer> sightings;
	public TestThing() {
	  sightings = new HashMap<String, Integer>();
	}
	public void loadSightings() {
	  sightings.put("fox", 10);
	  sightings.put("bear", 2);
	  sightings.put("deer", 60);
	  sightings.put("elk", 30);
	}
	public void printSightings() {
	  Set<String> keySet = sightings.keySet();
	  for (String key : keySet)
	    System.out.println(key + "->" + sightings.get(key));
	}
	public static void main(String[] args) {
	  TestThing demo = new TestThing();
	  demo.loadSightings();
	  demo.printSightings();

	}


}
