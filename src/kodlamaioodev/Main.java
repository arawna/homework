package kodlamaioodev;

public class Main {

	public static void main(String[] args) {
		Student ogrenci1=new Student(1,"arawna","þifreyazýyorburada","NKÜ",21201234,false);
		Student ogrenci2=new Student(2,"frozen","þifreyazýyorburada2","Hayat Okulu",4225463,false);
		Instructor ogretmen=new Instructor(3,"engin","zorþifre",100000);
		
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
