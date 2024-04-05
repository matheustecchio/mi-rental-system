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
        this.name = sc.nextLine();

        do {
            System.out.print("\nEnter with your Driver's License number: ");
            this.driverLicense = sc.nextLine();
            if (!this.driverLicense.matches("\\d{5}[a-zA-Z]{4}")) {
                System.err.print("\nSorry, the Driver's License is not valid. It should be 5 digits followed by 4 letters.\n");
            }
        } while (!this.driverLicense.matches("\\d{5}[a-zA-Z]{4}"));
        
        
        do {
            System.out.print("\nWhat type of vehicle do you want to rent?\n1. Car\n2. Bus\nChoose: ");
            this.vehicleType = sc.nextByte();
        } while (this.vehicleType != 1 && this.vehicleType != 2);
        
    }

    public void standardHeader() {

        do {
            System.out.print("\nDo you have an insurance for this type of vehicle?\n1. Yes\n2. No\nChoose: ");
            this.insuranceNeed = sc.nextByte();
        } while (this.insuranceNeed != 1 && this.insuranceNeed != 2); 

        while (this.rentDays < 1 || this.rentDays > 30) {
            System.out.print("\nFor how long would you like to rent (days): ");
            this.rentDays = sc.nextByte();
            if (this.rentDays <= 0 || this.rentDays > 30) {
                System.out.print("\nSorry, you must rent at least 1 day to at most 30 days!\n");
            }
        }

        do {
            System.out.print("\nWhat type of vehicle engine do you want to rent?\n1. Fuel(diesel or petrol)\n2. Electric\n3. Hybrid\nChoose: ");
            this.fuelType = sc.nextByte();
        } while (this.fuelType != 1 && this.fuelType !=2 && this.fuelType != 3);
        
        do {
            System.out.print("\nWhat is your preferred transmission?\n1. Manual\n2. Automatic\nChoose: ");
            this.transmissionType = sc.nextByte();
        } while (this.transmissionType != 1 && this.transmissionType !=2);

    }

    public void calculateCharges() {
    
    }

    public void HeaderDisplay() {
        System.out.print("\n\n\nMorrison's Island Car and Bus Rental\n14 Morrison's Island\nCork\n✉ morrisonsrental@cork.ie\n☎ (021) 123456");
        System.out.print("\n\nPlease present this docket (on a device or printed) when you arrive at Morrison's Island Car and Bus rental desk.");
        switch (this.vehicleType) {
            case 1:
                System.out.printf("\nDocket details for car rental submitted by %s.",this.name);break;
            case 2:
                System.out.printf("\nDocket details for bus rental submitted by %s.",this.name);break;
        }

        System.out.printf("\n\nLicense No.:\t\t%s",this.driverLicense);
        System.out.printf("\nNumber of days:\t\t%s",this.rentDays);
        switch (this.fuelType) {
            case 1:
                System.out.printf("\nFuel type:\t\tDiesel or Petrol");break;
            case 2:
                System.out.printf("\nFuel type:\t\tElectric");break;
            case 3:
                System.out.printf("\nFuel type:\t\tHybrid");break;
        }
        switch (this.transmissionType) {
            case 2:
                System.out.printf("\nTransmission:\t\tAutomatic");break;
            case 1:
                System.out.printf("\nTransmission:\t\tManual");break;
        }
    }

    public void footerDisplay() {

        System.out.printf("\n\nCost Breakdown:");
        System.out.printf("\n%s days @ €%,.2f/day =\t€%,.2f", this.rentDays, this.costOfRentalDaily, this.totalCostOfRental);
        System.out.printf("\nDiscount:\t\t€%,.2f",this.discountValue);
        switch (this.insuranceNeed) {
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