package thomasTravels;
import java.util.ArrayList;

public class TestDriver {
    public static void main(String[] args) {
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(1, "Sudhagar", "Car", 4200));
        drivers.add(new Driver(2, "John", "Auto", 3200));
        drivers.add(new Driver(3, "Jane", "Car", 5200));
        drivers.add(new Driver(4, "Bob", "Lorry", 8000));

        // Test isCarDriver method
        Driver driver1 = new Driver(5, "Chris", "Car", 1000);
        System.out.println("Is driver1 a car driver? " + Travel.isCarDriver(driver1)); // Output: true

        // Test retrieveByDriverId method
        int driverId = 1;
        String driverInfo = Travel.retrieveByDriverId(drivers, driverId);
        System.out.println(driverInfo);

        // Test retrieveCountOfDriver method
        String category = "Car";
        int count = Travel.retrieveCountOfDriver(drivers, category);
        System.out.println("Number of drivers in category " + category + ": " + count);

        // Test retrieveDriver method
        ArrayList<Driver> carDrivers = Travel.retrieveDriver(drivers, "Car");
        System.out.println("Car drivers:");
        for (Driver driver : carDrivers) {
            System.out.println(driver.getName());
        }

        // Test retrieveMaximumDistanceTravelledDriver method
        Driver maxDistanceDriver = Travel.retrieveMaximumDistanceTravelledDriver(drivers);
        if (maxDistanceDriver != null) {
            System.out.println("Driver with maximum distance travelled: " + maxDistanceDriver.getName());
        } else {
            System.out.println("No drivers found.");
        }
    }
}
