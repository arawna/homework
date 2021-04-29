package kodlamaioodev;

public class Student extends User{
	private String schoolName;
	private int schoolNumber;
	private boolean checkHomework;
	
	public Student() {
		
	}
	
	public Student(int id,String userName,String password,String schoolName, int schoolNumber, boolean checkHomework) {
		super();
		this.setId(id);
		this.setUserName(userName);
		this.setPassword(password);
		this.schoolName = schoolName;
		this.schoolNumber = schoolNumber;
		this.checkHomework = checkHomework;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	public boolean isCheckHomework() {
		return checkHomework;
	}
	public void setCheckHomework(boolean checkHomework) {
		this.checkHomework = checkHomework;
	}
}
