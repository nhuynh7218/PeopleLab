import java.util.Arrays;

public class Classroom {
	private Person[] students;
	private Person teacher;
	
	public Classroom(Person teacher, Person[] students) {
		this.students=students;
		this.teacher=teacher;
	}

	public Person[] getStudents() {
		return students;
	}

	public void setStudents(Person[] students) {
		this.students = students;
	}

	public Person getTeacher() {
		return teacher;
	}

	public void setTeacher(Person teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Classroom [students=" + Arrays.getgPA + ", teacher=" + teacher + "]";
	}

}
