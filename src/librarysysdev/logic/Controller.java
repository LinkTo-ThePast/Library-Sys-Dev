package librarysysdev.logic;

import java.util.HashMap;
import java.util.Map;
import librarysysdev.logic.validation.AgeValidator;
import librarysysdev.logic.validation.EmailValidator;
import librarysysdev.logic.validation.NameValidator;
import librarysysdev.logic.validation.PhoneNumberValidator;






public class Controller {

 public boolean validateUser(String firstName, String lastName, int age, String email, String phoneNumber) {
   
   
//general variable to indicate if validation process went good. 
  boolean isValid = false;
   
   // general storage for error messages
  Map<String, String> errorList = new HashMap<>(); 
  errorList.clear();
   
  // validation regarding names
  NameValidator nameValidator = new NameValidator();
  
  if(nameValidator.validate(firstName) && nameValidator.validate(lastName)) {
    isValid = true;

  } else {
    errorList.put("First name", nameValidator.errorMessage());
    errorList.put("Last name", nameValidator.errorMessage());
  }   
  
  // validation regarding age
  AgeValidator ageValidator = new AgeValidator();
  
  if(ageValidator.validate(age)) {
    isValid = true;
    
  } else {
    errorList.put("Age", ageValidator.errorMessage());
  }
  
  // validation regarding email 
  EmailValidator emailValidator = new EmailValidator();
  
  if(emailValidator.validate(email)) {
    isValid = true;
    
  } else {
    errorList.put("Email", emailValidator.errorMessage());
  }
  
  // vallidation regarding phone number
  PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
  
  if(phoneNumberValidator.validatePhoneNumber(phoneNumber)) {
    isValid = true;
    
  } else {
    errorList.put("Phone number", phoneNumberValidator.errorMessage());
  }
  
  if(errorList.isEmpty()) {
    isValid = true;
  } else {
    isValid = false;
  }
  
  return isValid;
 }
 
 public Map<String,String> errorList(String firstName, String lastName, int age, String email, String phoneNumber) {

   boolean isValid = false;
   
   // general storage for error messages
  Map<String, String> errorList = new HashMap<>(); 
  errorList.clear();
   
  // validation regarding names
  NameValidator nameValidator = new NameValidator();
  
  if(nameValidator.validate(firstName) && nameValidator.validate(lastName)) {
    isValid = true;

  } else {
    errorList.put("First name", nameValidator.errorMessage());
    errorList.put("Last name", nameValidator.errorMessage());
  }   
  
  // validation regarding age
  AgeValidator ageValidator = new AgeValidator();
  
  if(ageValidator.validate(age)) {
    isValid = true;
    
  } else {
    errorList.put("Age", ageValidator.errorMessage());
  }
  
  // validation regarding email 
  EmailValidator emailValidator = new EmailValidator();
  
  if(emailValidator.validate(email)) {
    isValid = true;
    
  } else {
    errorList.put("Email", emailValidator.errorMessage());
  }
  
  // vallidation regarding phone number
  PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
  
  if(phoneNumberValidator.validatePhoneNumber(phoneNumber)) {
    isValid = true;
    
  } else {
    errorList.put("Phone number", phoneNumberValidator.errorMessage());
  }
  
  if(errorList.isEmpty()) {
    isValid = true;
  } else {
    
    isValid = false;
  }
  return errorList;
}
 
 public Membership createNewMembershipObject() {
 
   Membership newMember = new Membership();
   
   
   try (this.validateUser(getTheActualDataThatWasVlidatedInTheGUI))
   {
     newMember.setFirstName(firstNameFromGui);
     newMember.setLastName(lastNameFromGui);
     newMember.setAge(ageFromGui);
     newMember.setFirstName(emailFromGui);
     newMember.setMembershipType(membershipFromGUI);
     newMember.setPhoneNumber(phoneNumberFromGUI);
     return nemMember;
   } catch {
     System.out.println("Error trying to generate a new member!")
   }
   
 }
 
  public ConnectDBController newDBConnection = new ConnectDBController();
 
  public sendNewMember (newMember) {
 
  newDBConnection("INSERT INTO Membership VALUES (newMember)");
 
  }
 

}