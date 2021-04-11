package Model;

public class Order {

	private ItemContainer items;
	private String dateOrdered;
	private int totalPrice;
	private OrderStatus status;
	private int orderID;
	private static int numberOfOrders = 0;
	
	public Order(ItemContainer items, String dateOrdered, int totalPrice) {
		this.items = items;
		this.dateOrdered = dateOrdered;
		this.totalPrice = totalPrice;
		status = OrderStatus.NEW;
		orderID = numberOfOrders++;
	}

	public ItemContainer getItems() {
		return items;
	}

	public void setItems(ItemContainer items) {
		this.items = items;
	}

	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public static int getNumberOfOrders() {
		return numberOfOrders;
	}

	public static void setNumberOfOrders(int numberOfOrders) {
		Order.numberOfOrders = numberOfOrders;
	}
	
}
