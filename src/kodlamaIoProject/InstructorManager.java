package kodlamaIoProject;

public class InstructorManager extends UserManager {

	// One example of override:

	@Override
	public void add(User user) {
		System.out.println("E�itmen kayd� tamamland�: " + user.getFirstName() + " " + user.getLastName());
	}

	// Course Operations

	public void createCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " yeni kurs olu�turdu.");
	}

	public void updateCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kursu g�ncelledi.");
	}

	public void addNewAssignment(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " yeni �dev ekledi!");
	}
}
