/*
 * ----------------------------------------------------------------------------
 *
 * 00. Hello World !
 * 01. Determine if a number if within range (11 to 20)
 * 02. Given a day - determine Weekday or Weekend (Not using Date class)
 * 03. Simulate Throwing of Two dice
 * 04. Fibonacci Series - n'th number (recursive functions)
 * 05. String: Demonstrate immutability using concat
 * 06. Reading Input from Console
 * 07. Writing to a File
 * 08. Reading from a File
 * 09. Is input String a Palindrome or not
 * 10. Counting occurrences of "Wickham" in Pride_And_Prejudice plaintext file
 *
 * ----------------------------------------------------------------------------
 */

package assignment1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Assignment1 {

	public static void main(String[] args) throws Throwable {

		/* 0. You have to Start with this ! */
		System.out.println("Hello, World!\n");

		/* 01. Determine if a number is within range (11 to 20) */
		System.out.println("01. Determine if a number is within range (11 to 20)");
		int inRange = 15, notInRange = 25;
		int lowerLimit = 11, higherLimit = 20;

		if (isNumberInRange(inRange, lowerLimit, higherLimit)) {
			System.out.println("Number " + inRange + " is in Range 11 to 20...");
		}
				
		if (!isNumberInRange(notInRange, lowerLimit, higherLimit)) {
			System.out.println("Number " + notInRange + " is Unacceptable for Range 11 to 20...");				
		}

		System.out.println("\n\n");

		/* 02. "Wake-Up" Day or "Sleep-In" Day*/
		System.out.println("02. \"Wake-Up\" Day or \"Sleep-In\" Day");
		morningRoutine(2);
		morningRoutine(5);
		morningRoutine(7);
		morningRoutine(-25);
		morningRoutine(99);

		System.out.println("\n\n");

		/* 03. Simulate Throwing of Two dice. */
		System.out.println("03. Simulate Throwing of Two Dice");
		twoDiceThrowing();
		System.out.println("\n\n");
				
		/* 04. Fibonacci Series - n'th number */
		System.out.println("04. Fibonacci Series - n'th number ");

		int n = 40;
		int nFibo = fiboNumber(n);

		System.out.println("The number at position " + n + " in Fibonacci series is: " + nFibo);

		System.out.println("\n\n");

		/* 05. String: Demonstrate immutability using concat */
		System.out.println("05. String concat etc.");
		String s1 = "Hello";
		String s2 = "He";
		s2 = s2.concat("llo");
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
				
		System.out.println("s1 == s2 is " + (s1 == s2));
		System.out.println("s1.equals(s2) is " + s1.equals(s2));
		System.out.println("s1 == Hello is " + ("Hello" == s1));
		System.out.println("s1 == Hello is " + ("Hello ".trim() == s1));
		System.out.println("s1 == Hello is " + ("Hello ".trim().intern() == s1));

		System.out.println("\n\n");
				
		/* 06. Reading Input from Console */
		System.out.println("06. Reading Input from Console");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		System.out.println("Read: " + line);

		System.out.println("\n\n");

		/* 07. Writing to a File 
		 * New file Assignment01_TestFile1.txt will be created. 
		 */
		System.out.println("07. Writing to a File");

		PrintWriter pr = new PrintWriter(Files.newBufferedWriter(Paths.get("Assignment01_TestFile1.txt")));
		pr.println("I am writing: \"" + line + "\" to file output.txt");
		pr.close();

		System.out.println("\n\n");

		/* 08. Reading from a File 
		 * Contents of Assignment01_TestFile1.txt (it is created above) will be read.  
		 */
		System.out.println("08. Reading from a File");

		BufferedReader br2 = Files.newBufferedReader(Paths.get("Assignment01_TestFile1.txt"));
		while ((line = br2.readLine()) != null) {
			System.out.println("I read a line: " + line);
		}

		System.out.println("\n\n");
				
		/* 09. Is input String a Palindrome or not */
		System.out.println("09. Test String for Palindrome Checking");

		String inputStr = getStringFromConsole();
		System.out.println("Test Str for Palindrome: " + inputStr);
		if (isPalindrome(inputStr)) {
			System.out.println("String " + inputStr + " is a Palindrome!");
		} else {
			System.out.println("String " + inputStr + " is Not a Palindrome!");				
		}
		System.out.println("\n\n");

		/* 10. Counting occurrences of "Wickham" in Pride_And_Prejudice plaintext file 
		 * A file called "Pride_And_Prejedice_PlainText.txt" must be present - it is the book
		 * Pride and Prejudice in plaintext form - downloaded from web. 
		 */
		System.out.println("10. Counting occurrences of \"Wickham\" in Pride_And_Prejudice plaintext file");
		countOfWickhamApproachOne();
		countOfWickhamApproachTwo();
		System.out.println("\n\n");

	}

	/* 01. Determine if a number if within range (11 to 20) */
	public static boolean isNumberInRange(int number,
			                              int lowerLimit,
			                              int higherLimit)
	{
		boolean ok = false;
			
		if (number >= 11 && number <= 20) {
			ok = true;
		}
			
		return ok;
	}

	/* 02. Given a day - determine Weekday or Weekend (Not using Date class) */
	public static void morningRoutine(int today)
	{
		if (today < 1 || today > 7) {
			System.out.println("Day value can be only between 1 to 7");
		}
			
		switch (today) {
		case 1:
			System.out.println("This is Monday - Go to Work!");
			break;
		case 2:
			System.out.println("This is Tuesday - Go to Work!");
			break;
		case 3:
			System.out.println("This is Wednesday - Go to Work!");
			break;
		case 4:
			System.out.println("This is Tuesday - Go to Work!");
			break;
		case 5:
			System.out.println("This is Friday - Go to Work!");
			break;
		case 6:
			System.out.println("Weekend! This is Saturday - Sleep in!");
			break;
		case 7:
			System.out.println("Weekend! This is Sunday - Sleep in!");
			break;
		}
	}

	/* 03. Simulate Throwing of Two dice */
	public static void twoDiceThrowing()
	{
		int diceOutput1 = (int)(Math.random() * 6) + 1;
		int diceOutput2 = (int)(Math.random() * 6) + 1;

		System.out.println("Dice1 Output is " + diceOutput1);
		System.out.println("Dice2 Output is " + diceOutput2);
			
		if (diceOutput1 == 6 && diceOutput2 == 6) {
			System.out.println("You got Double Sixes!");
		}
			
		if (diceOutput1 == 1 && diceOutput2 == 1) {
			System.out.println("You got Double Ones!");
		}
	}

	/* 04. Fibonacci Series - n'th number */
	public static int fiboNumber(int n)
	{
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fiboNumber(n-1) + fiboNumber(n-2);
		}
	}
		
	/* 09. Is input String a Palindrome or not */
	public static boolean isPalindrome(String inputStr)
	{
		boolean ok = false;
			
		int inputStrLen = inputStr.length();

		for (int i=0 ; i < (inputStrLen / 2) ; i++) {
			if (inputStr.charAt(i) != inputStr.charAt(inputStrLen - 1 - i)) {
				return ok;
			}
		}

		ok = true;
		return ok;
	}
		
	public static String getStringFromConsole() throws Throwable
	{
		System.out.println("Enter String to test for Palindrome: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		return line;
	}
		
	/* 10. Counting occurrences of "Wickham" in Pride_And_Prejudice plaintext file */
		
	/* ApproachOne: */
	public static int countOfWickhamApproachOne() throws Throwable
	{
		int res = 0;
		String line;
			
		BufferedReader br2 = Files.newBufferedReader(Paths.get("Pride_And_Prejedice_PlainText.txt"));
		while ((line = br2.readLine()) != null) {
			// System.out.println("I read a line: " + line);
			if (line.indexOf("Wickham") != -1) {
				res += 1;
			}
		}
			
		System.out.println("Count is: " + res);
		return res;
	}
		
	/* ApproachTwo: */
	public static int countOfWickhamApproachTwo() throws Throwable
	{
		int res = 0;
		String line;
			
		final String MATCH = "Wickham";
		BufferedReader br = Files.newBufferedReader(Paths.get("Pride_And_Prejedice_PlainText.txt"));

		while ((line = br.readLine()) != null) {
			String [] words = line.split("\\W");
			for (int i = 0; i < words.length; i++) {
				if (words[i].equals(MATCH))
					res++;
			}
		}

		br.close();
			
		System.out.println("Simon Count is: " + res);
		return res;
	}

}

/*
 * ----------------------------------------------------------------------------
 * Output :-->
 * 
Hello, World!

01. Determine if a number is within range (11 to 20)
Number 15 is in Range 11 to 20...
Number 25 is Unacceptable for Range 11 to 20...



02. "Wake-Up" Day or "Sleep-In" Day
This is Tuesday - Go to Work!
This is Friday - Go to Work!
Weekend! This is Sunday - Sleep in!
Day value can be only between 1 to 7
Day value can be only between 1 to 7



03. Simulate Throwing of Two Dice
Dice1 Output is 5
Dice2 Output is 1



04. Fibonacci Series - n'th number 
The number at position 40 in Fibonacci series is: 165580141



05. String concat etc.
s1 is Hello
s2 is Hello
s1 == s2 is false
s1.equals(s2) is true
s1 == Hello is true
s1 == Hello is false
s1 == Hello is true



06. Reading Input from Console
racecar
Read: racecar



07. Writing to a File



08. Reading from a File
I read a line: I am writing: "racecar" to file output.txt



09. Test String for Palindrome Checking
Enter String to test for Palindrome: 
racecar
Test Str for Palindrome: racecar
String racecar is a Palindrome!



10. Counting occurrences of "Wickham" in Pride_And_Prejudice plaintext file
Count is: 194
Simon Count is: 194

 * ----------------------------------------------------------------------------
 */
