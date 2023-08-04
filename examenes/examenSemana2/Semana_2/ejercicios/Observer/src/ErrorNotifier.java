import java.util.ArrayList;
import java.util.List;

/**Sujeto (Observable) el que representa el sistema de notificación de errores*/
public class ErrorNotifier {
    private List<ErrorObserver> observers = new ArrayList<>();

    public void addObserver(ErrorObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ErrorObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String errorMessage) {
        for (ErrorObserver observer : observers) {
            observer.onErrorOccurred(errorMessage);
        }
    }

    public void simulateError(String errorMessage) {
        System.out.println("Simulando error: " + errorMessage);
        notifyObservers(errorMessage);
    }
}
