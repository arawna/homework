package kodlamaioodev;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getUserName()+" Sisteme giri� yapildi");
	}
	public void logout(User user) {
		System.out.println(user.getUserName()+" ��ki� yap�ld�");
	}
}
