package assignment5;

import java.util.Comparator;

class StringComparator implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2)
	{
		return o1.compareTo(o2);
	}
}
