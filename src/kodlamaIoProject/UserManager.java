package kodlamaIoProject;

public class UserManager {

	// Registration Operations

	public void add(User user) {
		System.out.println("Kullanýcý kaydý tamamlandý: " + user.getFirstName() + " " + user.getLastName());
	}

	public void remove(User user) {
		System.out.println("Kayýt silindi: " + user.getFirstName() + " " + user.getLastName());
	}

	public void update(User user) {
		System.out.println("Kayýt güncellendi: " + user.getFirstName() + " " + user.getLastName());
	}

	// Login Operations

	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " tarafýndan giriþ yapýldý!");
	}

	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " tarafýndan çýkýþ yapýldý!");
	}

}
