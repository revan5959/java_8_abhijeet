package javaguides_java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();
		for (Product product : getProduct()) {
			if (product.getPrice() > 26000f) {
				list.add(product);
			}
		}

		for (Product p : list)
			System.out.println(p);
		System.out.println("----------------- Using Stream API------------------");

		// Using Stream API
		
		getProduct().stream().filter(e->e.getPrice() > 25000f).forEach(System.out::println);
//		List<Product> list1 = getProduct().stream().filter(e -> e.getPrice() > 26000f).collect(Collectors.toList());
//		list1.stream().forEach(System.out::println);

		// getProduct().stream().filter(e-> e.getPrice() > 26000f).forEach(e->
		// System.out.println(e));

	}

	public static List<Product> getProduct() {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(100, "Laptop", 59000f));
		list.add(new Product(45, "Ipad", 30000f));
		list.add(new Product(33, "Scooty", 125000f));
		list.add(new Product(21, "Mobile", 25000f));

		return list;
	}
}

class Product {

	private int id;

	private String name;

	private float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}