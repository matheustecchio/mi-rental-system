package store;


//Creation of the theme class, to represent the chosen project
public class Main {
	public static void main(String[] args) {
		
		Store store = new Store();
		Manager brian = new Manager();
		Assistant gael = new Assistant();
		Customer aveleen = new Customer();


		brian.register("Brian Connor", "27/08/1982", "998 054 874", "brianconnor@gmail.com", 17602958);
		gael.register("Gael Miles", "05/03/1997", "997 598 189", "gaelmmls@gmail.com", 10539584);
		aveleen.register("Aveleen Collins", "14/09/1996", "998 090 148", "avellins@gmail.com", 859849202);
		System.out.println();
		
		brian.seeBalance();
		gael.seeBalance();
		store.seeCashier();
		System.out.println();
		
		brian.paySalary();
		brian.seeBalance();
		gael.seeBalance();
		store.seeCashier();
		System.out.println();
		
		brian.discount(550);
		gael.seeBalance();
		store.seeCashier();
		System.out.println();
		
		aveleen.seeMoney();
		System.out.println();

		aveleen.seeProducts();
		aveleen.consultarPreco(1);
		aveleen.consultarPreco(3);
		System.out.println();
		
		aveleen.buy(3);
		aveleen.withdrawMoney(35);
		aveleen.buy(3);
		aveleen.seeMoney();
		aveleen.buy(4);
		aveleen.seeMoney();
		System.out.println();

		aveleen.buy(7);
	}
}
