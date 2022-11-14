package com.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		Person per1 = new Person("Pawe³", "Kita", 40, 90.7f);
		Person per2 = new Person("Dua", "Lipa", 41, 60.1f);
		Person per3 = new Person("Andrzej", "Nowak", 22, 75.5f);
		Person per4 = new Person("Marta", "Zdun", 15, 40.8f);
		
		List<Person> persons = Arrays.asList(per1, per2, per3, per4);
		
		//Lambda for-each traversal
		persons.forEach(person-> System.out.println(person.getfName()));
		
		System.out.println("");
		System.out.println("---Predicate interface---");
		System.out.println("People based on age:");
		evaluate(persons, p-> (p.getAge() > 20));
		System.out.println("People based on weight:");
		evaluate(persons, p-> (p.getWeight() < 60));
		
		System.out.println("");
		System.out.println("---Function interface---");
		for(Person p : persons) {
			int timeToRetirement = calculateTimeToRetirement(p, p1 -> 65 - p1.getAge());
			
			System.out.println(p.getfName() + " " + p.getlName() + " has " + timeToRetirement + " years to retirement.");
		}
		
		System.out.println("");
		System.out.println("---Consumer interface---");
		System.out.println("---Full report---");
		generateReport(persons, p -> System.out.println(p.getfName() + " " + p.getlName() + "; age: " + p.getAge() + "; weight: " + p.getWeight()));
		System.out.println("---Anonymous report---");
		generateReport(persons, p -> System.out.println("Person's age: " + p.getAge() + " and weight: " + p.getWeight()));
	
		System.out.println("");
		System.out.println("---Consumer interface---");
		for(Person p:persons){
			showBMI(()-> p);
		}
		
	}

	
	public static void evaluate(List<Person> list, Predicate<Person> predicate) 
	{
		for (Person id : list){
			if(predicate.test(id)) {
				System.out.println(id.getfName() + " " + id.getlName());
			}
		}
	}
	
	public static int calculateTimeToRetirement(Person p, Function<Person, Integer> function) {
		return function.apply(p);
	}
	
	public static void generateReport(List<Person> list, Consumer<Person> consumer) {
		for (Person p : list) {
			consumer.accept(p);
		}
	}
	
	public static void showBMI(Supplier<? extends Person> supplier) {
		System.out.println(supplier.get().getfName()+ " " + supplier.get().getlName()+":"+supplier.get().generateBMI());
	}
	
}

class Person {
	
	private String fName;
	private String lName;
	private int age;
	private double weight;
	
	public Person() {
		
	}
	
	public Person(String fName, String lName, int age, double weight) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.weight = weight;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double generateBMI() {
		System.out.println("Person's BMI is:");
		return getWeight() / (1.78 * 1.78);
	}
	
}
