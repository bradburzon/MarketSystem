package Model;
public class Customer extends User{

	private ItemContainer cart, selling, itemsSold;
	private int balance;
	private Order lastOrder; // TODO replace with orderHistory,

	public Customer() {
		super();
		selling = new ItemContainer();
		balance = 0;
		cart = new ItemContainer();
		itemsSold = new ItemContainer();
		lastOrder = null;
	}
	
	public Customer(String firstName, String lastName, String email, String password) {
		super(firstName, lastName, email, password);
		selling = new ItemContainer();
		balance = 0;
		cart = new ItemContainer(); 
		itemsSold = new ItemContainer();
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

	public ItemContainer getItemsSold() {
		return itemsSold;
	}

	public void setItemsSold(ItemContainer itemsSold) {
		this.itemsSold = itemsSold;
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
