import java.util.Random;
public class Runner {
	
	private static String[] firstNames = {"Simon, Cassandra, Bobby, Martha, Lindsie, Jamie, Hubert, Mack, Damon, Kristen, "
			+ "Doug, Nathan, Moses, Lauren, Jessie, Kate, Nick, Eric, Erim, Ethan, "
			+ "Sunny, Timothy, William, Christy, Susie, Becky, Anne, Vivian, Emily, Kelly,"
			+ "Kimberly, Julie, Harriet, Krstal, Philip, Bertha, Karen, Anoodies, Sally, Keisha,"
			+ "Antonio, Matthew, Lance, Casey, Toby, Lorena, Israel, Patsy, Alexander, Ignacio,"
			+ "Marrio, Luigi, Warrio, Waluigi, Bowser, Peach, Daisy, Yoshi, Link, Zelda"};
	
	private static String[] familyNames = {"Bob"};
	private static String[] majors = {"Physics"};
	private static String[] clubs = {"Bouldering"};
	
	
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
		Person teacher= new Teacher();
		Person[] students = new Person[34];
		for (int i=0; i<34; i++)	{
			
		}
		
		
	}

}
