/*
 * ----------------------------------------------------------------------------
 *
 * Sort a List of Strings using:
 * 01. Sort Using Collections Class
 * 02. Sort Using Collections Class & Custom Comparator that compares strings
 * 03. Sort Using Collections Class & Custom Comparator that compares strings
 *     without considering first char
 * 04. Sort Using Collections Class & Custom Comparator that compares strings
 *     based on their lengths
 *
 * ----------------------------------------------------------------------------
 */

package assignment5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import assignment5.StringComparator;
import assignment5.StringLengthComparator;
import assignment5.StringLengthNoFirstCharComparator;

public class Assignment5 {

	public static void main(String [] args)
	{
		/* 01. Sort Using Collections Class */
		System.out.println("\n-----------------------------------\n");
		System.out.println("01. Sort Using Collections Class");
		List<String> ls = Arrays.asList("Fred", "Jim", "Sheila", "Tony", "Albert",
				"Charlene", "Christine");
		System.out.println("Before: " + ls);
		Collections.sort(ls);
		System.out.println("After: " + ls);
		System.out.println("\n-----------------------------------\n");

		/* 02. Sort Using Collections Class & Custom Comparator that compares strings */
		System.out.println("\n-----------------------------------\n");
		System.out.println("02. Sort Using Collections Class & Custom Comparator that compares strings");
		Collections.sort(ls, new StringComparator());
		System.out.println("After 02: " + ls);
		System.out.println("\n-----------------------------------\n");

		/* 03. Sort Using Collections Class & Custom Comparator that compares strings
 			   without considering first char */
		System.out.println("\n-----------------------------------\n");
		System.out.println("03. Sort Using Collections Class & Custom Comparator that compares strings without considering first char");
		Collections.sort(ls, new StringLengthNoFirstCharComparator());
		System.out.println("After 03: " + ls);
		System.out.println("\n-----------------------------------\n");

		/* 04. Sort Using Collections Class & Custom Comparator that compares strings
 			   based on their lengths */
		System.out.println("\n-----------------------------------\n");
		System.out.println("04. Sort Using Collections Class & Custom Comparator that compares strings based on their lengths");
		Collections.sort(ls, new StringLengthComparator());
		System.out.println("After 04: " + ls);
		System.out.println("\n-----------------------------------\n");
	}

}

/*
 * ----------------------------------------------------------------------------
 * Output :-->
 *
-----------------------------------

01. Sort Using Collections Class
Before: [Fred, Jim, Sheila, Tony, Albert, Charlene, Christine]
After: [Albert, Charlene, Christine, Fred, Jim, Sheila, Tony]

-----------------------------------


-----------------------------------

02. Sort Using Collections Class & Custom Comparator that compares strings
After 02: [Albert, Charlene, Christine, Fred, Jim, Sheila, Tony]

-----------------------------------


-----------------------------------

03. Sort Using Collections Class & Custom Comparator that compares strings without considering first char
After 03: [Christine, Charlene, Albert, Sheila, Fred, Tony, Jim]

-----------------------------------


-----------------------------------

04. Sort Using Collections Class & Custom Comparator that compares strings based on their lengths
After 04: [Christine, Charlene, Albert, Sheila, Fred, Tony, Jim]

-----------------------------------

 * ----------------------------------------------------------------------------
 */
