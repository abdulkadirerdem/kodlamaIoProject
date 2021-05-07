package kodlamaIoProject;

public class StudentManager extends UserManager {
	
	//One example of override:
	
	@Override
	public void add(User user) {
		System.out.println("��renci kayd� tamamland�: " + user.getFirstName() + " " + user.getLastName());
	}
	
	// Course Operations

	public void enrollTheCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kursa kat�ld�!");
	}

	public void leaveTheCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kusrtan ayr�ld�!");
	}
}
