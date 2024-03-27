import java.util.Scanner;

public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("\nHi there, welcome to Morrison's Island Car and Bus Rental!\n");
        System.out.print("\nEnter with your name: ");
        String name = sc.nextLine();

        String driverLicense = "";
        while (driverLicense.equals("")) {
            System.out.print("\nEnter with your Driver's License number: ");
            driverLicense = sc.nextLine();
            if (driverLicense.equals("")){
                System.out.print("\nSorry, you must have a Drive License to proceed!\n");
            }
        }

        System.out.print("\nWhat type of vehicle do you want to rent?\n1. Car\n2. Bus\nChoose: ");
        byte vehicleType = sc.nextByte();

        byte rentDays = 0;
        while (rentDays <= 0 || rentDays > 30) {
            System.out.print("\nFor how long would you like to rent (days): ");
            rentDays = sc.nextByte();
            if ((rentDays <= 0 || rentDays > 30)) {
                System.out.print("\nSorry, you must rent at least 1 day to at most 30 days!\n");
            }
        }

        System.out.print("\nWhat type of vehicle engine do you want to rent?\n1. Fuel(diesel or petrol)\n2. Electric\n3. Hybrid\nChoose: ");
        byte vehicleEngineType = sc.nextByte();

        System.out.print("\nWhat is your preferred transmission?\n1. Manual\n2. Automatic\nChoose: ");
        byte transmissionType = sc.nextByte();













        sc.close();
    }

}
