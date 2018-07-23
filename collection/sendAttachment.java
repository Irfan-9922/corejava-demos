import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class sendAttachment
{
  public static void main(String args[])throws Exception
  {
    String host="off";	    
	String user="student";   
	String password="tiger";  	
	String from="student@off.com";
	String to="student@off.com";
	String filename="dragon.gif";
    Properties prop=System.getProperties(); 
	prop.put("mail.smtp.host",host);
    Session ses1=Session.getDefaultInstance(prop,null);
    
	Message msg=new MimeMessage(ses1);
	msg.setSubject("Photo Attached");
	msg.setFrom(new InternetAddress(from));
	msg.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	BodyPart msgBP=new MimeBodyPart();
	msgBP.setText("Take a look at this\n");
	Multipart mPart=new MimeMultipart();
	mPart.addBodyPart(msgBP);
	msgBP=new MimeBodyPart();
	DataSource src=new FileDataSource(filename);
    msgBP.setDataHandler(new DataHandler(src));
    msgBP.setFileName(filename);
	mPart.addBodyPart(msgBP);
    msg.setContent(mPart);
    Transport.send(msg);
	System.out.println("mail sent");
}
}