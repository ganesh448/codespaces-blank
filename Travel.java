
package thomasTravels;
import java.util.ArrayList;

public class Travel {
    public static boolean isCarDriver(Driver driver) {
        return driver.getCategory().equalsIgnoreCase("Car");
    }

    public static String retrieveByDriverId(ArrayList<Driver> drivers, int driverID) {
        for (Driver driver : drivers) {
            if (driver.getId() == driverID) {
                return "Driver name is " + driver.getName() + " belonging to the category " + driver.getCategory() +
                        " traveled " + driver.getTotalDistance() + " KM so far.";
            }
        }
        return "Driver not found with ID: " + driverID;
    }

    public static int retrieveCountOfDriver(ArrayList<Driver> drivers, String category) {
        int count = 0;
        for (Driver driver : drivers) {
            if (driver.getCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Driver> retrieveDriver(ArrayList<Driver> drivers, String category) {
        ArrayList<Driver> result = new ArrayList<>();
        for (Driver driver : drivers) {
            if (driver.getCategory().equalsIgnoreCase(category)) {
                result.add(driver);
            }
        }
        return result;
    }

    public static Driver retrieveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
        Driver maxDistanceDriver = null;
        double maxDistance = Double.MIN_VALUE;
        for (Driver driver : drivers) {
            if (driver.getTotalDistance() > maxDistance) {
                maxDistance = driver.getTotalDistance();
                maxDistanceDriver = driver;
            }
        }
        return maxDistanceDriver;
    }
}
