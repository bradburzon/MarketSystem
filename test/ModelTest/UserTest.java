package ModelTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Model.User;

public class UserTest {
	
	@Test 
	public void userIDTest() {
		// current ID system: one to one with number of users
		User t1 = new User();
		assertEquals(User.getNumberOfUsers(), t1.getUserID());
		User t2 = new User();
		assertEquals(User.getNumberOfUsers(), t2.getUserID());
		User t3 = new User();
		assertEquals(User.getNumberOfUsers(), t3.getUserID());
		User t4 = new User();
		assertEquals(User.getNumberOfUsers(), t4.getUserID());
		User t5 = new User();
		assertEquals(User.getNumberOfUsers(), t5.getUserID());
		
	}
	

//	@Test 
	public void newUsersGetNewPrivilage(){
		
	}
	
	@Test
	public void userLogInTest() {
		User test = new User();
		assertFalse(test.isLoggedIn());
		test.logIn("password");
		assertTrue(test.isLoggedIn());
	}
	@Test
	public void userLogOutTest() {
		User test = new User();
		assertFalse(test.isLoggedIn());
		test.logIn("password");
		assertTrue(test.isLoggedIn());
		test.logOut();
		assertFalse(test.isLoggedIn());
	}

}
