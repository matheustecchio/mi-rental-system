import java.util.Scanner;

public class Bus extends Vehicle {

    private byte carriedQuantity;
    private byte busType;

    Scanner sc = new Scanner (System.in);

    public void busOption() {

        System.out.print("\nHow many people do you want to carry: ");
        this.carriedQuantity = sc.nextByte();

        if (carriedQuantity <= 16) {
            System.out.print("\nYour ideal bus type is a minibus.\nWould you like to upgrade to a luxury mini coach or stay with the standard?\n1. Luxury mini coach\n 2. Minibus\nChoose: ");
            busType = sc.nextByte();

        }

        else if (carriedQuantity <= 48) {
            System.out.print("\nYour ideal bus type is a minibus.\nWould you like to upgrade to a luxury mini coach or stay with the standard?\n1. Luxury coach\n 2. Standard bus\nChoose: ");
            busType = sc.nextByte();
            busType += 2;

        }
        
    }

}
