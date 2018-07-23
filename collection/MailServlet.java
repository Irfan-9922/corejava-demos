import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MailServlet extends HttpServlet 
{
  public void doPost(HttpServletRequest req, HttpServletResponse res)
       throws ServletException, IOException
  {
    res.setContentType("text/html");
    PrintWriter toClient = res.getWriter();
    try {
    String toText = req.getParameter("to");
    String fromText = req.getParameter("from");
    String subjectText = req.getParameter("subject");
    String contentText = req.getParameter("content");
    SendMessage.send(toText, fromText, subjectText, contentText);    
    toClient.println("<html>");
    toClient.println("<title>Thank you!</title>");
      toClient.println("<body bgcolor=#ffffff><p>" + "<font face=\"Helvetica\">" +
                       "Your message has been sent</font></body>");
      toClient.println("</html>");
    } catch(Exception e) {
      e.printStackTrace();
      toClient.println("A problem occured while sending Mail " + e);
    }
      
  }
}






