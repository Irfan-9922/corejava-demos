import java.io.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
public class deleteEmail
{
  public static void main(String args[])throws Exception
  {
    String host="wks12k";
    String user="student";
    String password="javapoint";
	boolean deleteStatus=false;
    Properties prop=new Properties();
    Session ses1=Session.getDefaultInstance(prop,null);
    Store store1=ses1.getStore("pop3");
    store1.connect(host,user,password);
    Folder f1=store1.getFolder("INBOX");
    f1.open(Folder.READ_WRITE);
    BufferedReader breader=new BufferedReader(new InputStreamReader(System.in));
    Message msg[]=f1.getMessages();
    for(int i=0,n=msg.length;i<n;i++)
    {
      System.out.println(i+"  :  "+msg[i].getFrom()[0] +msg[i].getSubject());
	  System.out.println("Do u want to delete message :[y/n]");
	  String line=breader.readLine();
	  if("Y".equalsIgnoreCase(line))
		{
		  msg[i].setFlag(Flags.Flag.DELETED,true);
		  deleteStatus=true;
        }
	}
	f1.close(deleteStatus);
	store1.close();
  }
}
