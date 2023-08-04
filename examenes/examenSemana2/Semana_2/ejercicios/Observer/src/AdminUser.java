/** Observadores
 * son usuarios que se suscriben para recibir notificaciones de errores
 * podria ser un desarrollador.
 * */
public class AdminUser implements ErrorObserver{
    private String name;

    public AdminUser(String name){
        this.name= name;
    }
    @Override
    public void onErrorOccurred(String errorMessage) {
        System.out.println(name + " recibio una notificación de error: " + errorMessage);

    }
}
