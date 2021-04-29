package kodlamaioodev;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getUserName()+" Sisteme giriþ yapildi");
	}
	public void logout(User user) {
		System.out.println(user.getUserName()+" Çýkiþ yapýldý");
	}
}
