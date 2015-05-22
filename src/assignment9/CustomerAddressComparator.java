package assignment9;

import java.util.Comparator;

public class CustomerAddressComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getAddress().compareTo(o2.getAddress());
	}

}
