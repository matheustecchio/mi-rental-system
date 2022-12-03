package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		Subtraction s1 = new Subtraction();
		Multiplication m1 = new Multiplication();
		Division d1 = new Division();

		
		a1.calculate();
		s1.calculate();
		m1.calculate();
		d1.calculate();
		
	}
}
