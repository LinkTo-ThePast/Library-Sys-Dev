package librarysysdev.logic;



import librarysysdev.logic.validation.AgeValidator;
import librarysysdev.logic.validation.EmailValidator;
import librarysysdev.logic.validation.NameValidator;
import librarysysdev.logic.validation.PhoneNumberValidator;
import librarysysdev.logic.validation.ValidationPipeline;



public class Controller {

 public boolean validateUser(String firstName) {
   
  boolean finalTest = true;
//  , String lastName, int age, String email, String phoneNumber
   
   //for name
   ValidationPipeline firstnameValidationPipeline = new ValidationPipeline();
   // initialize interface NameValidator and passes to Pipeline
   firstnameValidationPipeline.addValidator(new NameValidator());
   // process auth
   if(!firstnameValidationPipeline.validationProcess(firstName)) {
     System.out.println(firstnameValidationPipeline.validationProcess(firstName));
     System.out.println(firstName);
     System.out.println(firstnameValidationPipeline.showErrorMessages().isEmpty());
     finalTest = false;
   }
   
//   ValidationPipeline lastnameValidationPipeline = new ValidationPipeline();
//   // initialize interface NameValidator and passes to Pipeline
//   lastnameValidationPipeline.addValidator(new NameValidator());
//   // process auth
//   if(!lastnameValidationPipeline.validationProcess(lastName)) {
//     
//     finalTest = false;
//   }
//   
//   // for age 
//   ValidationPipeline ageValidationPipeline = new ValidationPipeline();
//   ageValidationPipeline.addValidator(new AgeValidator());
//   if(!ageValidationPipeline.validationProcess(age)) {
//     finalTest = false;
//   }
//   
//   // for email validation
//   EmailValidator emailValidator = new EmailValidator();
//   if (!emailValidator.validate(email)) {
//     
//     finalTest = false;
//   }
//   
//   // for phone number validation
//   PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
//   if (!phoneNumberValidator.validatePhoneNumber(phoneNumber)) {
//     finalTest = false;
//   }
//   
 
   
   System.out.println(Boolean.toString(finalTest));
   return finalTest;
   
 }
}