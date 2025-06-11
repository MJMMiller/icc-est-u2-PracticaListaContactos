package view;
import java.util.Scanner;

public class ConsoleView {

    private final Scanner sc;

    public ConsoleView() {
        sc = new Scanner(System.in);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void displayMenu() {
        showMessage("\nMenú:");
        showMessage("1. Agregar contacto");
        showMessage("2. Buscar contacto");
        showMessage("3. Eliminar contacto");
        showMessage("4. Listar contactos");
        showMessage("5. Salir");
    }

    public String getInput(String prompt) {
        showMessage(prompt);
        return sc.nextLine();
    }
}