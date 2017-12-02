import java.util.Random;
public class Runner {
	
	private static String[] firstNames = {"Simon", "Cassandra", "Bobby", "Martha", "Lindsie", "Jamie", "Hubert", "Mack", "Damon", "Kristen", 
			"Doug", "Nathan", "Moses", "Lauren", "Jessie", "Kate", "Nick", "Eric", "Erim", "Ethan", 
			"Sunny", "Timothy", "William", "Christy", "Susie", "Becky", "Anne", "Vivian", "Emily", "Kelly",
			"Kimberly", "Julie", "Harriet", "Krystal", "Philip", "Bertha", "Karen", "Anoodies", "Sally", "Keisha",
			"Antonio", "Matthew", "Lance", "Casey", "Toby", "Lorena", "Israel", "Patsy", "Alexander", "Ignacio",
			"Marrio", "Luigi", "Warrio", "Waluigi", "Bowser", "Peach", "Daisy", "Yoshi", "Link", "Zelda"};
	
	private static String[] familyNames = {"Bob", "Huang", "Chen", "Chan", "Cox", "Brooks", "Anderson", "Figueroa", "George", "Henry",
			"Wood", "Cobb", "Riley", "Einsten", "Harvey", "Faraday", "Lenz", "Newton", "Bowen", "Boeing",
			"Williamson", "Pearson", "Andrews", "Isaija", "Mitul", "Nilda", "Roan", "Alcyone", "Sara", "Flintstone"};
	
	private static String[] majors = {"Physics", "Math", "Law and Society", "Electrical Engineering", "Mechanical Engineering",
			"Finance", "Social Science and Research", "Civil Engineering", "Industrial Design", "Software Engineering",
			"College Prep", "Chemical Engineering", "Bioscience", "Architecture", "Aerospace Engineering", "Gateway", "Media"};
	
	private static String[] clubs = {"Bouldering", "Breakdancing", "Ultimate Frisbee", "Lady Dragons", "Organized Chaos",
			"DCH", "Swimming", "Lion Dancing", "Key Club", "Astronomy"};
	
	
	public static Student randomStudent()	{
		Random rand = new Random(); 
		
		int height = rand.nextInt(50) + 48;
		String firstName = firstNames[rand.nextInt(firstNames.length)];
		String familyName = familyNames[rand.nextInt(familyNames.length)];
		int weight = rand.nextInt(100)+100;
		double GPA = rand.nextDouble()*4.0;
		String major = majors[rand.nextInt(majors.length)];
		String club = clubs[rand.nextInt(clubs.length)];
		
		return new Student(height, firstName, familyName, major, club, weight, GPA);
		
		}
	
	public static void main(String[] args) {
		
		
		Person teacher = new Teacher(64, "Nathan", "Levin", "Java", "Mr", 140);
		
		
		Person[] studentsArr;
		studentsArr = new Person[34];
		
		for (int i=0; i<studentsArr.length;i++)	{
			studentsArr[i]= randomStudent();	
		}
		
		Classroom classroom1 = new Classroom(studentsArr, teacher);
		
		System.out.println(classroom1.printClass());
		System.out.println(classroom1.classAverage());
		
		
		
	}

}
