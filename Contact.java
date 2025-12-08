/**********Code Information**********
* Name: Michael King
* Date: December 7, 2025
* File: Contact.java
* Course: CS-320 
* Assignment: Project One
* University: SNHU
************************************/

package Contact;

/***Class Contact***/
public class Contact {
 
	/***Fields***/
	
	// Unique Contact ID
	// Final String ensures that Contact ID cannot be updated
	private final String contactID;
  	
	// Fields that can be updated
	private String firstName;
  	private String lastName;
  	private String phone;
  	private String address;

  	/***Constructor***
  	* Initializes the Contact Object */
  	
  	public Contact(String contactID, 
  			String firstName, 
  			String lastName, 
  			String phone, 
  			String address) {
  		
  		if (contactID == null || contactID.length() > 10) {
  			//Displays message if contact ID is null or greater than 10 characters.
  			throw new IllegalArgumentException("Error: This contact is"
  					+ "null/longer than 10 characters.");
  		}//end if
  		
  		//Refers Contact ID Variable in Contact Object
  		this.contactID = contactID;
  		
  		//Assigns First Name from the Setter Method to the Contact Object 
  		this.setFirstName(firstName);
  		
  		//Assigns Last Name from the Setter Method to the Contact Object 
  		this.setLastName(lastName);
  		
  		//Assigns Phone Number from the Setter Method to the Contact Object 
  		this.setPhoneNumber(phone);
  		
  		//Assigns the Address from the Setter Method to the Contact Object 
  		this.setAddress(address);
  	}//end constructor
  	
  	/***Getters***
  	* Retrieve the Values of the Contact. */
  	
  	//Getter for Contact ID
  	public String getID() { return contactID; }
  	//end getter

  	//Getter for First Name
  	public String getFirstName() { return firstName; }
  	//end getter

  	//Getter for Last Name
  	public String getLastName() { return lastName; }
  	//end getter
  
  	//Getter for Phone Number
  	public String getPhoneNumber() { return phone; }
  	//end getter
  
  	//Getter for Address
  	public String getAddress() { return address; }
  	//end getter
  	
  	/***Setters***
  	* Update the values of the Contact.
  	* There is no setter for contact ID as it is unique. */
  	
  	// Setter for First Name
  	public void setFirstName(String firstName) {
  		if (firstName == null || firstName.length() > 10) {
  			//Displays message if first name is null or greater than 10 characters.
  			throw new IllegalArgumentException("Error: This first name is "
  					+ "null/longer than 10 characters. Please enter a valid first name.");
  		} this.firstName = firstName; //Refers First Name variable
	}//end setter
  
  	// Setter for Last Name
  	public void setLastName(String lastName) {
  		if (lastName == null || lastName.length() > 10) {
  			//Displays message if last name is null or greater than 10 characters.
  			throw new IllegalArgumentException("Error: This first name is "
  					+ "null/longer than 10 characters. Please enter a valid last name.");
  		} this.lastName = lastName; //Refers Last Name variable
  	}//end setter
  	
  	// Setter for Phone Number
  	public void setPhoneNumber(String phone) {
  		if (phone == null || phone.length() != 10) { 
  			//Displays message if phone number is null or not equal to 10 digits.
  			throw new IllegalArgumentException("Error: This phone number is "
  					+ "null/less than or more than 10 digits. Please enter a valid "
  					+ "phone number that is exactly 10 digits.");
  		} this.phone = phone; //Refers Phone variable
  	}//end setter
  	
  	// Setter for Address
  	public void setAddress(String address) {
  		if (address == null || address.length() > 30) {
  			//Displays message if address is null or longer than 30 characters.
  			throw new IllegalArgumentException("Error: This address is "
  					+ "null/longer than 30 characters. Please enter a valid address.");
  		} this.address = address; //Refers Address variable
  	}//end setter
}//end class