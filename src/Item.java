
public class Item {
	
	private String name;
	private int price;
	private int quantity;
	private String description;
	private int itemID;
	static int numberOfItems = 0;
	
	public Item() {
		price = 0;
		quantity = 0;
		description = "test";
		itemID = numberOfItems;
		numberOfItems++;
	}
	
	public Item(String name, int price, int quantity, String description) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		itemID = numberOfItems;
		numberOfItems++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public static int getNumberOfItems() {
		return numberOfItems;
	}

	public static void setNumberOfItems(int numberOfItems) {
		Item.numberOfItems = numberOfItems;
	}

}
