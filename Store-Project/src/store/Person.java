package store;

//Creation of the superclass
public class Person {
	
	// Creation of generic attributes
	private String name;
	private String birthDate;
	private String phone;
	private String email;
	private double bankBalance;
	
	// Methods Getters e Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	// Generic method for defining superclass variables through encapsulation
	public void register(String name, String birthDate, String phone, String email, int bankBalance) {
		setName(name);
		setBirthDate(birthDate);
		setPhone(phone);
		setEmail(email);
		setBankBalance(bankBalance);
		System.out.println(getName()+" successfully registered!");

	}
}
