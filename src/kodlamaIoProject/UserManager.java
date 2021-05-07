package kodlamaIoProject;

public class UserManager {

	// Registration Operations

	public void add(User user) {
		System.out.println("Kullan�c� kayd� tamamland�: " + user.getFirstName() + " " + user.getLastName());
	}

	public void remove(User user) {
		System.out.println("Kay�t silindi: " + user.getFirstName() + " " + user.getLastName());
	}

	public void update(User user) {
		System.out.println("Kay�t g�ncellendi: " + user.getFirstName() + " " + user.getLastName());
	}

	// Login Operations

	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " taraf�ndan giri� yap�ld�!");
	}

	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " taraf�ndan ��k�� yap�ld�!");
	}

}
