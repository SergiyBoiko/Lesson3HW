package inventory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import product.*;

public class Inventory {

	private Collection<Product> product = new ArrayList<>();
	private double sumPrice = 0.0;

	public Inventory() {
		product.add(new Coffee("Espresso",45.99,10));
		product.add(new Tea("RANDY",34.49,3));
		product.add(new Cream("Edeka",39.99,15));
	}

	public Collection<Product> allProduct() {
		return product;
	}

	public void addProduct(Product prod) {
		if(product.contains(prod)){
			int count = ((ArrayList<Product>) product).indexOf(prod);
			Product products = ((ArrayList<Product>) product).get(count);
			products.setPriceProduct(prod.getPriceProduct());
			products.setQuantityOnHandProduct(prod.getQuantityOnHandProduct());
		}else {
			product.add(prod);
		}
	}

	public double calculeteSumPrice() {
		for(Product c : product){
			sumPrice += c.getPriceProduct() * c.getQuantityOnHandProduct();
		}
		return sumPrice;
	}
	public Map<String, Double> calculeteProductsPrice() {
		Map<String, Double> res = new HashMap<>();

		for (Product c : product) {
			res.put(c.getNameProduct(), c.getPriceProduct() * c.getQuantityOnHandProduct());
		}
		return res;
	}


}
