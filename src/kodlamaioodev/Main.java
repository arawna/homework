package kodlamaioodev;

public class Main {

	public static void main(String[] args) {
		Student ogrenci1=new Student(1,"arawna","�ifreyaz�yorburada","NK�",21201234,false);
		Student ogrenci2=new Student(2,"frozen","�ifreyaz�yorburada2","Hayat Okulu",4225463,false);
		Instructor ogretmen=new Instructor(3,"engin","zor�ifre",100000);
		
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		
		instructorManager.login(ogretmen);
		studentManager.login(ogrenci1);
		instructorManager.addLesson("Java Kursu");
		instructorManager.logout(ogretmen);
		
				
		studentManager.watchLesson(ogrenci1);
		studentManager.watchLesson(ogrenci2);
		instructorManager.checkHomework(ogrenci1);
		studentManager.doHomework(ogrenci1);
		instructorManager.checkHomework(ogrenci1);

	}

}
