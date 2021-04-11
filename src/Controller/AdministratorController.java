package Controller;
import Model.Administrator;
import Model.Customer;
import Model.Privelage;
import Model.User;

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

	public void changeUserPrivelage(User user, Privelage newPrivelage) {
		if(user instanceof Customer) {
			if(currentAdmin.getPrivelage() == Privelage.ADMIN && user.getPrivelage() != Privelage.ADMIN && user.getPrivelage() != newPrivelage ) {
				user.setPrivelage(newPrivelage);
			}
		} else if(user instanceof Administrator) {
			if(newPrivelage == Privelage.MEMBER) {
				user.setPrivelage(newPrivelage);
			} else {
				System.out.println("INVALID PRIVELAGE");
			}
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

		ac.changeUserPrivelage(testCustomer, Privelage.MEMBER);
		System.out.println(testCustomer.getPrivelage());
	}

}
