package entrega3_template_method_7_2;

import java.util.Comparator;

public class Comparators implements Comparator<Double> {
	public int compare(Double d1, Double d2) {
		Double d1decimal = d1 - Math.floor(d1); 
		Double d2decimal = d2 - Math.floor(d2);
		return d1decimal.compareTo(d2decimal); 
	}
}