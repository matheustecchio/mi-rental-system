package finalmethods;

import javax.swing.JOptionPane;

public class FinalMethods {
	
	// Variable with the "final" argument
	private final double markup = 1.54;
	private double buyPrice;
	private double sellPrice;
	
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	
	// Method with the "final" argument
	public final void calc() {
		setBuyPrice(Double.parseDouble(JOptionPane.showInputDialog("Insert the buying price: ")));
		setSellPrice(markup * getBuyPrice());
		JOptionPane.showMessageDialog(null, "The selling price is: "+getSellPrice());
	}


}
