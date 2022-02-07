package entities;

import static commons.DateUtils.formatDateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Client getClient() {
		return client;
	}

	public double total() {
		return items.stream().mapToDouble(i-> i.subTotal()).sum();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: ").append("\n")
			.append("Order moment: ").append(formatDateTime(moment)).append("\n")
			.append("Order status: ").append(status).append("\n")
			.append("Client: ").append(client).append("\n")
			.append("Order items: ").append("\n")
			.append(items.stream().map(i-> i.toString()).collect(Collectors.joining("\n"))).append("\n")
			.append("Total Price: $").append(total());
	
		return sb.toString();
	}
	
	
}
