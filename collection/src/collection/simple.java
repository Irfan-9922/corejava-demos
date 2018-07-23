package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
import java.util.jar.Attributes;

public class simple {
	String name=new String("irfan");
	int rollano=12;
	String countery="india";
	String job=new String("java programer");
	int sal=2928382;
	String name1=new String("irfan");
	int rollao=12;
	String counteryd="india";
	String job1=new String("java programer");
	int sa1l=2928382;
	String job11=new String("java programer");
	int sa11l=2928382;
	
	
	public String toString() {
		return "simple [name=" + name + ", rollano=" + rollano + ", countery="
				+ countery + ", job=" + job + ", sal=" + sal + ", name1="
				+ name1 + ", rollao=" + rollao + ", counteryd=" + counteryd
				+ ", job1=" + job1 + ", sa1l=" + sa1l + ", job11=" + job11
				+ ", sa11l=" + sa11l + "]";
	}


	public static void main(String[] args) {
		
		simple s=new simple();
		
ArrayList v=new ArrayList();

 for(int i=0;i<=9;i++)
  
 {
	 v.add(i);
 }
  System.out.println(v);
  v.add("irfan");
/* Enumeration e=v.elements();
  while(e.hasMoreElements())
  {
	 Integer i=(Integer)e.nextElement();
	 if(i%2==0)
	 {
		 
	 System.out.println("evene number is:"+i+"and index is");
  }
	 else 
	 {
		 Enumeration ee=v.elements();
		 while(ee.hasMoreElements()){
			 
		 
		 String se=(String)ee.nextElement();
		 System.out.println(se.toUpperCase());
		 }
	 }
  
	}*/
//itrator
 /* Iterator itr=v.iterator();
  while(itr.hasNext())
	  
  {
	  Integer i=(Integer)itr.next();
	  if(i%2==0)
	  {
		  System.out.println(i);
	  }
	  else
	  {
		 // System.out.println(it);
		  itr.remove();
	  }
  }
  System.out.println(v);
}*/
	//ArrayList al=new ArrayList(v);
	ListIterator litr= v.listIterator();
	//forword direction
	System.out.println(litr.getClass().getName());
	while(litr.hasNext())
	{
		System.out.println(litr.next());
		System.out.println("index"+litr.nextIndex());
	}
	//going thrug reverse
	System.out.println("=======");
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
	}
}