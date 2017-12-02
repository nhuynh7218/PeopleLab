//an object consisted of other objects. Objects: array of students and a teacher
//must create this array of students with a random method

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
	
	//the total average of all the students divided by the number of students
	//will run into error. Make sure to cast each object in the array as a Student in order to call getGPA method
	public double classAverage()	{
		double totalGPA = 0.0;
		for (Person p : this.students)	{
			if (p instanceof Student) {
				totalGPA += ((Student)p).getGPA();
			}
		}
		return totalGPA/this.students.length;	
	}
	
	//similar to classAverage in that must cast the Person as a Teacher in order to call getSubject method.
	public String getSubject()	{
		if (this.teacher instanceof Teacher) {
			return ((Teacher)(this.teacher)).getSubject();
		}
		return null;
	}
	
	/*just like in classAverage, you must cast the objects in the students array as a student. Therefore, 
	 * you can call the specific methods of a student.
	*/
	public String printClass()	{
		String allStudents = "";
		for (Person p : this.students)	{
			if (p instanceof Student) {
			allStudents= allStudents + ("\n"+((Student)p).getFirstName() + " " + ((Student)p).getFamilyName() + ",  ");
			}	
		}
		return  getTeacher() + "  teaches " + this.getSubject() + "  to  " + allStudents;
	}
}
