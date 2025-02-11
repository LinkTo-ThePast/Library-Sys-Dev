package librarysysdev.logic;

import librarysysdev.logic.validation.AgeValidator;
import librarysysdev.logic.validation.EmailValidator;
import librarysysdev.logic.validation.NameValidator;
import librarysysdev.logic.validation.PhoneNumberValidator;
import librarysysdev.logic.validation.ValidationPipeline;


public class Controller {

 public boolean validateUser(String firstName, String lastName, int age, String email, String phoneNumber) {
   
   //Initialize validation pipelines
   
   //for name
   ValidationPipeline fnameValidationPipeline = new ValidationPipeline();
   // initialize interface NameValidator and passes to Pipeline
   fnameValidationPipeline.addValidator(new NameValidator());
   // process auth
   if(!fnameValidationPipeline.validationProcess(firstName)) {
     return false;
   }
   
   ValidationPipeline lnameValidationPipeline = new ValidationPipeline();
   // initialize interface NameValidator and passes to Pipeline
   lnameValidationPipeline.addValidator(new NameValidator());
   // process auth
   if(!lnameValidationPipeline.validationProcess(lastName)) {
     return false;
   }
   
   // for email validation
   EmailValidator emailValidator = new EmailValidator();
   if (!emailValidator.validate(email)) {
     System.out.print(emailValidator.errorMessage());
     return false;
   }
   
   // for phone number validation
   PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
   if (!phoneNumberValidator.validatePhoneNumber(phoneNumber)) {
     System.out.print(phoneNumberValidator.errorMessage());
     return false;
   }
   
   return true;
 }
}