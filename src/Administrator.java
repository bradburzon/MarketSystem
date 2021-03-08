import java.util.HashSet;

public class Administrator extends User {

	private int adminID;
	private int privelage;

	public Administrator(String firstName, String lastName, String email, String password) {
		super(firstName, lastName, email, password);
		adminID = getUserID() + 1000;
		privelage = 2;
	}

	public Administrator() {
		super();
		adminID = getUserID() + 1000;
		privelage = 2;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public int getPrivelage() {
		return privelage;
	}

	public void setPrivelage(int privelage) {
		this.privelage = privelage;
	}



}
