package polymorphism;

import javax.swing.JOptionPane;

public class Division {
	
	private double n1;
	private double n2;
	private double result;
	
    // Methods getter and setter
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}

	// Method to calculate the expression, with the JOptionPane library, using the interface method, but dividing
	public void calculate() {
		setN1(Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the first number: ")));
		setN2(Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the second number: ")));
		setResult(getN1() / getN2());
		JOptionPane.showMessageDialog(null, "The value of the operation is: "+getResult());
	}
}
