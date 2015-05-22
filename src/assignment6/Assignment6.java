/*
 * ----------------------------------------------------------------------------
 *
 * Take fileName from Console - read the file line by line.
 * Catch some exceptions - make sure FileReaders are closed using 'finally'
 * Prompt user again & again until a valid fileName is given for reading.
 *
 * ----------------------------------------------------------------------------
 */

package assignment6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class Assignment6 {

	public static void main(String [] args) throws Throwable {
		
		boolean ok = false;
		BufferedReader br2 = null;
		
		while (!ok) {
			
			System.out.print("Enter FileName: ");
			System.out.flush();
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			String fileName = br1.readLine();
			System.out.print("FileName is: " + fileName);
			System.out.flush();
			System.out.println("\n");
			
			try {
				String line;
				br2 = Files.newBufferedReader(Paths.get(fileName));
				while ((line = br2.readLine()) != null) {
					System.out.println("I read a line: " + line);
				}
				ok = true;
	
				/* Instead of Files.newBufferedReader, I could use FileReader ...
				 * 
				 * FileReader fr = null;
				 * fr = new FileReader(fileName);
				 * BufferedReader fbr = new BufferedReader(fr);
				 * 
				 * ** Now use the same while readLine() loop as above to read
				 * ** the file.
				 * */

			} catch (FileNotFoundException e) {
				System.out.println("File Not Found! We must try again ....");

			} catch (NoSuchFileException e) {
				System.out.println("No such File - \"" + e.getFile() + "\", We must try again ....");

			} finally {
				if (br2 != null) {
					try {
						br2.close();
					} catch(IOException ioe) {
						ioe.printStackTrace();
					}
				}
			}
			
		}

	}
}

/*
 * ----------------------------------------------------------------------------
 * Output :-->

Enter FileName: FileNotPresent.txt
FileName is: FileNotPresent.txt

No such File - "FileNotPresent.txt", We must try again ....
Enter FileName: Assignment01_TestFile1.txt
FileName is: Assignment01_TestFile1.txt

I read a line: I am writing: "racecar" to file output.txt

 * ----------------------------------------------------------------------------
 */