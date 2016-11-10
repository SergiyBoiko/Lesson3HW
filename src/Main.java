import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import inventory.*;
import product.Product;
public class Main {

	public static void main(String [] args){
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Inventory inver = new Inventory();
		while(true){
			System.out.println("1.Show all products \n" +
					"2.Add new product \n" +
					"3.Calculete price all product\n" +
					"4.Calculate the price for particular\n" +
					"0.Exit\n");

			switch(in.nextInt()){
			case 1:
				Collection<Product> product = inver.allProduct();
				for(Product c : product){
					System.out.println(c.toString());
				}
				break;
			case 2:
				Product readProduct = readNewProduct();
				inver.addProduct(readProduct);
				break;
			case 3:
				double sumAllPriceProduct = inver.calculeteSumPrice();
				System.out.println(sumAllPriceProduct);
				break;
			case 4:
				Map<String, Double> productPrice = inver.calculeteProductsPrice();
				for (Map.Entry<String, Double> c : productPrice.entrySet()) {
					System.out.printf("Price of %s = %.2f.\n", c.getKey(), c.getValue());
				}
				break;
			case 0:
				System.exit(0);
				break;
			}
			System.out.println("\n\n");
		}
	}
	private static Product readNewProduct()  {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter name of product: ");
		String name = in.nextLine();
		System.out.println("Please enter price of product: ");
		double price = Double.parseDouble(in.nextLine());
		System.out.println("Please enter quantity of product: ");
		int quantity = Integer.parseInt(in.nextLine());
		////Product newProduct = new Product(name, price, quantity); 
		return  null;
	}
}

