package calculator;

import javax.swing.JOptionPane;

public class Nesting {

	private double n1;
	private double n2;
	private double result;
	
	// Method Getters e Setters
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
	
	// Internal nested class with methods to calculate
	public class Calc{
		
		public void calcAdd() {
			Nesting.this.setN1((Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the first number: "))));
			Nesting.this.setN2((Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the second number: "))));
			Nesting.this.setResult(getN1() + getN2());
			JOptionPane.showMessageDialog(null, "The value of the operation is: "+Nesting.this.getResult());
		}
		
		public void calcSub() {
			Nesting.this.setN1((Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the first number: "))));
			Nesting.this.setN2((Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the second number: "))));
			Nesting.this.setResult(getN1() - getN2());
			JOptionPane.showMessageDialog(null, "The value of the operation is: "+Nesting.this.getResult());
		}
		
		public void calcMult() {
			Nesting.this.setN1((Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the first number: "))));
			Nesting.this.setN2((Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the second number: "))));
			Nesting.this.setResult(getN1() * getN2());
			JOptionPane.showMessageDialog(null, "The value of the operation is: "+Nesting.this.getResult());
		}
		
		public void calcDiv() {
			Nesting.this.setN1((Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the first number: "))));
			Nesting.this.setN2((Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the second number: "))));
			Nesting.this.setResult(getN1() / getN2());
			JOptionPane.showMessageDialog(null, "The value of the operation is: "+Nesting.this.getResult());
		}

	}
	
	// Declaring objects from nested classes inside the "Nesting" class
	static Calc c1 = new Nesting(). new Calc();

public static void main(String[] args) {
	c1.calcAdd();
	c1.calcSub();
	c1.calcMult();
	c1.calcDiv();

	}

}

