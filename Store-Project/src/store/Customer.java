package store;

//Creating the subclass of the superclass [Person]
public class Customer extends Person {
	
	private double money = 50;
	
	// Methods Getters e Setters
	public double getMoney() {
		return money;
	}
	
	// Method to visualize the amount of money at the moment, using encapsulation
	public void seeMoney() {
		System.out.println(getName()+" has "+getMoney()+" in your pocket!");
	}
	// Method to add value to the variable money
	public void withdrawMoney(double quantity) {
		money = money + quantity;
		System.out.println(getName()+" drew "+quantity+"!");
	}
	
	public void seeProducts() {
		System.out.println("The available products are:\n1. shirt\n2. pants\n3. shoes shoes\n4. socks");
	}
	
	// switch-case repetition structure to query the price of each product in the store
	public void consultarPreco(int product) {
		switch(product){
		case 1: {
			System.out.println("The price of the shirt is: "+Store.shirt+".");
			break;
		}
		case 2: {
			System.out.println("The price of the pants is:  "+Store.pants+".");
			break;
		}
		case 3: {
			System.out.println("The price of the shoes is:  "+Store.shoes+".");
			break;
		}
		case 4: {
			System.out.println("The price of the socks is:  "+Store.socks+".");
			break;
		}
		}
	}
	// Switch-case conditional structure together with other if and else conditional structures
	public void buy(int product) {
		switch(product){
		case 1: {
			if(getMoney() >= Store.shirt) {
				money = money - Store.shirt;
				System.out.println(getName()+" just bought an shirt by "+Store.shirt);
			} else {
				System.out.println(getName()+" not enough money to buy a shirt! You're still missing: "+(Store.shirt - money));
			}
		break;
		}
		case 2: {
			if(getMoney() >= Store.pants) {
				money = money - Store.shoes;
				System.out.println(getName()+" just bought an pants by "+Store.pants);
			} else {
				System.out.println(getName()+" not enough money to buy a pants! You're still missing: "+(Store.pants - money));
			}
		break;
		}
		case 3: {
			if(getMoney() >= Store.shoes) {
				money = money - Store.shoes;
				System.out.println(getName()+" just bought an shoes by "+Store.shoes);
			} else {
				System.out.println(getName()+" not enough money to buy a shoes! You're still missing: "+(Store.shoes - money));
			}
		break;
		}
		case 4: {
			if(getMoney() >= Store.socks) {
				money = money - Store.socks;
				System.out.println(getName()+" just bought an socks by "+Store.socks);
			} else {
				System.out.println(getName()+" not enough money to buy a socks! You're still missing: "+(Store.socks - money));
			}
		break;
		}
		default: {
			System.out.println("Sorry! The product doesn't exist!");
		break;
		}
		}
	}
}
