package hometask.two;

import java.io.Serializable;

public class Car implements Serializable {
	//Enumeration Color
	private static final long serialVersionUID = 1L;
	
	enum Color{
		RED,
		BLUE,
		GREEN,
		YELLOW,
		ORANGE,
		BLACK,
		WHITE,
		GRAY,
		PURPLE,
		ROSE,
		BROWN
	}
	
	//Attribute
	protected int id;
	protected String make;
	protected String model;
	protected int yearManufacture;
	protected Color color;
	protected int price;
	protected int registrationNumber;
	
	
	//Constructor
	public Car(int id, String make, String model,int yearManufacture, Color color,int price,int registrationNumber) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearManufacture = yearManufacture;
		this.color = color;
		this.price = price;
		this.registrationNumber = registrationNumber;
	}
	
	//Setter
	public void setId(int id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYearManufacture(int yearManufacture) {
		this.yearManufacture = yearManufacture;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	//Getter	
	public int getId() {
		return this.id;
	}
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public int getYearManufacture() {
		return this.yearManufacture;
	}
	public Color getColor() {
		return this.color;
	}
	public int getPrice() {
		return this.price;
	}
	public int getRegistrationNumber() {
		return this.registrationNumber;
	}
	
	//Basic Method
	public void honking() {
		System.out.println("Beep Beep");
	}
	
	@Override
	public String toString() {
		return ("The Car Id is: "+ this.getId());
	}
	
}
