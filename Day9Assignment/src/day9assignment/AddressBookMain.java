package day9assignment;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        int choice;
        do {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Input: Add a new contact
                    System.out.print("Enter first name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.next();
                    System.out.print("Enter address: ");
                    String address = scanner.next();
                    System.out.print("Enter city: ");
                    String city = scanner.next();
                    System.out.print("Enter state: ");
                    String state = scanner.next();
                    System.out.print("Enter zip: ");
                    String zip = scanner.next();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();

                    Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(newContact);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                   
                    System.out.println("Contacts in Address Book:");   // Output: Display contacts
                    addressBook.displayContacts();
                    break;

                case 3:
                    // Input: Edit contact
                    System.out.print("Enter first name of the contact to edit: ");
                    String editFirstName = scanner.next();
                    System.out.print("Enter last name of the contact to edit: ");
                    String editLastName = scanner.next();
                    boolean editSuccess = addressBook.editContact(editFirstName, editLastName);
                    if (editSuccess) {
                        System.out.println("Contact edited successfully!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                   
                    System.out.print("Enter first name of the contact to delete: ");   // Input: Delete contact
                    String deleteFirstName = scanner.next();
                    System.out.print("Enter last name of the contact to delete: ");
                    String deleteLastName = scanner.next();
                    boolean deleteSuccess = addressBook.deleteContact(deleteFirstName, deleteLastName);
                    if (deleteSuccess) {
                        System.out.println("Contact deleted successfully!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);

        scanner.close();
    }
}