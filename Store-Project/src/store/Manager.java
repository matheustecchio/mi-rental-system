package store;

//Creation of a subclass of the superclass [Person], implementing the interface [Employee] to make the polymorphism
public class Manager extends Person implements Employee{
	
	// Criação de atributos específicos
	private double salary = 6000;
	private String function = "Gerenciar e pagar os funcionarios.";
	private double bankBalance = 15000;
	
	// Methods Getters e Setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	
	// Method for viewing the balance in the bank using encapsulation/overloading
	public void seeBalance() {
	System.out.println(getName()+" is with "+getBankBalance()+" in the bank!");
	}
	
	// Method for changing the [function] variable of the [Assistant] class using encapsulation
	public void gerenciarFuncao(String function) {
		Assistant.function = function;
		System.out.println(getName()+" changed the attendant's function to: "+function);
	}
	
	// Method for changing the [salary] variable of the [Assistant] class using encapsulation
	public void manageSalary(double salary) {
		Assistant.salary = salary;
		System.out.println(getName()+" changed the attendant's salary to: "+salary);
	}
	
	// Method to add the bank balance to the salary and decrease the store's cash using encapsulation
	public void paySalary() {
		bankBalance = bankBalance + salary;
		Assistant.bankBalance = Assistant.bankBalance + Assistant.salary;
		Store.cashier = Store.cashier - salary - Assistant.salary;
		System.out.println(getName()+" paid the salary of all employees!");

	}
	
	// Method to subtract a certain amount from the attendant's bank balance and add it to the store's cashier using encapsulation (evaluation criteria)
	public void discount(double discount) {
		Assistant.bankBalance = 	Assistant.bankBalance - discount;
		Store.cashier = Store.cashier + discount;
		System.out.println(getName()+" discounted "+discount+" from the attendants!");
	}
					
		
}