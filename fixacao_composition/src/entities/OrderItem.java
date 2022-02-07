package entities;

public class OrderItem {

	private Integer quantity;
	private Double orderPrice;
	Product product = new Product(orderPrice);

	public OrderItem() {
	}
	
	

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		this.orderPrice = subTotal();
	}



	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return orderPrice;
	}
	public void setPrice(Double price) {
		this.orderPrice = price;
	}
	
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return this.quantity * product.getPrice();
	}
	
	public String toString() {
		return String.format("%s, $%.2f, Quantity; %d, Subtotal: $%.2f", product.getName(), product.getPrice(), this.quantity, subTotal());
	}
}
