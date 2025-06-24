package entities;

import java.time.Instant;

import entities.enums.OrderStatus;

public class Order {
	private Instant moment;
	private OrderStatus orderStatus;
	private int items;

	public Instant getMoment() {
		return moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Order(OrderStatus status, int items) {
		super();
		this.moment = Instant.now();
		this.orderStatus = status;
		this.items = items;
	}

}
