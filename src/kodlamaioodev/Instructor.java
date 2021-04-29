package kodlamaioodev;

public class Instructor extends User{
	private int instructorNumber;
	
	public Instructor() {
		
	}

	public Instructor(int id,String userName,String password,int instructorNumber) {
		this.setId(id);
		this.setUserName(userName);
		this.setPassword(password);
		this.instructorNumber = instructorNumber;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

}
