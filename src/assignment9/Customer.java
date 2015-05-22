package assignment9;

import java.util.Comparator;

public class Customer {
	private String name;
	private String address;
	private int	   creditLimit;
	
	public Customer(String name, String address, int limit) {
		if (name == null || name.length() == 0
			|| address== null | address.length() == 0
			|| limit < 0 || limit >= 100_000) {
			throw new IllegalArgumentException("Bad Arguments");
		}
		this.name = name;
		this.address = address;
		this.creditLimit = limit;
	}
	
	/* Ctor with default value of address */
	public Customer(String name, String address) {
		if (name == null || name.length() == 0
			|| address== null | address.length() == 0) {
			throw new IllegalArgumentException("Bad Arguments");
		}
		this.name = name;
		this.address = address;
		this.creditLimit = 1000;
	}

	public void setName(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		}
	}
	
	public void setAddress(String address) {
		if (address != null && address.length() > 0) {
			this.address = address;
		}
	}

	public void setCreditLimit(int limit) {
		if (limit < 100_000 && limit >= 0) {
			this.creditLimit = limit;
		}
	}

	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}

	public int getCreditLimit() {
		return this.creditLimit;
	}

	public String getGreeting() {
		return "Good day Mr. " + name;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + this.name + ", address=" + this.address
				+ ", creditLimit=" + this.creditLimit + "]";
	}
	
	/*
	 * Step 1: Create a public static class CustomerCredit1Comparator implements Comparator<Customer>
	 *         You can do new CustomerCreditComparator & use it that way.
	 * */
	public static class CustomerCredit1Comparator implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			if (o1.creditLimit > o2.creditLimit) return 1;
			if (o1.creditLimit < o2.creditLimit) return -1;
			return 0;
		}
		
	}
	
	/*
	 * Step 2: Make the Class a private static & add a public static method to fetch it.
	 *    This sort of implements the Factory Pattern for the Comparator now ... 
	 */

	public static Comparator<Customer> getCustomerCredit2Comparator() {
		return new CustomerCredit2Comparator();
	}
	
	private static class CustomerCredit2Comparator implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			if (o1.creditLimit > o2.creditLimit) return 1;
			if (o1.creditLimit < o2.creditLimit) return -1;
			return 0;			
		}
		
	}
	
	/*
	 * Step 3: Make the private class to an Anonymous class
	 *   - No need to specifically mention implements or extends - it is inferred
	 * */

	public static Comparator<Customer> getCustomerCredit3Comparator() {
		return new 
				/* private static class CustomerCredit2Comparator implements */ Comparator<Customer>(){

						@Override
						public int compare(Customer o1, Customer o2) {
							if (o1.creditLimit > o2.creditLimit) return 1;
							if (o1.creditLimit < o2.creditLimit) return -1;
							return 0;			
						}	
			};
	}
	
	/*
	 * Step 4: Remove Interface name & remove function name! 
	 *  - Notice the "->" from function's argument list to the block of function body.
	 */
	public static Comparator<Customer> getCustomerCredit4Comparator() {
		return /* Comparator<Customer>(){

			@Override
			public int compare*/ (Customer o1, Customer o2) -> {
				if (o1.creditLimit > o2.creditLimit) return 1;
				if (o1.creditLimit < o2.creditLimit) return -1;
				return 0;			
			};	
		/* }; */ 
	}

	/*
	 * Step 5: Remove the DataType specification from argument list and condense func body to one stmt
	 *   - This is called the final lambda !
	 */
	public static Comparator<Customer> getCustomerCredit5Comparator() {
		return (o1, o2) -> o1.creditLimit > o2.creditLimit ? 1 : o1.creditLimit < o2.creditLimit ? -1 : 0 ;
	}

}
