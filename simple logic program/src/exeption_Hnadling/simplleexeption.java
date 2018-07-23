package exeption_Hnadling;

import java.util.Scanner;

public class simplleexeption {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		
		while(true){
		
		try{
      System.out.println("please enter  the first number:");
      int a=sc.nextInt();
      if(a>0){
		
      System.out.println("please enter  the second number:");
      int b=sc.nextInt();
     int c=a/b;
     System.out.println(c);
      }
		}
		
		
		catch(Exception e)
		{
			try{
				
			System.out.println("inner try");
			int x=10;
			int y=20;
			int z=x+y;
			System.out.println(z);
			}
			catch(Exception e1)
			{
				System.out.println("in inner cztch");
			}
			finally{
				System.out.println("this is from finally block");
				return;
			}
			//System.out.println("unreachable statement");
		}
	}
	
	}
	

}
