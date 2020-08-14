package car_dealership;

public class Employee {
	


	public void handleCustomer(Vehicle vehicle, Customer cust, boolean finance) {
		// TODO Auto-generated method stub
		if(finance) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust , loanAmount);
		}
		else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust , vehicle);
		}
		else {
			System.out.println("Customer "+ cust.getName()+" need more money to buy "+vehicle.getMake()+" model "+vehicle.getModel());
		}
	}

	private void processTransaction(Customer cust, Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Customer "+ cust.getName()+" has purchased the vehicle "+vehicle.getMake()+" model "+vehicle.getModel()+" at the price of "+vehicle.getPrice()+" rupees");
		
		
	}

	private void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Running Credit History of Customer");
		System.out.println("Customer hass been approved to take loan");
		
	}


}
