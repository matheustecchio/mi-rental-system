package registration;

public class Main {

	public static void main(String[] args) {
		
		Cargo c1 = new Cargo();
		
		Passenger p1 = new Passenger();
		
		p1.getFuel(); // Object of the Passenger class pulling variable from its parent class Vehicle.
		
		c1.getChassis(); // Object of the Cargo class pulling variable from its parent class Vehicle.
		
		p1.getExternalColour(); // Object of the Passenger class pulling variable from its own class.
		
		c1.getCapacityMaximum(); // Object of the Cargo class pulling variable from its own class.
		
		
	}
}
