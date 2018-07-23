import java.io.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
public class forwardEmail
{
  public static void main(String args[])throws Exception
  {
    String host="wks12k";	String sendhost="wks12k";
    String user="student";   String password="javapoint";
	String from="nissinath_mk@javapoint.local";
	String to="nissinath_mk1@javapoint.local";
    Properties prop=System.getProperties();   prop.put("mail.smtp.host",sendhost);
    Session ses1=Session.getDefaultInstance(prop,null);
    Store store1=ses1.getStore("pop3");
    store1.connect(host,user,password);
    Folder f1=store1.getFolder("INBOX");
    f1.open(Folder.READ_ONLY);
    BufferedReader breader=new BufferedReader(new InputStreamReader(System.in));
    Message msg[]=f1.getMessages();
    for(int i=0;i<msg.length;i++)
    {
      System.out.println(i+"  :  "+msg[i].getFrom()[0] +"\t"+msg[i].getSubject());
	  System.out.println("Do u want to forward the message :[y/n]");
	  String line=breader.readLine();
	  if("Y".equalsIgnoreCase(line))
		{
		  Message fwd=new MimeMessage(ses1);
		  fwd.setSubject("Fwd  : "+msg[i].getSubject());
		  fwd.setFrom(new InternetAddress(from));
		  fwd.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
		  BodyPart msgBP=new MimeBodyPart();
		  msgBP.setText("Your message goes here \n");
		  Multipart mPart=new MimeMultipart();
		  mPart.addBodyPart(msgBP);
		  msgBP=new MimeBodyPart();
		  msgBP.setDataHandler(msg[i].getDataHandler());
		  mPart.addBodyPart(msgBP);
		  fwd.setContent(mPart);
		  Transport.send(fwd);
		}
 	   else if("N".equalsIgnoreCase(line))
		{
				break;
		}
	  }
	
	f1.close(false);
	store1.close();
  }
}