
public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	static int userID = 0; //need to make it that userID keeps being added to when making new User
	private boolean loggedIn;

	public User () {
		this.firstName = "John";
		this.lastName = "Doe";
		this.email = "JohnDoe2020@email.com";
		this.password = "password";
		userID = 0;
		this.loggedIn = false;
	}

	public User (String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		User.userID = userID + 1;
		this.loggedIn = false;
	}

	public String toString() {
		return firstName + " " + lastName + "\n" +
				email + "\n" +
				userID + "\n" +
				loggedIn;
	}

	public boolean logIn(String password) {
		loggedIn = this.password == password;

		return loggedIn;
	};

	public boolean logOut() {
		return loggedIn = false;
	};

	public void changePassword(String newPassword) {
		this.password = newPassword;
	};

//	public static void main(String[] args) {
//		User test = new User();
//		System.out.println(test);
//		test.logIn("password");
//		System.out.println(test);
//		test.logOut();
//		System.out.println(test);
//	}

}
