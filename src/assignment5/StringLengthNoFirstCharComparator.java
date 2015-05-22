package assignment5;

import java.util.Comparator;

class StringLengthNoFirstCharComparator implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2)
	{
		char [] restOfStr1 = new char [o1.length() - 1];
		char [] restOfStr2 = new char [o2.length() - 1];
		
		o1.getChars(1, o1.length(), restOfStr1, 0);
		String oCmp1 = new String(restOfStr1);
		
		o2.getChars(1, o2.length(), restOfStr2, 0);
		String oCmp2 = new String(restOfStr2);

		return oCmp2.length() - oCmp1.length();
	}
}
