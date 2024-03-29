import java.util.Scanner;

public class Car extends Vehicle {
    Scanner sc = new Scanner (System.in);

    private float engineSize;
    private byte carStyle;
    private byte carType;

    Car(String name, String driverLicense) {
        this.name = name;
        this.driverLicense = driverLicense;

    }

    public void carInfo() {

        System.out.print("\nWhat is your preferred Engine Size?\nChoose between 1.1 to 1.6: ");
        this.engineSize = sc.nextFloat();

        System.out.print("\nWould you like to rent a \n1. Hatchback\n2. Saloon\nChoose: ");
        this.carStyle = sc.nextByte();

        System.out.print("\nWould you like to rent a \n1. Family car\n2. People carrier\nChoose: ");
        this.carType = sc.nextByte();
        
    }

    public void calculateCharges() {
        // Engine Size rules
        if (this.engineSize > 1.6) {
            System.err.print("Sorry, we don't rent cars over 1.6 litre!");
        }
        else if (engineSize > 1.3) {
            this.costOfRentalDaily += 45.67;
        }
        else if (engineSize > 1.1) {
            this.costOfRentalDaily += 30.57;
        } else {
            System.err.print("Sorry, we don't rent cars below 1.1 litre!");
        }

        // Car Type rules
        if (this.carType == 2) {
            this.costOfRentalDaily += 2.99;
        } else if (this.carType != 1) {
            System.err.print("Sorry, invalid Car Type!");
        }

        // Total Cost of Rental rule
        this.totalCostOfRental = this.costOfRentalDaily * rentDays;

        // Insurance rule
        if (this.insuranceNeed == 2) {
            this.insurance = 15.72f;
        }
        else {
            this.insurance = 0;
        }

        // Discount rule
        if (this.rentDays > 10) {
            this.discount = 0.10f;
            this.discountValue = totalCostOfRental * discount;
        } else {
            this.discountValue = 0;
        }

        // Total Cost rule
        this.totalCost = totalCostOfRental - discountValue + insurance;

    }

    public void carDisplay() {
        System.out.printf("\nEngine Size:\t\t%.1f",this.engineSize);

        switch (carStyle) {
            case 1:
                System.out.printf("\nBoot:\t\t\tHatchback");break;
            case 2:
                System.out.printf("\nBoot:\t\t\tSaloon");break;
        }

        switch (carType) {
            case 1:
                System.out.printf("\nCar size:\t\tFamily car");break;
            case 2:
                System.out.printf("\nCar size:\t\tPeople carrier");break;
        }

    }

}
