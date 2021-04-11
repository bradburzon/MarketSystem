package Model;
import java.util.Scanner;

public class Market {

	public Customer createCustomer() {
		Scanner sc = new Scanner(System.in);
		String firstName;
		String lastName;
		String email;
		String password;
		System.out.println("Enter first name: ");
		firstName = sc.next();
		System.out.println("Enter last name: ");
		lastName = sc.next();
		System.out.println("Enter email: ");
		email = sc.next();
		if(!validateEmail(email)) {
			System.out.println("Invalid Email - Enter email: ");
			email = sc.next();
		}
		System.out.println("Enter password: ");
		password = sc.next();

		sc.close();
		Customer temp = new Customer(firstName, lastName, email, password);
		return temp;
	}

	private boolean validateEmail(String email) {
		// TODO
		return true;
	}

}