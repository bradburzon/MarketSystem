
public class AdministratorController {

	Administrator currentAdmin;

	public AdministratorController(Administrator currentAdmin) {
		this.currentAdmin = currentAdmin;
	}

	public Administrator getCurrentAdmin() {
		return currentAdmin;
	}

	public void setCurrentAdmin(Administrator currentAdmin) {
		this.currentAdmin = currentAdmin;
	}

	public void changeUserPrivelage(User user, int newPrivelage) {
		if(newPrivelage >= 0 && newPrivelage < 3) {
			if(user instanceof Customer) {
				if(currentAdmin.getPrivelage() >= 2 && user.getPrivelage() <= 1 && user.getPrivelage() != newPrivelage) {
					user.setPrivelage(newPrivelage);
				}
			} else if(user instanceof Administrator) {
				if(currentAdmin.getPrivelage() > user.getPrivelage()) {
					user.setPrivelage(newPrivelage);
				}
			}
		} else {
			System.out.println("INVALID PRIVELAGE");
		}
	}

	//	public Customer createCustomer(String firstName, String lastName, String email, String password) {
	//	Customer temp = new Customer(firstName, lastName, email, password);
	//	return temp;
	//  }
	//	public void deleteUser(User u) {
	//	}
	public static void main(String[] args) {
		Administrator admin = new Administrator();
		AdministratorController ac = new AdministratorController(admin);
		Customer testCustomer = new Customer();
		
		ac.changeUserPrivelage(testCustomer, 2);
		System.out.println(testCustomer.getPrivelage());
		
	}

}
