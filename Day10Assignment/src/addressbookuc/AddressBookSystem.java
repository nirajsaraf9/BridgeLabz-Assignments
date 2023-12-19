package addressbookuc;

import java.util.HashMap;
import java.util.Map;

class AddressBookSystem {
    private Map<String, AddressBook> addressBooks;

    public AddressBookSystem() {
        this.addressBooks = new HashMap<>();
    }

    public void addAddressBook(String name) {
        addressBooks.put(name, new AddressBook());
        System.out.println("Address Book '" + name + "' created successfully!");
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }
}