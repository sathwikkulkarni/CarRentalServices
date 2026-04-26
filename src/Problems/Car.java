package Problems;
import java.util.*;

public class Car {
	private String registrationNumber;
	private String model;
	private double rentalPricePerDay;
	private boolean availabilityStatus;
	
	public Car() {
		this.availabilityStatus = true;
	}
	public Car(String registrationNumber,String model,double rentalPricePerDay) {
		this.registrationNumber = registrationNumber;
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
		this.availabilityStatus = true;
		
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public boolean isAvailable() {
		return availabilityStatus;
		
	}
	public void setAvailability(boolean status) {
		this.availabilityStatus = status;
	}
	public void displayDetails() {
		System.out.println("Reg No: " + registrationNumber + 
				",Model : " + model + 
				" , Price/Day: " + rentalPricePerDay +
				",Available: " + availabilityStatus);
		
	}
	
	
}
