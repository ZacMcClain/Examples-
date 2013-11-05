import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentSet {
	private Set<Student> students;
	
	public StudentSet() {
		students = new HashSet<Student>();
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void displayStudents() {
		for (Student s : students) {
			System.out.println(s.getName());
		}
	}

	public static void main(String[] args) {
		StudentSet set = new StudentSet();
		set.addStudent(new Student("Cyndi"));
		set.addStudent(new Student("Bill"));
		set.addStudent(new Student("Jane"));
		set.displayStudents();

	}

}
