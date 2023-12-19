package addressbookuc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public boolean editContact(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName) && contact.getFirstName().equals(lastName)) {
              
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String firstName, String lastName) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getFirstName().equals(firstName) && contact.getFirstName().equals(lastName)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
