
public class Administrator extends User {

	private int adminID;
	private Privelage privelage;

	public Administrator(String firstName, String lastName, String email, String password) {
		super(firstName, lastName, email, password);
		adminID = getUserID() + 1000;
		privelage = Privelage.ADMIN;;
	}

	public Administrator() {
		super();
		adminID = getUserID() + 1000;
		privelage = Privelage.ADMIN;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public Privelage getPrivelage() {
		return privelage;
	}

	public void setPrivelage(Privelage privelage) {
		this.privelage = privelage;
	}

}
