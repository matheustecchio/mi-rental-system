package calculator;

public class Area {
	
	private double result;

	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
	// The next methods have the same name, but different parameters, creating an overloading
	
	public void calculate(double side) {
		setResult(side * side);
		System.out.println("The area of the square is: "+getResult());
	}
	
	public void calculate(double base, double height) {
		setResult(base * height);
		System.out.println("The area of the rectangle is: "+getResult());
	}
	
	public void calculate(double majorBase, double minorBase, double height) {
		setResult(majorBase * minorBase * height / 2);
		System.out.println("The area of the trapezoid is: "+getResult());
	}


}
