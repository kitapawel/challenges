package com.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product
{
	private int prodId;
	private String productName;
	private double price;
	private int qty;
	private String sellerName;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	public Product(int prodId, String productName, double price, int qty, String sellerName) {
		super();
		this.prodId = prodId;
		this.productName = productName;
		this.price = price;
		this.qty = qty;
		this.sellerName = sellerName;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", productName=" + productName + ", price=" + price + ", qty=" + qty
				+ ", sellerName=" + sellerName + "]";
	}
	
	public static List<Product> addValues(){
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(333, "Fallout 4", 49, 3, "Bethesda"));
		productList.add(new Product(125, "Skyrim", 29.99, 11, "Bethesda"));
		productList.add(new Product(267, "TESO", 19.99, 100, "Zenimax"));
		productList.add(new Product(69, "World of Warcraft", 59.50, 100, "Blizzard"));
		productList.add(new Product(7, "Doom", 39.99, 45, "ID software"));
		productList.add(new Product(450, "Hunt", 35.99, 45, "Crytek"));
		return productList;
	}
}

public class StreamsDemo {

	public static void main(String[] args) 
	{	
		//Stream from values
		Stream<String> fromValues = Stream.of("apple", "pear", "orange", "strawberry");
		System.out.println("Stream from values: ");
		fromValues.forEach(System.out::println);
		System.out.println("");
		
		//Stream from Collections
		List<String> fruitList = Arrays.asList("apple", "pear", "orange", "strawberry");
		Stream<String> fromCollections = fruitList.stream();
		System.out.println("Stream from Collections: ");
		fromCollections.forEach(System.out::println);
		System.out.println("");
		
		//Stream from Arrays
		String[] fruitArray = {"apple", "pear", "orange", "strawberry"};
		Stream<String> fromArrays = Arrays.stream(fruitArray);
		System.out.println("Stream from Arrays: ");
		fromArrays.forEach(System.out::println);
		System.out.println("");
		
		List<Product> productList = Product.addValues();
		System.out.println("The original list of games: ");
		productList.forEach(System.out::println);
		
		System.out.println("The list after filtering and sorting: ");
		productList.stream()
		.filter(p -> p.getPrice() < 30)
		.sorted((p2,p1) -> p1.getProductName().compareTo(p2.getProductName()))
		.forEach(System.out::println);
		
		System.out.println("Cheapest game: ");
		Optional<Product> pr = productList.stream().reduce((p1, p2) -> p1.getPrice() < p2.getPrice() ? p1:p2);
		System.out.println(pr.get());
		
		System.out.println("Flatmap method: ");
		List<Integer> summarized = Stream.of(Arrays.asList(1, 2), Arrays.asList(3,4)).flatMap(number -> number.stream())
				.collect(Collectors.toList());
		summarized.forEach((i) -> System.out.println(i));
		
	}
	
	
	
}
