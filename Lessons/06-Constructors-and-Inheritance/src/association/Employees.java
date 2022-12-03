package association;

public class Employees extends Stakeholders{
	
	private String position;
	private String function;
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	
	
	public void anyMethod(){     // Using a constructor method keyword super, to call variables from the superclass.
		super.setName("Brian");
	}
	
}
