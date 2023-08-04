public class Principal {
    public static void main(String[] args) {
        ErrorNotifier errorNotifier = new ErrorNotifier();

        ErrorObserver adminUser1 = new AdminUser("Admin1");
        ErrorObserver adminUser2 = new AdminUser("Admin2");

        errorNotifier.addObserver(adminUser1);
        errorNotifier.addObserver(adminUser2);

        errorNotifier.simulateError("Error grave en el servidor");
    }
}