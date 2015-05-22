/*
 * ----------------------------------------------------------------------------
 *
 * Create a PhotoStrategy Interface
 * Create two classes - AmateurStrategy & ProStrategy that implement interface
 * PhotoStrategy
 * Create a class PhotoGrapher.
 * PhotoGrapher holds a strategy that is AmateurStrategy.
 * It gets converted to ProStrategy when he has taken > 75 pictures
 *
 * ----------------------------------------------------------------------------
 */

package assignment8;

import assignment8.PhotoGrapher;

public class Assignment8 {

	public static void main(String [] args) {
		
		System.out.println("\n------ PhotoGraphersStrategy Test ------\n");
		
		PhotoGrapher p = new PhotoGrapher();
		
		for (int i = 0 ; i < 100 ; i++) {
			p.takePhoto();
			p.sendInvoice();
		}
		
		System.out.println("\n--------------------------------\n");
	}

}

/*
 * ----------------------------------------------------------------------------
 * Output :-->
------ PhotoGraphersStrategy Test ------

Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Say Cheese!
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 
Set up lights, take meter readings, take photo...
Send Money .... 

--------------------------------
 * ----------------------------------------------------------------------------
 */
