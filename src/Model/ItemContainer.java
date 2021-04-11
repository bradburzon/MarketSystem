import java.util.HashSet;

public class ItemContainer {

	private HashSet<Item> container;
	private int totalPrice;
	private int numberOfItems;
	
	public ItemContainer() {
		container = new HashSet<Item>();
		totalPrice = 0;
		numberOfItems = 0;
	}
	
	public ItemContainer(HashSet<Item> container, int totalPrice) {
		this.container = container;
		this.totalPrice = totalPrice;
		numberOfItems = container.size();
	}

	public HashSet<Item> getContainer() {
		return container;
	}

	public void setContainer(HashSet<Item> container) {
		this.container = container;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	
}
