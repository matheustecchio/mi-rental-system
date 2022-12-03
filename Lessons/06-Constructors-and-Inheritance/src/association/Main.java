package association;

public class Main {

	public static void main(String[] args) {
		
		
		Associates a1 = new Associates();
		Employees e1 = new Employees();
		Suppliers s1 = new Suppliers();
		
		a1.getAddress();	// Associates class object pulling variable from Stakeholders superclass.
		e1.getName();		// Employees class object pulling variable from Stakeholders superclass.
		s1.getCity();		// Suppliers class object pulling variable from Stakeholders superclass.
		
		a1.getSituation();	// Object from Associates class pulling variable from its own class.
		e1.getFunction();	// Object from Employees class pulling variable from its own class.
		s1.getWebsite();	// Object from Suppliers class pulling variable from its own class.
		
		
	}
}
