/*
 * ----------------------------------------------------------------------------
 *
 * Create dummy web server that responds to GET & QUIT
 * GET fileName - should send file to Client
 * QUIT - if QUIT is received from Client - just exit
 * Server listens on radom port 9999
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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Assignment7_Server {

	public static void main(String [] args) throws Throwable 
	{
		
		CreateSocketAndListen();
	}

	public static void CreateSocketAndListen() throws Throwable
	{
		
		while (true) {
			
			ServerSocket ss = new ServerSocket(9999);
			Socket s = ss.accept();

			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String line = br.readLine();
			if (line == null) {
				System.out.println("Received null line... ");
				continue;
			}
			
			List<String> clientCmd = new ArrayList<String>();
			String [] args = line.split("\\W");
			for (int i = 0 ; i < args.length ; i++) {
				clientCmd.add(args[i]);
			}
		
			if (args[0].equals("QUIT")) {
				System.out.println("Received QUIT - Shutting Down the Server ... ");
				
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
				pw.println(args[0] + " Ack");
				pw.flush();

				br.close();
				break;
			}

			if (!args[0].equals("GET")) {
				System.out.println("Unknown Command!");
			}
			
			System.out.println("Received GET Command ... ");

			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			pw.println(args[0] + " Ack");
			pw.flush();
			
			br.close();
			ss.close();
		}
	}
	
}

/*
 * ----------------------------------------------------------------------------
 * Output :-->
Received GET Command ... 
Received GET Command ... 
Received QUIT - Shutting Down the Server ... 
 * ----------------------------------------------------------------------------
 */
