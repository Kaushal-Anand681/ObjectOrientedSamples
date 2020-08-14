package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private int cashOnHand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(int cashOnHand) {
		cashOnHand += 100000;
		this.cashOnHand = cashOnHand;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", cashOnHand=" + cashOnHand + "]";
	}
	
	public void purchaseCar(Vehicle vehicle , Employee emp , boolean finance) {
		emp.handleCustomer(vehicle, this, finance);
	}
	
	
	

}
