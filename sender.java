import java.io.*;
import java.util.*;
import java.lang.*;
import java.net.*;
public class sender
{
	public static void main(String args[])throws Exception
	{  
		Socket s=new Socket("127.0.0.1",3300);
		PrintWriter wr=new PrintWriter(s.getOutputStream());
		FileReader f=new FileReader("input2.txt");
		int ch;
		while((ch=f.read())!=-1)
		{
			//	System.out.println((char)ch);
			String x="";
			while( ch> 0)
			{
				int   a = ch %2;
				x = x + "" + a;
				ch= ch / 2;
			}
			if(x.length()<7)
			{while(x.length()<7)
				{
					x=x+"0";
				}
			}
			StringBuilder sb=new StringBuilder(x);  
			sb.reverse();  
			x= sb.toString();

			int i,j,m,temp=0;
			char[] str=x.toCharArray();
			int str1[]=new int[7];
                        //String str1[]=new String[100];
			//char str1[]=new char[7];
			m=x.length();
			for(i=0;i<m;i++)
			{
				if(str[i]=='0')
				{
					str1[i]=0;
				}
				else if(str[i]=='1')
				{
					if(temp==0)
					{
						temp=1;
						str1[i]=1;
					}
					else if(temp==1)
					{
						temp=-1;
						str1[i]=-1;
					}
					else if(temp==-1)
					{
						temp=1;
						str1[i]=1;
					}
				}
			}
			/*for(i=0;i<m;i++)
			{
				System.out.print(str1[i]);
			}*/
			//System.out.println("I AM MR SAHIL");
			
			String str2[]=new String[str1.length];
			for(i=0;i<str1.length;i++)
			{
				str2[i]=String.valueOf(str1[i]);
			}
			// System.out.println(Arrays.toString(str2));
			/*for(i=0;i<m;i++)
			{
				System.out.print(str2[i]);
			}
			System.out.println("AND I AM MR SUBHASH");*/
			
			//wr.print(x);
			for(i=0;i<m;i++)
			{
				wr.print(str2[i]);
			}
			wr.flush();
			int decimal=Integer.parseInt(x,2);

			x=null;      
		}

		//		for(int p=array.length-1;p>=0;p--)
		//			System.out.println(array[p]);
		//		int lol= digit(array);
		//		System.out.print(lol);
		//		 char  x=(char)lol;
		//wr.print(array);


		//		 System.out.println(x);	

	}
}
