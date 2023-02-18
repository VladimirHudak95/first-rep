package testmain;

import java.util.Scanner;

import impl.Calculations;
import model.Numbers;
import model.OperationSymbol;
import model.OperationSymbol.MathSymbols;

public class TestCalc {

	public static void main(String[] args) {
		
		boolean again = true;
		Scanner in = new Scanner(System.in);
		
		while(again) {
			double result = 0.0;
			
			System.out.println("Input of the first number:");
			String a = in.next();
			Numbers first = new Numbers(a);
			
			System.out.println("Input operation symbol:");
			char s = in.next().charAt(0);
			OperationSymbol symbol = new OperationSymbol(s);
			
			in.nextLine();
			
			System.out.println("Input of the second number:");
			String b = in.next();
			Numbers second = new Numbers(b);
			
			MathSymbols ms = symbol.getSymbol();
			if(ms != null) {
				switch(ms) {
				
				case PLUS:
					result = Calculations.add(first.transformString(), second.transformString());
					break;
				case MINUS:
					result = Calculations.subtract(first.transformString(), second.transformString());
					break;
				case TIMES:
					result = Calculations.multiply(first.transformString(), second.transformString());
					break;
				case DIVISION:
					result = Calculations.divide(first.transformString(), second.transformString());
					break;
				}
				System.out.println("Result is: " + result);
			}else {
				System.out.println("Impossible to calculate with given operation symbol!");
			}
			
			System.out.println("Press y/n to go again or close the application...");
			
			char c = in.next().charAt(0);
			again = c == 'y'; 
			
		}
		System.out.println("Console application is closing...");
		in.close();
		
		
		
		System.exit(0);
	}

}
