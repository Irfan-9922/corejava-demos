package prog;

import java.util.Date;
import java.util.Scanner;

public class compair {
	void age(){
		Scanner sc=new Scanner(System.in);
		System.out.println("plese enter hte year of bearth");
	/*double d=sc.nextDouble();
		
		Date e=new Date();
	//int g=	d-e;
		//System.out.println();
		Date f=new Date();
		;System.out.println(e)*/
	//	e=sc.nextDouble()
		double d=sc.nextDouble();
		Date e=new Date();
		e.setDate(1992);
		System.out.println(e);
		//e.getDate();
		Date f=new Date();
		System.out.println("please enter the date ");
		//f.compareTo()
	}
public static void main(String[] args) {
	compair c=new compair();
	c.age();
}
}

