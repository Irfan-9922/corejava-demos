package exeption_Hnadling;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(true){
			
		
		try
		{
			
		
		System.out.println("please enter the mobile no");
		int mo=sc.nextInt();
		if(mo<10)
		{
			try
			{
				if(mo<10)
				{
					System.out.println("inside if");
				}
			}
			catch(NumberFormatException nfe)
			{
				
				System.out.println("please enter the proper digit");
				continue;
		}
		break;
		}
		}
		
		catch(Exception nfe)
		{
			
			System.out.println("please enter the proper digit");
			continue;
	}
		
		
		
		
		 
		
	}
		
	

}
}
