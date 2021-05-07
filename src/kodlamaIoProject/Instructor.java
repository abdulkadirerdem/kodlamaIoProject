package kodlamaIoProject;

public class Instructor extends User {
	
	private String profession;

	public Instructor() {
	}
	
	public Instructor(String firstName, String lastName, String email, String password, String profession) {
		super( firstName, lastName, email, password);
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
