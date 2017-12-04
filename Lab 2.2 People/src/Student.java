
public class Student extends Person{
	//additional fields along with Person fields
	private double GPA;
	
	private String major;
	
	private String clubs;
	
	//constructor that creates the Object Studen
	public Student(int height, String firstName, String familyName, String major, String clubs, double weight, double GPA) {
		
		super(height, firstName, familyName, weight);
		this.GPA = GPA;
		this.major = major;
		this.clubs = clubs;
		
	}

//getters and setters
	public double getGPA() {
		return GPA;
	}


	public void setGPA(double gPA) {
		GPA = gPA;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getClubs() {
		return clubs;
	}

	
	public void setClubs(String clubs) {
		this.clubs = clubs;
	}
	
	//info on what a Student is
		@Override
	public String toString() {
		return getFamilyName() + ", " + getFirstName();
	}

}



/*
public class print2d (int[][] arr) {
	
	for (int i=0; i<arr.length; i++)	{
		for ( int j; j<arr[i].length; j++)	{
			System.out.print(arr[i][j]);
			}
		System.out.println();
		}
	}
}*/

