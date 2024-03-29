import java.util.Scanner;

public class Vehicle {

    Scanner sc = new Scanner (System.in);

    float costOfRentalDaily;
    float totalCostOfRental;
    float discount;
    float discountValue;
    float insurance;
    float totalCost;
    String name;
    String driverLicense;
    byte vehicleType;
    byte rentDays;
    byte fuelType;
    byte transmissionType;
    byte insuranceNeed;

    public void standardInfo() {

        System.out.print("\nHi there, welcome to Morrison's Island Car and Bus Rental!\n");
        System.out.print("\nEnter with your name: ");
        name = sc.nextLine();

        driverLicense = "";
        while (driverLicense.equals("")) {
            System.out.print("\nEnter with your Driver's License number: ");
            driverLicense = sc.nextLine();
            if (driverLicense.equals("")){
                System.out.print("\nSorry, you must have a Drive License to proceed!\n");
            }
        }

        System.out.print("\nWhat type of vehicle do you want to rent?\n1. Car\n2. Bus\nChoose: ");
        vehicleType = sc.nextByte();
    }

    public void standardHeader() {

        System.out.print("\nDo you have an insurance for this type of vehicle?\n1. Yes\n2. No\nChoose: ");
        insuranceNeed = sc.nextByte();
        

        rentDays = 0;
        while (rentDays <= 0 || rentDays > 30) {
            System.out.print("\nFor how long would you like to rent (days): ");
            rentDays = sc.nextByte();
            if ((rentDays <= 0 || rentDays > 30)) {
                System.out.print("\nSorry, you must rent at least 1 day to at most 30 days!\n");
            }
        }

        System.out.print("\nWhat type of vehicle engine do you want to rent?\n1. Fuel(diesel or petrol)\n2. Electric\n3. Hybrid\nChoose: ");
        fuelType = sc.nextByte();
        
        System.out.print("\nWhat is your preferred transmission?\n1. Manual\n2. Automatic\nChoose: ");
        transmissionType = sc.nextByte();

        
    }

    public void calculateCharges() {
    
    }

    public void HeaderDisplay() {
        System.out.print("\nMorrison's Island Car and Bus Rental\n14 Morrison's Island\nCork\n✉ morrisonsrental@cork.ie\n☎ (021) 123456");
        System.out.print("\n\nPlease present this docket (on a device or printed) when you arrive at Morrison's Island Car and Bus rental desk.");
        switch (vehicleType) {
            case 1:
                System.out.printf("\nDocket details for car rental submitted by %s.",this.name);break;
            case 2:
                System.out.printf("\nDocket details for bus rental submitted by %s.",this.name);break;
        }

        System.out.printf("\n\nLicense No.:\t\t%s",this.driverLicense);
        System.out.printf("\nNumber of days:\t\t%s",rentDays);
        switch (fuelType) {
            case 1:
                System.out.printf("\nFuel type:\t\tDiesel or Petrol");break;
            case 2:
                System.out.printf("\nFuel type:\t\tElectric");break;
            case 3:
                System.out.printf("\nFuel type:\t\tHybrid");break;
        }
        switch (transmissionType) {
            case 1:System.out.printf("\nTransmission:\t\tManual");break;
            case 2:System.out.printf("\nTransmission:\t\tAutomatic");break;
        }
    }

    public void footerDisplay() {

        System.out.printf("\n\nCost Breakdown:");
        System.out.printf("\n%s days @ €%,.2f/day =\t€%,.2f", this.rentDays, this.costOfRentalDaily, this.totalCostOfRental);
        System.out.printf("\nDiscount:\t\t€%,.2f",this.discountValue);
        switch (insuranceNeed) {
            case 1:
                System.out.printf("\nInsurance:\t\tCustomer has their own insurance");break;
            case 2:
                System.out.printf("\nInsurance:\t\t€%,.2f",this.insurance);break;
        }
        System.out.printf("\nTotal Cost:\t\t€%,.2f\n",this.totalCost);

            
    }
    // Getters and Setters
    public float getCostOfRentalDaily() {
        return costOfRentalDaily;
    }

    public void setCostOfRentalDaily(float costOfRentalDaily) {
        this.costOfRentalDaily = costOfRentalDaily;
    }

    public float getTotalCostOfRental() {
        return totalCostOfRental;
    }

    public void setTotalCostOfRental(float totalCostOfRental) {
        this.totalCostOfRental = totalCostOfRental;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(float discountValue) {
        this.discountValue = discountValue;
    }

    public float getInsurance() {
        return insurance;
    }

    public void setInsurance(float insurance) {
        this.insurance = insurance;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public byte getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(byte vehicleType) {
        this.vehicleType = vehicleType;
    }

    public byte getRentDays() {
        return rentDays;
    }

    public void setRentDays(byte rentDays) {
        this.rentDays = rentDays;
    }

    public byte getFuelType() {
        return fuelType;
    }

    public void setFuelType(byte fuelType) {
        this.fuelType = fuelType;
    }

    public byte getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(byte transmissionType) {
        this.transmissionType = transmissionType;
    }

    public byte getInsuranceNeed() {
        return insuranceNeed;
    }

    public void setInsuranceNeed(byte insuranceNeed) {
        this.insuranceNeed = insuranceNeed;
    }

    

    
    
}
