/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcare;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
/**
 *
 * @author Jing Liang
 */
public class EmailSender {
    private Session session;
    private InternetAddress[] receivers;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // text the email sender
        EmailSender es = new EmailSender();
        try{
        es.setReceiver("sample@sample.com");
        }catch(Exception e){};
        es.sendMail("Hello","This is a sample email");
    }
    /**
     * This constructor setup a GMail sender
     * @param us the username of the GMail account
     * @param pw the password of the GMail account
     */
    public EmailSender(String us,String pw)
    {
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable","true" );
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.auth", "true" );
        props.put("mail.smtp.port", "587");
        final String username = us;
        final String password = pw;
        Authenticator auth;
        auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }};
        session = Session.getInstance(props, auth);
    }
    /**
     * This constructor overload the default constructor.
     * It use the default GMail username and password.
     */
    public EmailSender()
    {
       this("javaemailsender" ,"sendtestemail");
    }
    /**
     * This method set the receivers by their email address.
     * @param address the email addresses of all receivers
     */
    public void setReceivers(String[] address)  throws MessagingException
    {
        int size = address.length;
        receivers = new InternetAddress[size];
        for(int i=0;i<address.length;i++)
        {
            receivers[i] = new InternetAddress(address[i]);
        }
    }
    
    /**
     * This method overload the setReceivers(String[]) method.
     * @param address the email address of the receiver
     */
    public void setReceiver(String address) throws MessagingException
    {
        String[] re = {address};
        setReceivers(re);
    }
     /**
     * This method send out the email with specified subject and text to receivers.
     * @param subject the subject of the email.
     * @param text the text of the email.
     */
    public void sendMail(String subject, String text)
    {
        try
        {
            Message msg = new MimeMessage(session);
            msg.setRecipients(Message.RecipientType.TO, receivers);
            msg.setSubject(subject);
            msg.setText(text);
            Transport.send(msg);
            System.out.println("Message sent to");
            for(InternetAddress ad: receivers)
            {
                System.out.println(ad.toUnicodeString());
            }
            System.out.println("Successfully");
        }
        catch (Exception ex)
        {
          System.out.println("Exception: "+ ex);
        }
    }
    
}