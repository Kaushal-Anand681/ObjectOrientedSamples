package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer();
		cust1.setAddress("Sadarpur");
		cust1.setName("Jai Ho");
		cust1.setCashOnHand(1200000);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setMake("BMW");
		vehicle.setModel("M");
		vehicle.setPrice(1300000);
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);

	}

}
