package exercicios.exercicioFixPolimorfismo.entities;

import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactoreDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactoreDate) {
		super(name, price);
		this.manufactoreDate = manufactoreDate;
	}

	public Date getManufactoreDate() {
		return manufactoreDate;
	}

	public void setManufactoreDate(Date manufactoreDate) {
		this.manufactoreDate = manufactoreDate;
	}

	@Override
	public String priceTag() {
		return super.getName() + " (used) $ " + super.getPrice() + " (Manufacture date: " + manufactoreDate + ")";
	}

}
