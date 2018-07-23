package exeption_Hnadling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exption {

	
		
		// TODO Auto-generated method stub

		public static void div() throws IOException
		{
			try
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				//infinite loop
				while(true)
				{
					
					try{
						System.out.println("enter the first number:");
					int	a=Integer.parseInt(br.readLine());
					break;
					
					}
					catch(NumberFormatException nfe)

					{
						System.out.println("please enter the only number");
						
						
					}
				}
				while(true)
				{
					try{
						System.out.println("please enter the second number:");
						int b=Integer.parseInt(br.readLine());
						try
						{
							int a=12;
							int c=a/b;
							System.out.println("result:"+c);
						}
						catch(ArithmeticException e)
						{
							System.out.println("please do not pass the zero");
							continue;
						}
						break;
					}
				
				catch(Exception ee)
				{
					System.out.println("oooop");
				}
				

}
		
}
finally{
	System.out.println("close");
}
		}
}