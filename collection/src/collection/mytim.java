package collection;

public class mytim {

	public static void main(String[] args) {
		String stime="10:12 AM";
		String end="10:30: AM";
		String[] time=stime.split(" ");
		String[] time1=end.split(" ");
		String[] sptime=time[0].split(":");
		String[] sptime1=time1[0].split(":");
		int h=Integer.parseInt(sptime[0]);
		int h1=Integer.parseInt(sptime1[0]);
		int m=Integer.parseInt(sptime[1]);
		int m1=Integer.parseInt(sptime1[1]);
		int diff=0;
		if(time[1].equals(time1[1])){
			int hour=h1-h;
			int min=m1-m;
			diff=(hour*60)+min;
			System.out.println(diff);
		}
		else
		{
			int hour=12;
			hour+=h1-h;
			int min=m1-m;
			diff=(hour*60)+min;
			System.out.println(diff);
		}
		}
}
