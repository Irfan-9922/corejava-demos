package inheritence;

public class second extends first{
public void m2()
{
	System.out.println("from the child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*second s = new second();
		s.m1();
		s.m2();*/
		//in this case create the second class object , by using consturctor it can be instatiate the super class also thats 
		//why we can create the super class refrence variable 
		//but we can exicute only super class method not in sub class
		
		first f = new second();
		f.m1();
	//	f.m2();
		
		/*second s=(second) new first();
		s.m1();
		s.m2();*/

	}

}
