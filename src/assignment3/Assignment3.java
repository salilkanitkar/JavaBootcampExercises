/*
 * ----------------------------------------------------------------------------
 *
 * Create a "Point" class to represent a Cartesian (x, y) point in Quadrant 1
 * Create functions that determine, given two points, if one Point is LeftOf,
 * RightOf, AboveOf or BelowOf of the other Point
 *
 * ----------------------------------------------------------------------------
 */

package assignment3;

import assignment3.Point;

public class Assignment3 {

	public static void main(String [] args)
	{
		Point p1 = new Point();
		Point p2 = new Point(20, 50);
		Point p3 = new Point(50, 20);
		
		System.out.println("Point p1 is: " + p1.getX() + ", " + p1.getY());
		System.out.println("Point p2 is: " + p2.getX() + ", " + p2.getY());
		System.out.println("Point p3 is: " + p3.getX() + ", " + p3.getY());
		
		System.out.println("\n---- Check Relative Positioning of p2 & p3 -----\n");
		
		System.out.println("p2.isLeftOf(p3) is: " + p2.isLeftOf(p3));
		System.out.println("p3.isLeftOf(p2) is: " + p3.isLeftOf(p2));
		
		System.out.println("p2.isRightOf(p3) is: " + p2.isRightOf(p3));
		System.out.println("p3.isRightOf(p2) is: " + p3.isRightOf(p2));

		System.out.println("p2.isAboveOf(p3) is: " + p2.isAboveOf(p3));
		System.out.println("p3.isAboveOf(p2) is: " + p3.isAboveOf(p2));
		
		System.out.println("p2.isBelowOf(p3) is: " + p2.isBelowOf(p3));
		System.out.println("p3.isBelowOf(p2) is: " + p3.isBelowOf(p2));
		
		System.out.println("\n----------------------------------------------\n");
	}
}

/*
 * ----------------------------------------------------------------------------
 * Output :-->
 *
Point p1 is: 0, 0
Point p2 is: 20, 50
Point p3 is: 50, 20

---- Check Relative Positioning of p2 & p3 -----

p2.isLeftOf(p3) is: true
p3.isLeftOf(p2) is: false
p2.isRightOf(p3) is: false
p3.isRightOf(p2) is: true
p2.isAboveOf(p3) is: true
p3.isAboveOf(p2) is: false
p2.isBelowOf(p3) is: false
p3.isBelowOf(p2) is: true

----------------------------------------------

 * ----------------------------------------------------------------------------
 */
