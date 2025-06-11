package controller;

import models.Contact;
import models.LinkedList;

public class ContactManager {

    private LinkedList<Contact> contacts;

    public ContactManager(){
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact contact) {
        contacts.appendTail(contact);
    }

    public Contact findContactByName(String name) {
        if (contacts != null) {
            return contacts.findByValue(new Contact(name, ""));
        }
        return null;
    }

    public void deleteContact(String name, String phone) {
        if (contacts != null) {
            contacts.deleteByValue(new Contact(name, phone));
        }
    }

    public void printList(){
        if (contacts != null) {
            contacts.print();
        } else {
            System.out.println("No contacts available.");
        }
    }
}
