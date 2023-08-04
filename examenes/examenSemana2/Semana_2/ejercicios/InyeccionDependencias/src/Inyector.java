public class Inyector {
    public static void inyectarAsunto(SendEmail email, Asunto asunto){
        email.setAsunto(asunto);
    }
}
