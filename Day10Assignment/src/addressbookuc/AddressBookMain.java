package addressbookuc;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBookSystem addressBookSystem = new AddressBookSystem();

        int choice;
        do {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Create a new Address Book");
            System.out.println("2. Add a Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Add Multiple Persons to Address Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Input: Create a new Address Book
                    System.out.print("Enter the name of the new Address Book: ");
                    String addressBookName = scanner.next();
                    addressBookSystem.addAddressBook(addressBookName);
                    break;

                case 2:
                    // Input: Add a new contact
                    System.out.print("Enter the name of the Address Book to add a contact: ");
                    String bookName = scanner.next();
                    AddressBook addressBook = addressBookSystem.getAddressBook(bookName);
                    if (addressBook != null) {
                        // Input: Add a new contact
                        System.out.print("Enter first name: ");
                        String firstName = scanner.next();
                        System.out.print("Enter last name: ");
                        String lastName = scanner.next();
                        System.out.print("Enter address: ");
                        String addressStr = scanner.next();
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

                        Contact newContact = new Contact(firstName, lastName, addressStr, city, state, zip, phoneNumber, email);
                        addressBook.addContact(newContact);
                        System.out.println("Contact added to Address Book '" + bookName + "' successfully!");
                    } else {
                        System.out.println("Address Book not found.");
                    }
                    break;

                case 3:
                    // Output: Display contacts
                    System.out.print("Enter the name of the Address Book to display contacts: ");
                    String displayBookName = scanner.next();
                    AddressBook displayAddressBook = addressBookSystem.getAddressBook(displayBookName);
                    if (displayAddressBook != null) {
                        System.out.println("Contacts in Address Book '" + displayBookName + "':");
                        displayAddressBook.displayContacts();
                    } else {
                        System.out.println("Address Book not found.");
                    }
                    break;

                case 4:
                    // Input: Edit contact
                    System.out.print("Enter the name of the Address Book to edit a contact: ");
                    String editBookName = scanner.next();
                    AddressBook editAddressBook = addressBookSystem.getAddressBook(editBookName);
                    if (editAddressBook != null) {
                        System.out.print("Enter first name of the contact to edit: ");
                        String editFirstName = scanner.next();
                        System.out.print("Enter last name of the contact to edit: ");
                        String editLastName = scanner.next();
                        boolean editSuccess = editAddressBook.editContact(editFirstName, editLastName);
                        if (editSuccess) {
                            System.out.println("Contact edited successfully!");
                        } else {
                            System.out.println("Contact not found.");
                        }
                    } else {
                        System.out.println("Address Book not found.");
                    }
                    break;

                case 5:
                    // Input: Delete contact
                    System.out.print("Enter the name of the Address Book to delete a contact: ");
                    String deleteBookName = scanner.next();
                    AddressBook deleteAddressBook = addressBookSystem.getAddressBook(deleteBookName);
                    if (deleteAddressBook != null) {
                        System.out.print("Enter first name of the contact to delete: ");
                        String deleteFirstName = scanner.next();
                        System.out.print("Enter last name of the contact to delete: ");
                        String deleteLastName = scanner.next();
                        boolean deleteSuccess = deleteAddressBook.deleteContact(deleteFirstName, deleteLastName);
                        if (deleteSuccess) {
                            System.out.println("Contact deleted successfully!");
                        } else {
                            System.out.println("Contact not found.");
                        }
                    } else {
                        System.out.println("Address Book not found.");
                    }
                    break;

                case 6:
                   
                    System.out.print("Enter the name of the Address Book to add multiple persons: ");   // Input: Add multiple persons to Address Book
                    String multiAddBookName = scanner.next();
                    AddressBook multiAddAddressBook = addressBookSystem.getAddressBook(multiAddBookName);
                    if (multiAddAddressBook != null) {
                        System.out.print("Enter the number");
                    }
                    else {
                    	
                    }

            }



