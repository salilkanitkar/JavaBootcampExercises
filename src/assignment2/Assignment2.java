/*
 * ----------------------------------------------------------------------------
 *
 * 01. Remove a character from a String
 * 02. Mirror a given String
 * 03. Is given String an Adverb or not
 * 04. Search if a word is in a File using 'List'
 * 05. Handling words in a File using 'Set'
 * 06. Use 'Map'
 * 07. Sort using 'Collections'
 *
 * ----------------------------------------------------------------------------
 */

package assignment2;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Assignment2 {

	public static void main(String [] args) throws Throwable
	{
		/* 01. Remove a character from a String */
		System.out.println("\n---------------------------\n");
		System.out.println("01. Remove a character from a String");
		
		String str1 = "salilsalil";
		char   cStr1 = 'a';
		
		System.out.println("Original String is: " + str1);
		
		if (removeCharFromStr(str1, cStr1)) {
			System.out.println("Character " + cStr1 + " removed!");
		} else {
			System.out.println("Character " + cStr1 + " was not present in \"" + str1 + "\"");
		}
		
		System.out.println("\n---------------------------\n");
		
		/* 02. Mirror a given String */
		System.out.println("02. Reflect a String");
		
		String str2 = "salil";
		
		System.out.println("Original String is: " + str2);

		if (reflectAString(str2)) {
			System.out.println("String reflected!");
		} else {
			System.out.println("Error in reflecting String!");
		}
		
		System.out.println("\n---------------------------\n");

		/* 03. Is given String an Adverb or not */
		System.out.println("03. Is given String an Adverb or not");
		
		String str4_1 = "salil";
		System.out.println("String-1 is: " + str4_1);
		isAdverb(str4_1);

		String str4_2 = "salilly";
		System.out.println("String-2 is: " + str4_2);
		isAdverb(str4_2);
		
		System.out.println("\n---------------------------\n");

		/* 04. Search if a word is in a File using 'List'
		 * File called "Assignment02_TestFile1.txt" must be present.
		 * It should have below contents:
		 * line1Word1 line1Word2 line1Word3 line1Word4 line1Word5 line1Word6
		 * line2Word1 line2Word2 line2Word3 line2Word4 line2Word5
		 * line3Word1 line3Word2 line3Word3
		 * line4Word1 line4Word2 line4Word3 line4Word4 line4Word5 line4Word6 
		 */
		System.out.println("04. Search if a word is in a File using \'List\'");
		
		String testWord1 = "line2Word4";
		String testWord2 = "line5Word1";
		
		isWordPresentInFileUsingList(testWord1);
		isWordPresentInFileUsingList(testWord2);

		System.out.println("\n---------------------------\n");
		
		/* 05. Handling words in a File using 'Set'
		 * File called "Assignment02_TestFile2.txt" must be present.
		 * It should have below contents:
		 * stark lannister stark
		 * lannister baratheon
		 * greyjoy
		 */
		System.out.println("05. Handling words in a File using \'Set\'");
		
		handleWordsInFileUsingSet();

		System.out.println("\n---------------------------\n");

		/* 06. Use 'Map' */
		System.out.println("06. Use \'Map\'");
		
		useMap();

		System.out.println("\n---------------------------\n");
		
		/* 07. Sort using 'Collections' */
		System.out.println("07. Sort using \'Collections\' ");
		
		doSort();

		System.out.println("\n---------------------------\n");

	}

	/* 01. Remove a character from a String */
	public static boolean removeCharFromStr(String str1, char cStr1) throws Throwable
	{
		boolean ok = false;
		int index = 0;
		
		index = str1.indexOf(cStr1);

		if (index == -1) {
			return ok;
		}
		
		do {
			char [] leftCharArr = new char [str1.length()];
			char [] rightCharArr = new char [str1.length()];
			
			str1.getChars(0, index, leftCharArr, 0);
			String leftStr = new String(leftCharArr);

			str1.getChars(index + 1, str1.length(), rightCharArr, 0);
			String rightStr = new String(rightCharArr);

			str1 = leftStr + rightStr;
			// System.out.println("New Str is: \"" + str1 + "\"");
			
			index = str1.indexOf(cStr1);

		} while (index != -1);

		System.out.println("Final String is: \"" + str1 + "\"");
		ok = true;
		return ok;
	}

	/* 02. Mirror a given String */
	public static boolean reflectAString(String str)
	{
		boolean ok = false;
		
		StringBuilder revStr = new StringBuilder();
		
		for (int i = str.length() - 1 ; i >= 0 ; i--) {
			revStr.append(str.charAt(i));
		}
		
		str = str + revStr;
		ok = true;
		
		System.out.println("Reflected String is: " + str);
		return ok;
	}
	
	/* 03. Is given String an Adverb or not */
	public static void isAdverb(String str) throws Throwable
	{
		if (str.lastIndexOf("ly") != -1) {
			System.out.println("It is an Adverb");
		} else {
			System.out.println("It is not an Adverb");
		}
	}
	
	/* 04. Search if a word is in a File using 'List' */
	public static void isWordPresentInFileUsingList(String str) throws Throwable
	{
		boolean ok = false;
		
		List<String> words = new ArrayList<String>();
		String line;
		
		BufferedReader br2 = Files.newBufferedReader(Paths.get("Assignment02_TestFile1.txt"));

		while ((line = br2.readLine()) != null) {
			String [] lineWords;
			lineWords = line.split("\\W");
			for (int i = 0 ; i < lineWords.length ; i++) {
				words.add(lineWords[i]);
			}
		}

		ListIterator<String> iter = words.listIterator();
		
		while(iter.hasNext()) {
			if (iter.next().equals(str)) {
				System.out.println("Word \"" + str + "\" is present in the File!");
				ok = true;
				break;
			}
		}
		
		if (!ok) {
			System.out.println("Word \"" + str + "\" is Not present in the File!");
		}
		
	}

	/* 05. Handling words in a File using 'Set' */
	public static void handleWordsInFileUsingSet() throws Throwable
	{
		Set<String> words = new TreeSet<String>();
		String line;
		
		BufferedReader br2 = Files.newBufferedReader(Paths.get("Assignment02_TestFile2.txt"));

		System.out.println("Printing All Words from the File: ");
		
		while ((line = br2.readLine()) != null) {
			String [] lineWords;
			lineWords = line.split("\\W");
			for (int i = 0 ; i < lineWords.length ; i++) {
				System.out.print(lineWords[i] + " ");
				words.add(lineWords[i]);
			}
		}

		System.out.println("\n\nPrinting All Words from the Set: ");
		Iterator<String> iter = words.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		System.out.print("\n");
	}

	/* 06. Use 'Map' */
	public static void useMap() throws Throwable
	{
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(1, "Monday");
		hMap.put(2, "Tuesday");
		hMap.put(3, "Wednesday");
		hMap.put(4, "Thursday");
		hMap.put(5, "Friday");
		hMap.put(6, "Saturday");
		hMap.put(7, "Sunday");

		String wednesDay = hMap.get(3);
		String sunDay    = hMap.get(7);
		
		System.out.println("String1: \"" + wednesDay + "\" String2: \"" + sunDay + "\"");
		
		Set<Map.Entry<Integer, String>> sHMap = hMap.entrySet();
		
		Iterator<Map.Entry<Integer, String>> iter = sHMap.iterator();
		
		while (iter.hasNext()) {
			Entry<Integer, String> entry = iter.next();
			System.out.println("Mapping: Key:" + entry.getKey() + " Value:" + entry.getValue());
		}
	}
	
	/* 07. Sort using 'Collections' */
	public static void doSort()
	{
		List<String> ls = Arrays.asList("Fred", "Jim", "Sheila", "Tony", "Albert",
				"Charlene", "Christine");
		System.out.println("Before: " + ls);
		Collections.sort(ls);
		System.out.println("After: " + ls);
	}

}

/*
 * ----------------------------------------------------------------------------
 * Output :-->
 *

---------------------------

01. Remove a character from a String
Original String is: salilsalil
Final String is: "s         lils      lil                 "
Character a removed!

---------------------------

02. Reflect a String
Original String is: salil
Reflected String is: salillilas
String reflected!

---------------------------

03. Is given String an Adverb or not
String-1 is: salil
It is not an Adverb
String-2 is: salilly
It is an Adverb

---------------------------

04. Search if a word is in a File using 'List'
Word "line2Word4" is present in the File!
Word "line5Word1" is Not present in the File!

---------------------------

05. Handling words in a File using 'Set'
Printing All Words from the File: 
stark lannister stark lannister baratheon greyjoy 

Printing All Words from the Set: 
baratheon greyjoy lannister stark 

---------------------------

06. Use 'Map'
String1: "Wednesday" String2: "Sunday"
Mapping: Key:1 Value:Monday
Mapping: Key:2 Value:Tuesday
Mapping: Key:3 Value:Wednesday
Mapping: Key:4 Value:Thursday
Mapping: Key:5 Value:Friday
Mapping: Key:6 Value:Saturday
Mapping: Key:7 Value:Sunday

---------------------------

07. Sort using 'Collections' 
Before: [Fred, Jim, Sheila, Tony, Albert, Charlene, Christine]
After: [Albert, Charlene, Christine, Fred, Jim, Sheila, Tony]

---------------------------

 * ----------------------------------------------------------------------------
 */