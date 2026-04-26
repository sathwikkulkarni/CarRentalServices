package Problems;

public class Main {
	public static void main(String[] args) {
	Car c1 = new Eco("E101" , "Swift" , 2000);
	Car c2 = new Lux("L202" , "BMw" , 8000);
	
	
	RentalService.addCar(c1);
	RentalService.addCar(c2);
	
	
	Customer cust = new Customer(1,"Rahul","98749374892");
	
	RentalService.displayAvailablityCars();
	
	RentalService.bookCar("E101" , cust);
	RentalService.bookCar("E101", cust); 
	
	
	RentalService.displayAvailablityCars();
	
	RentalService.returnCar("E101");
	
	RentalService.displayAvailablityCars();
	
	
	

}
}
