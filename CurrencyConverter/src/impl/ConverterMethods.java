package impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import model.Currency;

public class ConverterMethods {

	public static double convert(Currency currency, String convertedCurrency) {
		
		if(!(convertedCurrency.equalsIgnoreCase("dolar") || convertedCurrency.equalsIgnoreCase("dinar")
				|| convertedCurrency.equalsIgnoreCase("euro"))) {
			
			return 0.0;
		}
		
		double value = 0.0;
		
		if(currency.getName().equalsIgnoreCase(convertedCurrency)) {
			value =  currency.getValue();
		}
		
		if(currency.getName().equalsIgnoreCase("dinar")) {
			switch(convertedCurrency) {
			case "dolar":
				value =  currency.getValue() * 0.0093;
				break;
			case "euro":
				value = currency.getValue() * 0.0085;
				break;
			}
		}else if(currency.getName().equalsIgnoreCase("dolar")){
			switch(convertedCurrency) {
			case "dinar":
				value = currency.getValue() * 108;
				break;
			case "euro":
				value =  currency.getValue() * 0.92;
				break;
			}
		}else {
			switch(convertedCurrency) {
			case "dinar":
				value = currency.getValue() * 117.39;
				break;
			case "dolar":
				value = currency.getValue() * 1.09;
				break;
			}
		}
		
		BigDecimal bd = new BigDecimal(value).setScale(4, RoundingMode.HALF_EVEN);
		double newValue = bd.doubleValue();
		
		return newValue;
	}
	
}
