package calc;

import javax.swing.JOptionPane;
public class Calculator {
		
		private double base;
		private double height;
		private double length;
		private double volume;

		public void calculate() {
	
		base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base value: "));
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter the base value: "));
		length = Double.parseDouble(JOptionPane.showInputDialog("Enter the base value: "));
		
		volume = (base * height * length);
		
		JOptionPane.showMessageDialog(null, "The volume of concrete is " + volume+ "m²");
		
	}
}
