package assignment9;

import assignment9.Customer;

public class VIPCustomer extends Customer {

	private int miles = 0;

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	public VIPCustomer(String name, String address, int limit, int miles)
	{
		super(name, address, limit);
		this.miles = miles;
	}

	@Override
	public String getGreeting() {
		return "Good day Sir " + getName();
	}

	@Override
	public String toString() {
		return "VIPCustomer [name=" + getName() + ", address=" + getAddress()
				+ ", creditLimit=" + getCreditLimit() + ", miles=" + this.miles + "]";
	}
	// You could also just invoke super.toString() so that you don't have to
	// repeat everything.
	// Also remember to use "this.getClass().getName()"

}
