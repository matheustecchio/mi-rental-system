import java.util.Scanner;

public class Bus extends Vehicle {

    private byte carriedQuantity;
    private byte busType;

    Scanner sc = new Scanner (System.in);


    Bus(String name, String driverLicense) {
        this.name = name;
        this.driverLicense = driverLicense;

    }
    public void busInfo() {

        System.out.print("\nHow many people do you want to carry: ");
        this.carriedQuantity = sc.nextByte();

        if (carriedQuantity <= 16) {
            System.out.print("\nYour ideal bus type is a minibus.\nWould you like to upgrade to a luxury mini coach or stay with the standard?\n1. Luxury mini coach\n2. Minibus\nChoose: ");
            busType = sc.nextByte();

        }

        else if (carriedQuantity <= 48) {
            System.out.print("\nYour ideal bus type is a minibus.\nWould you like to upgrade to a luxury mini coach or stay with the standard?\n1. Luxury coach\n2. Standard bus\nChoose: ");
            busType = sc.nextByte();
            busType += 2;

        } else {
            System.out.print("\nSorry, we can't provide bus to carry over 48 people!");
        }

    }

    public void calculateCharges() {
        // Bus Type rules
        switch(busType) {
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
            this.insurance = 99.99f;
        }
        else {
            this.insurance = 0;
        }
        
        // Discount rule
        if (this.rentDays > 10) {
            this.discount = 0.12f;
            this.discountValue = totalCostOfRental * discount;
        } else {
            this.discountValue = 0;
        }

        // Total Cost rule
        this.totalCost = totalCostOfRental - discountValue + insurance;
    }

    public void busDisplay() {
        System.out.printf("\nNumber of passengers:\t%s",this.carriedQuantity);

        switch (busType) {
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
        
