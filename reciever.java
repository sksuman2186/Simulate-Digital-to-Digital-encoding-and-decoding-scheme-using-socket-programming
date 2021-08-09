import java.util.*;
import java.io.*;
import java.net.*;
import java.lang.*;
public class reciever
{



	public static void main(String args[])throws Exception
	{
		ServerSocket server=new ServerSocket(3300);
		Socket s=server.accept();
		System.out.println("Connected");
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		int start=0;
		int end=7;
		String str;
		int i,m;

		System.out.println("Recieved Encoded Digital Signal  :");

		while((str=in.readLine())!=null)
		{
			System.out.println(str);
			m=str.length();
			String str1=str.replace("-1","1");
			System.out.println("Decoded Digital Signal  :");
			System.out.println(str1);
			System.out.println("Recieved Data :");	
			while(end<=m)
			{

				String lol=str1.substring(start,end);	
				start=end;
				end=end+7;
				int decimal=Integer.parseInt(lol,2);
				System.out.print((char)decimal);


			}}
	}

}
