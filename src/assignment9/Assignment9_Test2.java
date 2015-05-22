/*
 * ----------------------------------------------------------------------------
 *
 * Create a Customer Class. Create a VIPCustomer that extends it.
 * VIPCustomer overrides getGreeting() & toString() methods.
 * Create CustomerAddressComparator that implements Comparator<>
 *
 * We will trace through steps that logically conclude with creating a Lambda to compare Customers.
 * 
 * Step 1: Create a public static class CustomerCredit1Comparator implements Comparator<Customer>
 *         You can do new CustomerCreditComparator & use it that way.
 * Step 2: Make the Class a private static & add a public static method to fetch it.
 *         This sort of implements the Factory Pattern for the Comparator now ...
 * Step 3: Make the private class to an Anonymous class
 *         - No need to specifically mention implements or extends - it is inferred
 * Step 4: Remove Interface name & remove function name! 
 *         - Can now use the "->" from function's argument list to the block of function body.
 * Step 5: Remove the DataType specification from argument list and condense func body to one stmt
 *         - This is the final full blown Lambda !
 *
 * ----------------------------------------------------------------------------
 */

package assignment9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment9_Test2 {

	public static void main(String [] args) {
		List<Customer> lc = Arrays.asList(
				new Customer("Fred", "Here", 1000),
				new Customer("Jim", "There", 2000),
				new Customer("Sheila", "Over the rainbow", 2200)
				);
		
		System.out.println("Unsorted: " + lc);
		Collections.sort(lc, new CustomerAddressComparator());
		System.out.println("Sorted by Addr: " + lc);
		
		Collections.sort(lc, new Customer.CustomerCredit1Comparator());
		System.out.println("Sorted by Creadit 1: " + lc);
		
		Collections.sort(lc, Customer.getCustomerCredit2Comparator());
		System.out.println("Sorted by Credit 2:" + lc);

		Collections.sort(lc, Customer.getCustomerCredit3Comparator());
		System.out.println("Sorted by Credit 3:" + lc);

		Collections.sort(lc, Customer.getCustomerCredit4Comparator());
		System.out.println("Sorted by Credit 4:" + lc);

		Collections.sort(lc, Customer.getCustomerCredit5Comparator());
		System.out.println("Sorted by Credit 5:" + lc);
	}
}

/*
 * ----------------------------------------------------------------------------
 * Output :-->

Unsorted: [Customer [name=Fred, address=Here, creditLimit=1000], Customer [name=Jim, address=There, creditLimit=2000], Customer [name=Sheila, address=Over the rainbow, creditLimit=2200]]
Sorted by Addr: [Customer [name=Fred, address=Here, creditLimit=1000], Customer [name=Sheila, address=Over the rainbow, creditLimit=2200], Customer [name=Jim, address=There, creditLimit=2000]]
Sorted by Creadit 1: [Customer [name=Fred, address=Here, creditLimit=1000], Customer [name=Jim, address=There, creditLimit=2000], Customer [name=Sheila, address=Over the rainbow, creditLimit=2200]]
Sorted by Credit 2:[Customer [name=Fred, address=Here, creditLimit=1000], Customer [name=Jim, address=There, creditLimit=2000], Customer [name=Sheila, address=Over the rainbow, creditLimit=2200]]
Sorted by Credit 3:[Customer [name=Fred, address=Here, creditLimit=1000], Customer [name=Jim, address=There, creditLimit=2000], Customer [name=Sheila, address=Over the rainbow, creditLimit=2200]]
Sorted by Credit 4:[Customer [name=Fred, address=Here, creditLimit=1000], Customer [name=Jim, address=There, creditLimit=2000], Customer [name=Sheila, address=Over the rainbow, creditLimit=2200]]
Sorted by Credit 5:[Customer [name=Fred, address=Here, creditLimit=1000], Customer [name=Jim, address=There, creditLimit=2000], Customer [name=Sheila, address=Over the rainbow, creditLimit=2200]]

 * ----------------------------------------------------------------------------
 */
