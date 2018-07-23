package inheritence;
class a{
	void m(float d)
	{
		System.out.println("a float");
	}
}

public class overloadin extends a {
	void m(int a)
	{
		System.out.println("integer");
	}
	void m(String a)
	{
		System.out.println("string");
	}
  
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
overloadin v=new overloadin();
v.m("fdss");
a o=new  overloadin();
o.m(99);
	}

}
