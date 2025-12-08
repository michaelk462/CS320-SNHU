/**********Code Information**********
* Name: Michael King
* Date: December 7, 2025
* File: ContactService.java
* Course: CS-320 
* Assignment: Project One
* University: SNHU
************************************/

package Contact;

/***Java Imports***/
import java.util.HashMap;
import java.util.Map;

/***Class ContactService***/
public class ContactService {
	
	/***Declares List of Contacts From Hash Table***/
	private Map<String, Contact> hashListOfContacts = new HashMap<>();
	
	/***Method to Add New Contact***/
	public void addContact (Contact newContact) {
		//***Verifies if Contact is Null or Already Exists***
		if (newContact == null || hashListOfContacts.containsKey(newContact.getID()))  {
			//Displays message if contact is null or already exists.
			throw new IllegalArgumentException("Error: This contact is null/already exists. "
					+ "Please use a unique contact.");
		} else { //Otherwise, the contact is added with its own unique ID.
			hashListOfContacts.put(newContact.getID(), newContact);
		}//end if
	}//end method
	
	/***Method to Delete Contact***/
	public void deleteContact(String contactID) {
		if (!hashListOfContacts.containsKey(contactID)) {
			//Displays message if contact does not exist.
			throw new IllegalArgumentException("Error: This contact is invalid. "
					+ "Please use a different contact.");
		} else { //Otherwise, the contact is deleted by its own unique ID.
			hashListOfContacts.remove(contactID); 
		}//end if
	}//end method
	
	/***Method to Update First and Last Name, Phone Number and Address in Contact***/
	public void updateContact (String contactID, 
			String firstName,
			String lastName,
			String phone,
			String address) {
		
		//Creates new Contact from Hash Map.
		Contact newContact = hashListOfContacts.get(contactID);
		
		if (newContact == null) {
			//Displays message if contact does not exist.
			throw new IllegalArgumentException("Error: This contact is null. "
					+ "Please use an existing contact.");
		} else { //Otherwise, all the fields in the contact are updated per contact ID
			//If First Name is *not* null, it is updated.
			if (firstName != null) { newContact.setFirstName(firstName); 
			}//end if
			
			//If Last Name is *not* null, it is updated.
			if (lastName != null) { newContact.setLastName(lastName); 
			}//end if
		
			//If Phone number is *not* null, it is updated.
			if (phone != null) { newContact.setPhoneNumber(phone); 
			}//end if
			
			//If Address is *not* null, it is updated.
			if (address != null) { newContact.setAddress(address); 
			}//end if
		}//end if
	}//end method
}//end class