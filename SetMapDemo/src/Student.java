public class Student implements Comparable<Student>{
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;		
	}
	
	public int compareTo(Student other) {
		return name.compareTo(other.name);
	}

}
