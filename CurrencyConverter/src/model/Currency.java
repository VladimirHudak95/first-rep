package model;

public class Currency {
	
	private double value;
	private String name;
	
	public Currency() {
		
	}
	
	public Currency(String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public double getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return value + " " + name.substring(0, 2).toUpperCase();
	}
	
	
}
