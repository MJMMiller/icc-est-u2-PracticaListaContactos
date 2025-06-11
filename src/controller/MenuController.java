package controller;

import models.Contact;
import view.ConsoleView;

public class MenuController {

    ConsoleView view;
    ContactManager contactManager;

    public MenuController(){
        contactManager = new ContactManager();
        view = new ConsoleView();
        contactManager.addContact(new Contact("Mateo Miller", "0962942726"));
        contactManager.addContact(new Contact("Nicolas Cedillo", "0123456789"));
        contactManager.addContact(new Contact("Juan Perez", "0987654321"));
        contactManager.addContact(new Contact("Maria Lopez", "0987654321"));
        contactManager.addContact(new Contact("Ana Gomez", "0987654321"));

    }

    public void showMenu(){
        
        int option = 0;
        do {
            view.displayMenu();
            option = Integer.parseInt(view.getInput("Seleccione una opción:"));
            
            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContactByName();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    printList();
                    break;
                case 5:
                    view.showMessage("Saliendo del programa...");
                    break;
                default:
                    view.showMessage("Opción no válida. Intente de nuevo");
                    break;
            }
        } while (option != 5);
    }

    public void addContact(){
        String name = view.getInput("Ingrese el nombre del contacto: ");
        String phone = view.getInput("Ingrese el número de teléfono del contacto: ");
        contactManager.addContact(new Contact(name, phone));
        view.showMessage("Contacto agregado exitosamente.");
    }

    public void findContactByName() {
        String name = view.getInput("Ingrese el nombre del contacto a buscar: ");
        Contact contact = contactManager.findContactByName(name);
        if (contact != null) {
            view.showMessage("Contacto encontrado: " + contact);
        } else {
            view.showMessage("Contacto NO encontrado: " + name);
        }
    }

    public void deleteContact() {
        String name = view.getInput("Ingrese el nombre del contacto a eliminar: ");
        contactManager.deleteContact(name,null);
        view.showMessage("Contacto eliminado exitosamente.");
    }

    public void printList() {
        contactManager.printList();
    }

}