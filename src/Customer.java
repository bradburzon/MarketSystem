
public class Customer extends User{

	private ItemContainer selling;
	private int balance;
	private ItemContainer cart;
	private Order lastOrder;
	// TODO itemSold, orderHistory,

	public Customer() {
		selling = new ItemContainer();
		balance = 0;
		cart = new ItemContainer();
		lastOrder = null;
	}
	
	public Customer(String firstName, String lastName, String email, String password) {
		super(firstName, lastName, email, password);
		selling = new ItemContainer();
		balance = 0;
		cart = new ItemContainer(); 
		lastOrder = null;
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

	public Order getLastOrder() {
		return lastOrder;
	}

	public void setLastOrder(Order lastOrder) {
		this.lastOrder = lastOrder;
	}

}
