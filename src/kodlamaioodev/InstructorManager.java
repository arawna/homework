package kodlamaioodev;

public class InstructorManager extends UserManager{
	
	public void addLesson(String lessonName) {
		System.out.println(lessonName+" Dersi eklendi");
	}
	
	public void checkHomework(Student student) {
		if(student.isCheckHomework()==true) {
			System.out.println(student.getUserName()+" �devini yapm��");
		}
		else {
			System.out.println(student.getUserName()+" �devini yapmam��");
		}
	}
}
