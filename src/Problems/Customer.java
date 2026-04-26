package Problems;

public class Customer {
	private int customerId;
	private String name;
	private String PhoneNumber;
	
	public Customer() {}
	
	public Customer(int customerId,String name,String PhoneNumber) {
		this.customerId = customerId;
		this.name = name;
		this.PhoneNumber = PhoneNumber;
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	

}
