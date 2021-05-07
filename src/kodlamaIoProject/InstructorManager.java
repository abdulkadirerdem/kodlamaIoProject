package kodlamaIoProject;

public class InstructorManager extends UserManager {

	// One example of override:

	@Override
	public void add(User user) {
		System.out.println("Eðitmen kaydý tamamlandý: " + user.getFirstName() + " " + user.getLastName());
	}

	// Course Operations

	public void createCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " yeni kurs oluþturdu.");
	}

	public void updateCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kursu güncelledi.");
	}

	public void addNewAssignment(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " yeni ödev ekledi!");
	}
}
