package Services.Email;

public class EmailService implements IEmailService{

    @Override
    public void sendEmail(String to, String subject, String body) {

        System.out.println("EMAIL SENT TO YOU WITH THE ORDER DETAILS:");
        System.out.println();
        System.out.println();

        // Logic --> Create Email object and set From, To, Subject, Body .. use SMTP client to send
    }
}
