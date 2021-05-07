package kodlamaIoProject;

public class StudentManager extends UserManager {
	
	//One example of override:
	
	@Override
	public void add(User user) {
		System.out.println("Öðrenci kaydý tamamlandý: " + user.getFirstName() + " " + user.getLastName());
	}
	
	// Course Operations

	public void enrollTheCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kursa katýldý!");
	}

	public void leaveTheCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kusrtan ayrýldý!");
	}
}
