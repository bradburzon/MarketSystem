public class Customer extends User{

	private ItemContainer selling;
	private int balance;
	private ItemContainer cart;
	// itemSold, orderHistory,

	public Customer() {
		selling = new ItemContainer();
		balance = 0;
		cart = new ItemContainer(); 
	}
	
	public Customer(String firstName, String lastName, String email, String password) {
		super(firstName, lastName, email, password);
		selling = new ItemContainer();
		balance = 0;
		cart = new ItemContainer(); 
	}

	public ItemContainer getSelling() {
		return selling;
	}

	public void setSelling(ItemContainer selling) {
		this.selling = selling;
	}

	public ItemContainer  getCart() {
		return cart;
	}

	public void setCart(ItemContainer cart) {
		this.cart = cart;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

//	public static void main(String[] args) {
//		Customer test = new Customer();
//		Customer test2 = new Customer();
//		Customer test3 = new Customer();
//		Customer test4 = new Customer();
//		System.out.println(test.getUserID());
//		System.out.println(test2.getUserID());
//		System.out.println(test3.getUserID());
//		System.out.println(test4.getUserID());
//
//		
//	}

}
