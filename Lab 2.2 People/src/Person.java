
public abstract class Person {
	
	private int height; //inches
	private String firstName, familyName;
	private double weight; //pounds
	
	public Person(int height, String firstName, String familyName, double weight) {
		
		this.height = height;
		this.firstName = firstName;
		this.familyName = familyName;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
	

	