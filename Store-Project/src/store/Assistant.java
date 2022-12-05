package store;

//Creation of a subclass of the superclass [Person], implementing the interface [Employee] to make the polymorphism
public class Assistant extends Person implements Employee{
	
	// Creation of specific attributes
	static double salary = 1500;
	static String function = "Attending to customers and selling the products.";
	static double bankBalance = 4000;

	
	// Methods Getters e Setters
	public double getSalary() {
		return salary;
	}
	public String getFunction() {
		return function;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	
	// Method for viewing the balance in the bank using encapsulation/overloading
	public void seeBalance() {
	System.out.println(getName()+" is with "+getBankBalance()+" in the bank!");
	}
	
	
	
}
