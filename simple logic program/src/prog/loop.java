package prog;

public class loop {

	public static void main(String[] args) {
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9-i;j++)
			{
				System.out.print("");
			}
			for(int m=0;m<i*2+4;m++)
			{
				System.out.print("  *");
			}
			System.out.println("\t");
		}
		// TODO Auto-generated method stub
         for(int k=9;k>1;k--)
         {
        	 for(int l=0;l<k;l++)
        	 {
        		 System.out.print(l);
        	 }
        	 System.out.println("");
         }
	}

}
