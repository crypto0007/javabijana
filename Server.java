// Run this program first followed by Client.java

import java.io.*;
import java.net.*;
import java.util.*;

public class Server{
	public static void main(String ar[])	{
		try		{
			ServerSocket server = new ServerSocket(8000);
			Socket client = server.accept();
			DataInputStream fromclient = new DataInputStream(client.getInputStream());
			PrintWriter toclient = new PrintWriter(client.getOutputStream(),true);
			
			Scanner sc = new Scanner(fromclient);
			String msg = sc.next();
			System.out.println(msg);
			String area = "Good Morning";
			toclient.println(area);

		}catch(IOException e){
			System.out.println(e);
		}
	}
}