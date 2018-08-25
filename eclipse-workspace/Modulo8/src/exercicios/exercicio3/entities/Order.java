package exercicios.exercicio3.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicios.exercicio3.entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> orderList = new ArrayList<>();

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

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public List<OrderItem> getOrderList() {
		return orderList;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		orderList.add(item);
	}

	public void removeItem(OrderItem item) {
		orderList.remove(item);
	}

	public double total() {
		double sum = 0;
		for (OrderItem i : orderList) {
			sum += i.subTotal();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY:\n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + client.getBirthDate() + ") - " + client.getEmail() + "\n");
		sb.append("Order Itens:" + "\n");

		for (OrderItem i : orderList) {
			sb.append(i.getProduct().getName() + ", $" + i.getPrice() + ", Quantity: " + i.getQuantity()
					+ ", Subtotal: $" + i.subTotal() + "\n");
		}
		sb.append("Total price: $" + total());
		return sb.toString();
	}

}
