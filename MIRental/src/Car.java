import java.util.Scanner;

public class Car extends Vehicle {
    Scanner sc = new Scanner (System.in);

    private float engineSize;
    private byte carStyle;
    private byte carType;

    public void carOption() {

        System.out.print("\nWhat is your preferred Engine Size?\nChoose between 1.1 to 1.6: ");
        this.engineSize = sc.nextFloat();

        System.out.print("\nWould you like to rent a \n1. Hatchback\n2. Saloon\nChoose: ");
        this.carStyle = sc.nextByte();

        System.out.print("\nWould you like to rent a \n1. Family car\n2. People carrier\nChoose: ");
        this.carType = sc.nextByte();
        
    }

    

    

}
