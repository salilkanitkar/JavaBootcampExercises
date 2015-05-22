/*
 * ----------------------------------------------------------------------------
 *
 * Create a Customer Class. Create a VIPCustomer that extends it.
 * VIPCustomer overrides getGreeting() & toString() methods.
 * Test these out.
 *
 * ----------------------------------------------------------------------------
 */
package assignment9;

import assignment9.Customer;
import assignment9.VIPCustomer;

public class Assignment9_Test1 {

	public static void main(String [] args)
	{
		Customer c1 = new Customer("Fred", "Over the rainbow", 1000);
		System.out.println("Created c1: " + c1);
		Customer c2 = new Customer("Jim", "Next door");
		System.out.println("Created c2: " + c2);
		
		// Below Object creation will throw an Exception
		// Customer c3 = new Customer("", "", -99);
		// System.out.println("Created c3");

		String g1 = c1.getGreeting();
		System.out.println(g1 + ", we are pleased to receive your order...");
		
		// vc1 is Customer -  but it can be any specialization like VIPCustomer
		Customer vc1 = new VIPCustomer("Albert", "Wistminster", 90_000, 100);
		System.out.println("Created vc1: " + vc1);
		
		String g2 = vc1.getGreeting();
		System.out.println(g2 + ", we are pleased to receive your order");
	}
}

/*
 * ----------------------------------------------------------------------------
 * Output :-->

Created c1: Customer [name=Fred, address=Over the rainbow, creditLimit=1000]
Created c2: Customer [name=Jim, address=Next door, creditLimit=1000]
Good day Mr. Fred, we are pleased to receive your order...
Created vc1: VIPCustomer [name=Albert, address=Wistminster, creditLimit=90000, miles=100]
Good day Sir Albert, we are pleased to receive your order

 * ----------------------------------------------------------------------------
 */
