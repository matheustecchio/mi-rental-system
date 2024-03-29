public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();


        vehicle.standardInfo(); // Vehicle Class

        switch(vehicle.getVehicleType()) {
            case 1:
                Car car = new Car(vehicle.getName(),vehicle.getDriverLicense());
                car.standardHeader(); // Vehicle Class
                car.carInfo(); // Car Class
                car.calculateCharges(); // Car Class
                car.HeaderDisplay();
                car.carDisplay();
                car.footerDisplay();
                break;
            
                case 2:
                Bus bus = new Bus(vehicle.getName(),vehicle.getDriverLicense());
                bus.standardHeader(); // Vehicle Class
                bus.busInfo(); // Bus Class
                bus.calculateCharges(); // Bus Class
                bus.HeaderDisplay();
                bus.busDisplay();
                bus.footerDisplay();
                break;

        }

    }

}
