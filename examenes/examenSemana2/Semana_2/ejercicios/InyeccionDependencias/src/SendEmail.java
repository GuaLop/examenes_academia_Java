
public class SendEmail {
    private final String destinatario;
    private Asunto asunto;

    public SendEmail(String destinatario){
        this.destinatario = destinatario;
    }

    public Asunto getAsunto() {
        return asunto;
    }

    public void setAsunto(Asunto asunto) {
        this.asunto = asunto;
    }

    public void aplicarAsunto(){
        System.out.println("Usuario: "+destinatario);
        asunto.escribeAsunto();
    }
}
