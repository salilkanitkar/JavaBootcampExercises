/*
 * ----------------------------------------------------------------------------
 *
 * Create dummy web client that sends "GET <fileName>" & "QUIT"
 * GET fileName - receive the file from Server & display its contents to console
 * QUIT - send QUIT to server to tell to exit
 * Server is listening on random port 9999
 * 
 * Ensure file "Assignment07_TestFile1.txt" & "Assignment07_TestFile2.txt" are
 * present.
 *
 * ----------------------------------------------------------------------------
 */

package assignment7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Assignment7_Client {

	public static void main(String [] args) throws Throwable
	{
		String cmd1 = "GET Assignment07_TestFile1.txt";
		String cmd2 = "GET Assignment07_TestFile2.txt";
		String quitCmd = "QUIT";

		SendCommandToServer(cmd1);
		SendCommandToServer(cmd2);
		
		SendCommandToServer(quitCmd);				
	}
	
	public static void SendCommandToServer(String cmd) throws Throwable
	{
		Socket s = new Socket("127.0.0.1", 9999);
		System.out.println("Sending Command: " + cmd);
		
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		pw.println(cmd);
		pw.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println("Received: " + br.readLine());
		br.close();
		
		s.close();
	}
}

/*
 * ----------------------------------------------------------------------------
 * Output :-->
Sending Command: GET Assignment07_TestFile1.txt
Received: GET Ack
Sending Command: GET Assignment07_TestFile2.txt
Received: GET Ack
Sending Command: QUIT
Received: QUIT Ack
 * ----------------------------------------------------------------------------
 */
