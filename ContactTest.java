/**********Code Information**********
* Name: Michael King
* Date: December 7, 2025
* File: ContactTest.java
* Course: CS-320 
* Assignment: Project One
* University: SNHU
************************************/

package Tests;

/***Java and JUnit Imports***/
import org.junit.jupiter.api.*;
import Contact.Contact;

/***Class for Testing Valid and Invalid Contacts***/
public class ContactTest {
	
	//Declares Contact Values
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	/***Creates the Contact Values Before Testing***/
	@BeforeEach
	void setUpUniqueContact () {
		//Creates Contact Values (Contact ID, First Name, Last Name, etc.)
		contactID = "1111122222"; //valid contact ID with 10 characters
	    firstName = "Nelson"; //valid first name
	    lastName = "Holmes"; //valid last name
	    phone = "1234567890"; //valid phone number
	    address = "1234 Riverside Drive"; //valid address
	}//end method
	
	/***Validate the Contact Values***/
	class myContact{
		void validateValue (int value) {
			if (value < 0) { //displays message if value is less than 0
				throw new IllegalArgumentException("Negative Value");
			}//end if
		}//end method
	}//end class
	
	/***Test Valid Contact ID***/
	@Test
	public void testValidContactID(){
		//Ensures that contact is *not* null and displays message
		Assertions.assertNotNull(contactID, "This contact is not null.");
	}//end test
	
	/***Test Contact ID with a Null Value***/
	@Test
	public void testNullContactID() {
		//Sets Contact ID to null and displays error message
		String contactID = null;
		Assertions.assertNull(contactID, "Error: This Contact ID is null.");
	}//end test
		
		
	/***Test Invalid Contact ID***/
	@Test
	public void testInvalidContactID(){
		//Creates new Contact using Values (ID, date, description)
		myContact exceptionContact = new myContact();

		//Uses AssertThrows to throw Invalid Contact ID exception
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			exceptionContact.validateValue(-1);
		}, "Error: This contact ID is invalid."); //Displays error message
	}//end test
		
	/***Test Invalid First Name Length***/
	@Test
	public void testInvalidFirstName(){
	    //Creates new contact using the above values
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);
	  	     
	    //Creates Invalid First Name with more than 10 characters
	    String invalidFirstName = "TooLongFirstName";
	    
	    //Throws an exception using AssertThrows
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Sets Invalid First Name with more than 10 characters
			testNewContact.setFirstName(invalidFirstName);
			//Displays error message
		}, "Error: This first name is longer than 10 characters, thus it is invalid.");
	}//end test
	
	/***Test First Name with a Null Value***/
	@Test
	public void testNullFirstName() {
		//Creates new contact using the above values
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);

	    //Throws an exception using AssertThrows
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Sets First Name to null
			testNewContact.setFirstName(null);
			//Displays error message
		}, "Error: This first name is null.");
	}//end test	
		
	/***Test Invalid Last Name Length***/
	@Test
	public void testInvalidLastName(){	
	    //Creates new contact using the above values
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);
	       
	    //Creates Invalid Last Name with more than 10 characters
	    String invalidLastName = "TooLongLastName";
	    
	    //Throws an exception using AssertThrows
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Sets Invalid Last Name with more than 10 characters
			testNewContact.setLastName(invalidLastName);
			//Displays error message
		}, "Error: This last name is longer than 10 characters, thus it is invalid.");
	}//end test
	
	/***Test Last Name with a Null Value***/
	@Test
	public void testNullLastName() {
		//Creates new contact using the above values
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);

	    //Throws an exception using AssertThrows
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Sets Last Name to null
			testNewContact.setLastName(null);
			//Displays error message
		}, "Error: This last name is null.");
	}//end test	
		
	/***Test Invalid Phone Number Length***/
	@Test
	public void testInvalidPhoneNumber(){	
	    //Creates new contact using the above values
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);
	        
	    //Creates Invalid Phone Number with more than 10 digits
	    String invalidPhone = "12345678901234567";
	    
	    //Throws an exception using AssertThrows
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Sets Invalid Phone Number with more than 10 digits
			testNewContact.setPhoneNumber(invalidPhone); 
			//Displays error message
		}, "Error: This phone number does not have exactly 10 digits, thus it is invalid.");
	}//end test
		
	/***Test Phone Number with a Null Value***/
	@Test
	public void testNullPhoneNumber() {
		//Creates new contact using the above values
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);

	    //Throws an exception using AssertThrows
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Sets Phone Number to null
			testNewContact.setPhoneNumber(null);
			//Displays error message
		}, "Error: This phone number is null.");
	}//end test	
	
	/***Test Invalid Address Length***/
	@Test
	public void testInvalidAddress(){
	    //Creates new contact using the above values
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);
	        
	    //Creates Invalid Address Value with more than 30 characters (31 characters)
	    String invalidAddress = "1234567890123456789012345678901";
	    
	    //Throws an exception using AssertThrows
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Sets Invalid Address with more than 30 characters
			testNewContact.setAddress(invalidAddress);
			//Displays error message
		}, "Error: This address is longer than 30 characters, thus it is invalid.");
	}//end test
	
	/***Test Address with a Null Value***/
	@Test
	public void testNullAddress() {
		//Creates new contact using the above values
	    Contact testNewContact = new Contact(contactID, firstName, lastName, phone, address);

	    //Throws an exception using AssertThrows
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Sets Address to null 
			testNewContact.setAddress(null);
			//Displays error message
		}, "Error: This address is null.");
	}//end test	
}//end class