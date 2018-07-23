import java.io.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
public class replyEmail
{
  public static void main(String args[])
  {
    try
	{
    String host="wks12k";			  String sendhost="wks12k";
    String user="student";			  String password="sathya";
	String from="student@wks12k.com"; 
	Properties prop=System.getProperties();
	prop.put("mail.smtp.host",sendhost);
    Session ses1=Session.getDefaultInstance(prop,null);
    Store store1=ses1.getStore("pop3");
    store1.connect(host,user,password);
    Folder f1=store1.getFolder("INBOX");
    f1.open(Folder.READ_ONLY);
    BufferedReader breader=new BufferedReader(new InputStreamReader(System.in));
    Message msg[]=f1.getMessages();
    for(int i=0,n=msg.length;i<n;i++)
    {
      System.out.println(i+"  :  "+msg[i].getFrom()[0] +"\t"+msg[i].getSubject());
	  System.out.println("Do u want to reply this message :[y/n]");
	  String line=breader.readLine().trim();
	  if("Y".equalsIgnoreCase(line))
		{
		  System.out.println("replying........");
		  MimeMessage reply=(MimeMessage)msg[i].reply(false);
		  reply.setFrom((new InternetAddress(from)));
		  MimeMessage body=(MimeMessage)msg[i];
		  StringBuffer buffer1=new StringBuffer("My reply goes here\n");
		  if(body.isMimeType("text/plain"))
			{
			  String content=(String)body.getContent();
			  StringReader cReader=new StringReader(content);
			  BufferedReader bReader=new BufferedReader(cReader);
			  String cLine;
			  while((cLine=bReader.readLine())!= null)
				{
				  buffer1.append(">");
				  buffer1.append(cLine);
				  buffer1.append("\r\n");
				}
			}
			reply.setText(buffer1.toString());
			Transport.send(reply);
		  }
		 else if("N".equalsIgnoreCase(line))
			{
				break;
			}
		  }
	f1.close(false);
	store1.close();
  }catch(Exception e){System.out.println("Exception :"+e);}
  }
}
