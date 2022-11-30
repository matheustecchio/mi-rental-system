package calc;

public class Calculator {
	
	int salesPredict = 200;
	int prodution = 250;
	int initialStock = 50;
	int closeStock;
	
	public void calculate() {
		
	closeStock = (initialStock + prodution)-salesPredict;
		
	System.out.println("The expected closing stock for the month is " +closeStock + " units.");
	}
	

}
