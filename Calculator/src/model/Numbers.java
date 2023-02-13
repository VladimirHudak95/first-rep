package model;

public class Numbers {

	private String input;
	
	public Numbers() {
	}
	
	public Numbers(String input) {
		this.input = input;
	}
	
	public String getInput() {
		return input;
	}
	
	public void setInput(String newInput) {
		this.input = newInput;
	}
	
	public double transformString() {
		double num = Double.parseDouble(input);
		return num;
	}
	
	@Override
	public String toString() {
		return input;
	}
	
	
	
		
		
	
	
	
	
	
	
	
}

