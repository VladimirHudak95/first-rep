package model;

public class OperationSymbol {

	public enum MathSymbols{
		PLUS,
		MINUS,
		TIMES,
		DIVISION
	}
	
	private char symbol;
	
	public OperationSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	public MathSymbols getSymbol() {
		
		switch(symbol) {
		
		case '+':
			return MathSymbols.PLUS;
		case '-':
			return MathSymbols.MINUS;
		case '*':
			return MathSymbols.TIMES;
		case '/':
			return MathSymbols.DIVISION;
		default:
			return null;
		}
	}
	
}
