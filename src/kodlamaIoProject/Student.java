package kodlamaIoProject;

public class Student extends User {

	private String school;
	private String departmant;

	public Student() {
	}

	// Field
	
	public Student(int id, String firstName, String lastName, String email, String password, String school,
			String departmant) {

		super(firstName, lastName, email, password);

		this.school = school;
		this.departmant = departmant;
	}
	
	// Getting && Setting

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDepartmant() {
		return departmant;
	}

	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}
}
