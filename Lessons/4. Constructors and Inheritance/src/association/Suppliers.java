package association;

public class Suppliers extends Stakeholders{
	
	private String businessName;
	private String website;
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	
	public void anyMethod(){     // Using a constructor method keyword super, to call variables from the superclass.
		super.setName("Brian");
	}
	
}
