/**********Code Information**********
* Name: Michael King
* Date: December 7, 2025
* File: ContactServiceTest.java
* Course: CS-320 
* Assignment: Project One
* University: SNHU
************************************/
package Tests;

/***Java and JUnit Imports***/
import org.junit.jupiter.api.*;
import Contact.Contact;
import Contact.ContactService;

/***Class to Create, Update and Delete a Contact***/
public class ContactServiceTest {

	//Declares New Contact Service
	private ContactService newContactService = new ContactService();
	
	/***Test to See if Adding a Contact is Successful***/
	@Test
	public void testNewContactCreation() {
		//Creates contact values (Contact ID, First and Last Name, etc.)
		String contactID = "1111122222"; //valid contact ID with 10 characters
      	String firstName = "Nelson"; //valid first name
        String lastName = "Holmes"; //valid last name
        String phone = "1234567890"; //valid phone number
        String address = "1234 Riverside Drive"; //valid address
	
        //Creates new contact
        Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);

        //Adds new contact
      	newContactService.addContact(testNewContact); 
        
      	//Ensures that New Service is not null
		Assertions.assertNotNull(newContactService);
	}//end test
	
	/***Test to See if Adding a Contact Fails***/
	@Test
	public void testFailureToCreateContact() {
		//Creates contact values (Contact ID, First and Last Name, etc.)
		String contactID = "1111122222"; //valid contact ID with 10 characters
	    String firstName = "Nelson"; //valid first name
	    String lastName = "Holmes"; //valid last name
	    String phone = "1234567890"; //valid phone number
	    String address = "1234 Riverside Drive"; //valid address
		
	    //Creates new contact
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);
	    
	    //Adds new contact
	  	newContactService.addContact(testNewContact); 
		
	    //Tests failure to add the same contact
	    Assertions.assertThrows(IllegalArgumentException.class, () ->
			newContactService.addContact(testNewContact));
	}//end test
	
	/***Test to See if Contact can be Deleted***/
	@Test
	public void testDeleteContact() {
		//Creates contact values (Contact ID, First and Last Name, etc.)
		String contactID = "1234567890"; //valid contact ID with 10 characters
	    String firstName = "Nelson"; //valid first name
	    String lastName = "Holmes"; //valid last name
	    String phone = "1234567890"; //valid phone number
	    String address = "1234 Riverside Drive"; //valid address
		
	    //Creates new contact
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);
		
		//Adds new contact
		newContactService.addContact(testNewContact); 
		
		//Deletes contact by ID
	    newContactService.deleteContact(contactID);
		
	    //Tests failure to delete a contact that is already deleted
	    Assertions.assertThrows(IllegalArgumentException.class, () -> 
			newContactService.deleteContact(contactID));
	}//end test
	
	/***Test to See if Contact can be Updated***/
	@Test
	public void testUpdateContact() {
		//Creates contact values (Contact ID, First and Last Name, etc.)
		String contactID = "12345"; //valid contact ID
		String firstName = "Nelson"; //valid first name
		String lastName = "Holmes"; //valid last name
		String phone = "1234567890"; //valid phone number
		String address = "1234 Riverside Drive"; //valid address
		
		//Creates new contact
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);
		
		//Adds new contact
		newContactService.addContact(testNewContact); 
		
		//Updates contact values, except for Contact ID
		newContactService.updateContact(
				"12345", //Contact ID stays the same since it is unique
				"Arthur", //Updated First Name
				"Manning", //Updated Last Name
				"1234123456", //Updated Phone Number
				"123 Evergreen Street"); //Updated Address
		
		//Implements AssertEquals to verify that both First Name strings are equal
		Assertions.assertEquals("Arthur", testNewContact.getFirstName());
		
		//Implements AssertEquals to verify that both Last Name strings are equal
		Assertions.assertEquals("Manning", testNewContact.getLastName());
		
		//Implements AssertEquals to verify that both Phone Number strings are equal
		Assertions.assertEquals("1234123456", testNewContact.getPhoneNumber());
		
		//Implements AssertEquals to verify that both Address strings are equal
		Assertions.assertEquals("123 Evergreen Street", testNewContact.getAddress());
	}//end test
}//end class
