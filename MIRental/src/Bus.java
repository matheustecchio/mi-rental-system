import java.util.Scanner;

public class Bus extends Vehicle {

    private byte carriedQuantity;
    private byte busType;

    Scanner sc = new Scanner (System.in);


    Bus(String name, String driverLicense) {
        this.name = name;
        this.driverLicense = driverLicense;

    }

    // Method to get bus-specific information
    public void busInfo() {
        do {
            System.out.print("\nHow many people do you want to carry, between 1 to 48: ");
            this.carriedQuantity = sc.nextByte();
            if (this.carriedQuantity < 1 || this.carriedQuantity > 48) {
                System.err.print("\nSorry, we can't provide buses to carry more than 48 people\n");
            }
        } while (this.carriedQuantity < 1 || this.carriedQuantity > 48);

        if (this.carriedQuantity <= 16) {
            do {
                System.out.print("\nYour ideal bus type is a minibus.\nWould you like to upgrade to a luxury mini coach or stay with the standard?\n1. Luxury mini coach\n2. Minibus\nChoose: ");
                this.busType = sc.nextByte();
            } while (this.busType != 1 && this.busType != 2);
        }

        else if (this.carriedQuantity <= 48) {
            do {
                System.out.print("\nYour ideal bus type is a bus.\nWould you like to upgrade to a luxury coach or stay with the standard?\n1. Luxury coach\n2. Standard bus\nChoose: ");
                this.busType = sc.nextByte();
            } while (this.busType != 1 && this.busType != 2);
            this.busType += 2;
        }

    }

    // Method to calculate charges based on user's input
    public void calculateCharges() {
        // Bus Type rules
        switch(this.busType) {
            case 1:
                this.costOfRentalDaily = 583.99f;
                break;
            case 2:
                this.costOfRentalDaily = 480f;
                break;
            case 3:
                this.costOfRentalDaily = 702.98f;
                break;
            case 4:
                this.costOfRentalDaily = 578.99f;
                break;
        }

        // Total Cost of Rental rule
        this.totalCostOfRental = this.costOfRentalDaily * rentDays;
        
        // Insurance rule
        if (this.insuranceNeed == 2) {
            this.insuranceValue = 99.99f;
        }
        else {
            this.insuranceValue = 0;
        }
        
        // Discount rule
        if (this.rentDays > 10) {
            this.discount = 0.12f;
            this.discountValue = totalCostOfRental * discount;
        } else {
            this.discountValue = 0;
        }

        // Total Cost rule
        this.totalCost = this.totalCostOfRental - discountValue + insuranceValue;
    }

    // Method to display bus-specific details
    public void busDisplay() {
        System.out.printf("\nNumber of passengers:\t%s",this.carriedQuantity);

        switch (this.busType) {
            case 1:
                System.out.printf("\nBoot:\t\t\tLuxury mini coach");break;
            case 2:
                System.out.printf("\nBoot:\t\t\tMinibus");break;
            case 3:
                System.out.printf("\nBoot:\t\t\tLuxury coach");break;
            case 4:
                System.out.printf("\nBoot:\t\t\tStandard bus");break;
        }

    }

}
        