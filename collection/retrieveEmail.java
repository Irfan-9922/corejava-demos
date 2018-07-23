import java.io.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
public class retrieveEmail
{
  public static void main(String args[])throws Exception
  {
    String host="nt.local";
    String user="nataraz@nt.local";
    String password="nataraz";
    Properties prop=new Properties();
    Session ses1=Session.getDefaultInstance(prop,null);
    Store store1=ses1.getStore("pop3");
    store1.connect(host,user,password);
    Folder f1=store1.getFolder("INBOX");
    f1.open(Folder.READ_ONLY);
    BufferedReader breader=new BufferedReader(new InputStreamReader(System.in));
    Message msg[]=f1.getMessages();
    for(int i=0,n=msg.length;i<n;i++)
    {
      System.out.println(i+"  :  "+msg[i].getFrom()[0] +msg[i].getSubject());
	  System.out.println("Do u want to read message :[y/n]");
	  String line=breader.readLine();
	  if("Y".equalsIgnoreCase(line))
		{
		  System.out.println(msg[i].getContent());
        }
      else
		{
		  break;
		}
	}
	f1.close(false);
	store1.close();
  }
}
