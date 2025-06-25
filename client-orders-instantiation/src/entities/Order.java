package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus orderStatus;
	private Client client;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	private double totalValue;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Order(Client client, Date moment, OrderStatus status) {
		super();
		this.client = client;
		this.moment = moment;
		this.orderStatus = status;
	}

	public double getTotalValue() {
		for (OrderItem item : items) {
			totalValue += item.getSubtotal();
		}
		return totalValue;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: \n");
		sb.append(sdf.format(moment) + "\n");

		sb.append("Order status: \n");
		sb.append(orderStatus + "\n");

		sb.append("Client: \n");
		sb.append(client + "\n");

		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}

		sb.append("Total price: $");
		sb.append(String.format("%.2f", getTotalValue()));
		return sb.toString();
	}

}
