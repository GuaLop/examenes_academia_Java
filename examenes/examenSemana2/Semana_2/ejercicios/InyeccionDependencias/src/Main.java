

public class Main {
    public static void main(String[] args) {
        SendEmail email = new SendEmail("Juan");
        Inyector.inyectarAsunto(email, new EmailService());
        email.aplicarAsunto();
    }
}