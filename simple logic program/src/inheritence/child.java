package inheritence;

public class child extends parant{
	public void m3()
	{
		System.out.println("child m3()");
	}
	//sub class method that is aavailable in super class then 
	//super class method calld overridden method
	//where child class method is called voerriding method
	public static  void m1()
	{
		System.out.println("from child m1()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*parant p=new parant();
		p.m1();
		p.m2();*/
		/*parant p =new child();
		p.m2();
*/
		
		//here ovrriding method can be exicuted from object class is called as runtime polymorphisome
		//where as ovrloded ,static method and non ovr method is exicuted from refrence variable class
		//it also called compiletimr polymorphisome
		parant p=new child();
		p.m1();
		p.m1();
	}

}
