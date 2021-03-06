
public class Administrator extends User {

	private int adminID;
	int privelage;

	public Administrator(String firstName, String lastName, String email, String password) {
		super(firstName, lastName, email, password);
		adminID = getUserID() + 1000;
		privelage = 2;
	}

	private Customer createCustomer(String firstName, String lastName, String email, String password) {
		Customer temp = new Customer(firstName, lastName, email, password);
		return temp;
	}


	private void changeUser() {	
		//TODO
	}

	private void deleteUser() {
		//TODO
	}

}
