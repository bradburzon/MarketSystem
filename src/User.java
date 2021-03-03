
public interface User {

	String userFirstName = "";
	String userLastName = "";
	String userEmail = "";
	String userPassword = "";
	int userID = 0;
	boolean loggedIn = false;
	
	boolean logIn();
	boolean logOut();
	void changePassword();

}
