
public class Teacher extends Person{
	
	private String subject;
	
	private String title; //Mr, Ms, Mx, Mrs
	
	
	
	public Teacher(int height, String firstName, String familyName, String subject, String title, double weight) {
		super(height, firstName, familyName, weight);
		this.subject = subject;
		this.title = title;

	}


	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return getTitle() + ". " + getFamilyName();
	}

}
