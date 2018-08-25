package exercicios.exercicioFixPolimorfismo.entities;

public class ImportedProduct extends Product {
	
	private Double custonFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double custonFee) {
		super(name, price);
		this.custonFee = custonFee;
	}
	
	public double totalPrice() {
		return super.getPrice() + custonFee; 
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " $ " + totalPrice() + " (Custom fee: $ " + custonFee + ")"; 
	}

}
