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
	
	public double classAverage()	{
		double totalGPA = 0.0;
		for (Person p : this.students)	{
			if (p instanceof Student) {
				totalGPA += (Student)p.getGPA;
			}
		}
		return totalGPA/this.students.length;	
	}
	//public static void printClass (Classroom[])
	@Override
	public String toString() {
		return ;
	}

}
