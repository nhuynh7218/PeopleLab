import java.util.Arrays;
import java.util.Random;
public class Classroom {
	private Person[] students;
	private Person teacher;
	
	public Classroom(Person[] students, Person teacher) {
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
	
	public Student randomStudent () {
		Random rand = new Random ();
		String() = rand.nextString();
		
			
	}
	//public static void printClass (Classroom[])
	@Override
	public String toString() {
		return ;
	}

}
