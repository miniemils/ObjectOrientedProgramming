package entities;

public class OrderItem {

	private Product product;
	private Double price;
	private Integer quantity;
	
	public OrderItem(Product product, Double price, Integer quantity) {
		super();
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", $");
		sb.append(String.format("%.2f", price) + ", Quantity: " + quantity);
		sb.append(", Subtotal: $" + String.format("%.2f", subTotal()));
		return sb.toString();
	}
	
}