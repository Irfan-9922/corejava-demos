package exeption_Hnadling;

import java.util.Scanner;

public class innerTrycatchblock {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true){
			try{
		
		System.out.println("please enter the crdit card number");
 
		int ceditno=sc.nextInt();
		if(ceditno>10){
		
			System.out.println("valid user");
			
		}
		
		else
		{
			System.out.println("please enter the proper credit card number");
			continue;
		}
		
		//	System.out.println("wrong ip");
			
		
			
		
			
		
			//break;
		
		
			
		}
	
			
			catch(Exception e)
			{
				System.out.println("oops");
			}
		break;
	}
		while(true)
		{
			try{
				System.out.println("enter the card holder name:");
				//String name="irfan";
				//Scanner sc=new Scanner(System.in);
				String name=sc.nextLine();
				if(name.equals("irfan"))
				{
					System.out.println("welcome irfna :::");
					System.out.println("welcome irfna ::: welcome to the i tech solution");
					
					
				}
				else
				{
					System.out.println("login denite");
					return;
				}
			}
			catch(NumberFormatException e2)
			{
				System.out.println("please enter the proper name");
			}
			break;
		}
	
		
		
}
}

