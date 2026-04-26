package Problems;
import java.util.ArrayList;
import java.util.List;

public class RentalService {
	
	private static List<Car> cars =  new ArrayList<>();
	
	public static void addCar(Car car) {
		cars.add(car);
	}
	
	public static void displayAvailablityCars() {
		System.out.println("\nAvailable Cars: ");
		for(Car car : cars) {
			if(car.isAvailable()) {
				car.displayDetails();
			}
		}
	}
	
	public static void bookCar(String regNo,Customer customer) {
		for(Car car : cars) {
			if(car.isAvailable()) {
				car.setAvailability(false);
				System.out.println(customer.getName() + " Booked Car " + regNo);
			}else {
				System.out.println("Car alredy rented ! ");
			}
			return;
		}
		
	}
	public static void returnCar(String regNo) {
		for(Car car : cars) {
			if(car.getRegistrationNumber().equals(regNo)) {
				car.setAvailability(true);
				System.out.println("Car returned : " + regNo);
				return;
			}
		}
	}
}
