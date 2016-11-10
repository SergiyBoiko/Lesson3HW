package product;

public class Product {
	private String nameProduct;
	private double priceProduct;
	private int quantityOnHandProduct;

	public Product(String  name, double price, int quantity) {
		this.nameProduct = name;
		this.priceProduct = price;
		this.quantityOnHandProduct = quantity;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public int getQuantityOnHandProduct() {
		return quantityOnHandProduct;
	}

	public void setQuantityOnHandProduct(int quantityOnHandProduct) {
		this.quantityOnHandProduct = quantityOnHandProduct;
	}

	public void addQuantity(int quantity){
		this.quantityOnHandProduct += quantity;
	}
	
	public String toString() {
		String str = getClass().getSimpleName();
		return str+" {" +
				"name='" + nameProduct + '\'' +
				", price=" + priceProduct +
				", quantity=" + quantityOnHandProduct +
				'}';
	}

}
