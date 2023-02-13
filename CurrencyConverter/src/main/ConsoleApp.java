package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import impl.ConverterMethods;
import model.Currency;

public class ConsoleApp {
	
	public static void main(String[] args) throws IOException {
		
		String ponovo = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("Unesite naziv valute koju zelite konvertovati: ");
			String naziv = in.readLine();
			System.out.println("Unesite naziv valute u koju zelite konvertovati: ");
			String nazivZaKonverziju = in.readLine();
			System.out.println("Unesite kolicinu novca: ");
			String kolicinaTekst = in.readLine();
			double kolicina = Double.parseDouble(kolicinaTekst);
			
			Currency currency = new Currency(naziv, kolicina);
			System.out.println();
			
			
			System.out.println("Konvertovana vrednost je: " + ConverterMethods.convert(currency, nazivZaKonverziju) 
															+ " " + nazivZaKonverziju.substring(0, 3).toUpperCase());
			
			System.out.println();
			System.out.println("Ako zelite pokrenuti konverziju ponovo za neku drugu vrednost, unesite 'da'.");
			ponovo = in.readLine();
		}while(ponovo.equalsIgnoreCase("da"));
		in.close();
		System.exit(0);
	}

}
