package kodlamaioodev;

public class StudentManager extends UserManager{
	public void watchLesson(User user) {
		System.out.println(user.getUserName()+" Dersi izledi");
	}
	public void doHomework(Student student) {
		student.setCheckHomework(true);
		System.out.println(student.getUserName()+" Ödevi yaptý");
	}
}
