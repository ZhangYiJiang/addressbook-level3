package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/**
 * Represents the storage mechanism for AddressBook objects 
 */
public interface Storage {
    /**
     * Loads the AddressBook from storage
     * @throws StorageOperationException
     */
    public AddressBook load() throws StorageOperationException;
    
    /**
     * Persists the provided AddressBook into storage 
     * @throws StorageOperationException
     */
    public void save(AddressBook addressBook) throws StorageOperationException;
    
    public String getPath();
}
