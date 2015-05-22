/*
 * ----------------------------------------------------------------------------
 *
 * Create a PhotoGrapher class & a ProPhotoGrapher class that extends it.
 * Override the takeAPicture() method.
 * Use custo toString() method.
 * Use ArrayList to store PhotoGrapher & ProPhotoGraphers.
 * Iterate over it - use instanceof & getClass()
 *
 * ----------------------------------------------------------------------------
 */

package assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment4 {

	public static void main(String [] args) {
		
		System.out.println("\n------ PhotoGraphers Test ------\n");
		
		PhotoGrapher p1 = new PhotoGrapher();
		PhotoGrapher p2 = new PhotoGrapher("Fred", "Quimby");
		
		System.out.println("PhotoGrapher1 is: " + p1);
		System.out.println("p1 is: " + p1.getClass().getName());
		p1.takeAPicture();
		System.out.println("PhotoGrapher2 is: " + p2);
		System.out.println("p2 is: " + p2.getClass().getName());
		p2.takeAPicture();
		
		PhotoGrapher p3 = new ProPhotoGrapher("John", "Doe", 100);
		System.out.println("PhotoGrapher3 is: " + p3);
		System.out.println("p3 is: " + p3.getClass().getName());
		p3.takeAPicture();
		
		// p3 knows that it is a ProPhotoGrapher - but p3 itself
		// can not invoke sendInvoice() - so assign to another
		// object & then invoke sendInvoice()
		
		if (p3.getClass() == ProPhotoGrapher.class) {
			if (p3 instanceof ProPhotoGrapher) {
				ProPhotoGrapher p4 = (ProPhotoGrapher)p3;
				p4.sendInvoice();
			}
		}
		
		System.out.println("\n--------------------------------\n");
		
		List<PhotoGrapher> lp = new ArrayList<PhotoGrapher>();
		
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		
		ListIterator<PhotoGrapher> iter = lp.listIterator();
		
		while (iter.hasNext()) {
			PhotoGrapher temp = iter.next();
			
			System.out.println("PhotoGrapher Details: " + temp);
			
			if (temp.getClass() == ProPhotoGrapher.class) {
				if (temp instanceof ProPhotoGrapher) {
					((ProPhotoGrapher)temp).sendInvoice();
				}
			}
		}
		
		System.out.println("\n--------------------------------\n");
	}
}

/*
 * ----------------------------------------------------------------------------
 * Output :-->
 *

------ PhotoGraphers Test ------

PhotoGrapher1 is: fName=FirstName, lName=LastName
p1 is: assignment4.PhotoGrapher
Stand & Smile Please...
Picture Taken !

PhotoGrapher2 is: fName=Fred, lName=Quimby
p2 is: assignment4.PhotoGrapher
Stand & Smile Please...
Picture Taken !

PhotoGrapher3 is: fName=John, lName=Doe, proCode=100
p3 is: assignment4.ProPhotoGrapher
Setup lights, Setup positioning etc ...
Picture Taken !
Sending Invoice .... 


--------------------------------

PhotoGrapher Details: fName=FirstName, lName=LastName
PhotoGrapher Details: fName=Fred, lName=Quimby
PhotoGrapher Details: fName=John, lName=Doe, proCode=100
Sending Invoice .... 


 * ----------------------------------------------------------------------------
 */