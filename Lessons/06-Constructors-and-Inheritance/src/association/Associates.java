package association;

public class Associates extends Stakeholders{
	
	private String situation;
	private int numberAssociates;
	
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public int getNumberAssociates() {
		return numberAssociates;
	}
	public void setNumberAssociates(int numberAssociates) {
		this.numberAssociates = numberAssociates;
	}
	
	
	public void anyMethod(){     // Using a constructor method keyword super, to call variables from the superclass.
		super.setName("Brian");
	}
	
}
