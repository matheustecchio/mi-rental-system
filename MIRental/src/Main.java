public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();


        vehicle.standardInfo(); // Vehicle Class

        switch(vehicle.getVehicleType()) {
            case 1:
                Car car = new Car(vehicle.getName(),vehicle.getDriverLicense());
                car.additionalInfo(); // Vehicle Class
                car.carInfo(); // Car Class
                car.calculateCharges(); // Car Class
                car.headerDisplay(); //Vehicle class
                car.carDisplay(); // Car class
                car.costDisplay(); //Vehicle class
                break;
            
                case 2:
                Bus bus = new Bus(vehicle.getName(),vehicle.getDriverLicense());
                bus.additionalInfo(); // Vehicle Class
                bus.busInfo(); // Bus Class
                bus.calculateCharges(); // Bus Class
                bus.headerDisplay(); //Vehicle class
                bus.busDisplay(); // Bus class
                bus.costDisplay(); //Vehicle class
                break;

        }

    }

}
