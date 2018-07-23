package collection;

public class dateDiggrece{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String timeStart="10:1 AM";
		String timeStart="10:1 AM";
		String timeEnd ="10:41 AM";
		String[]time=timeStart.split(" ");
		String []time1=timeEnd.split(" ");
		String[] timesep=time[0].split(":");
		String[] timesep1=time1[0].split(":");
		int h=Integer.parseInt(timesep[0]);
		int h1=Integer.parseInt(timesep1[0]);
		int m=Integer.parseInt(timesep[1]);
		int m1=Integer.parseInt(timesep1[1]);
		int tmspend=0;
		if(time[1].equals(time1[1])){
			int th=h1-h;
			int tm=m1-m;
			tmspend=(th*60)+tm;
			System.out.println(tmspend);
					
		}
		else{
			int th=12;
			th+=h1-h;
			int tm=m1-m;
			tmspend=(th*60)+tm;
			System.out.println(tmspend);

	}
	}

}
