
public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int userID; //need to make it that userID keeps being added to when making new User
	static int numberOfUsers = 0;
	private boolean loggedIn;


	public User () {
		this.firstName = "John";
		this.lastName = "Doe";
		this.email = "JohnDoe2020@email.com";
		this.password = "password";
		this.loggedIn = false;
		userID = numberOfUsers;
		User.numberOfUsers++;
	}

	public User (String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.loggedIn = false;
		userID = numberOfUsers;
		User.numberOfUsers++;
	}

	public String toString() {
		return firstName + " " + lastName + "\n" +
				email + "\n" +
				userID + "\n" +
				loggedIn;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public String getFirstName() {
		return firstName;
	}

	public boolean logIn(String password) {
		loggedIn = this.password.equals(password);

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
