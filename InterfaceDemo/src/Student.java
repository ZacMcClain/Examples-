import java.util.ArrayList;
import java.util.Collections;


public class Student implements Comparable<Student>, Measurable {
	private String name;
	private double gpa;
	
	@Override
	public int compareTo(Student arg0) {
		return name.compareTo(arg0.name);
	}

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}
	
	


	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("mickey mouse", 3.0));
		students.add(new Student("pluto dog", 2.5));
		students.add(new Student("goofy", 1.3));
		for (Student s : students)
			System.out.println(s);
		System.out.println("Sorted");
		Collections.sort(students);
		for (Student s : students)
			System.out.println(s);
		

	}

	@Override
	public double getMeasure() {
		
		return gpa;
	}





}
