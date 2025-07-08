package Services.Email;

public interface IEmailService {

    void sendEmail(String to, String subject, String body);
}
