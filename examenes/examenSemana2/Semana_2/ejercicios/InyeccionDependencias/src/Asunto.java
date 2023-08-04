
 interface Asunto {
    void escribeAsunto();
 }
class EmailService implements Asunto{

    @Override
    public void escribeAsunto() {
        System.out.println("Asunto: Bienvenido a nuestra empresa");
    }
}
 class EmailService2 implements Asunto{
     @Override
     public void escribeAsunto() {
         System.out.println("Asunto: Usted ha ganado un viaje");
     }
 }
 class EmailService3 implements Asunto{
     @Override
     public void escribeAsunto( ) {
         System.out.println("Venta nocturna Liverpool");
     }
 }
