package inheritence;
class m1
{
	void m2(int a)
	{
		System.out.println("class m1 int method");
	}
	void m2(float f,int d)
	{
		System.out.println("class m1 float method");
	}
}

public class m2 extends m1{
	void m2(int a)
	{
		System.out.println("class m2 int method");
	}
	void m2(int n,int j)
	{
		System.out.println("class m2 int m1");
	}
void m2(float l,int k)
{
	System.out.println("class m2 int m2");
}
void n()
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1 m=new m2();
		m.m2(99);
	//	m.n();

	}

}
