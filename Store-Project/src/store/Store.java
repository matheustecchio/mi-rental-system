package store;

public class Store {
	
	static double cashier = 50000;
	static double shirt = 50;
	static double pants = 35;
	static double shoes = 70;
	static double socks = 5;
	

	// Methods Getters e Setters
	public static double getShirt() {
		return shirt;
	}
	public static void setShirt(double shirt) {
		Store.shirt = shirt;
	}
	public static double getPants() {
		return pants;
	}
	public static void setPants(double pants) {
		Store.pants = pants;
	}
	public static double getShoes() {
		return shoes;
	}
	public static void setShoes(double shoes) {
		Store.shoes = shoes;
	}
	public static double getSocks() {
		return socks;
	}
	public static void setSocks(double socks) {
		Store.socks = socks;
	}
	public static double getCashier() {
		return cashier;
	}
	
	
	// Method for viewing the store's cashier using encapsulation
	public void seeCashier() {
		System.out.println("The store's cashier is with: "+getCashier());
		
	}
}
