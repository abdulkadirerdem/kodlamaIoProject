package kodlamaIoProject;

public class Main {

	public static void main(String[] args) {

		// User Create, Update, Remove

		Instructor instructor = new Instructor("Abdulkadir", "Erdem", "test@test.com", "123abc", "Software Engineer");

		Student student = new Student();
		student.setFirstName("Bahadır");
		student.setLastName("Alacücük");
		student.setEmail("test.test@test.com");
		student.setPassword("321cba");
		student.setSchool("Sakarya Üniversitesi");
		student.setDepartmant("Industrial Engineer");

		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();

		instructorManager.add(instructor);
		studentManager.add(student);

		instructorManager.remove(instructor);
		studentManager.remove(student);

		instructorManager.update(instructor);
		studentManager.update(student);

		System.out.println("----------------------------");

		// Course Operations

		instructorManager.createCourse(instructor);
		instructorManager.updateCourse(instructor);
		instructorManager.addNewAssignment(instructor);

		studentManager.enrollTheCourse(student);
		studentManager.leaveTheCourse(student);
		
	}

}
