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
   ValidationPipeline<String> namePipelineValidate = new ValidationPipeline<>();
   namePipelineValidate.addValidator(new NameValidator());
   
   //for age
   ValidationPipeline<Integer> agePipelineValidate = new ValidationPipeline<>();
   agePipelineValidate.addValidator(new AgeValidator());
   
   if(!namePipelineValidate.validationProcess(firstName)) {
     System.out.println(namePipelineValidate.showErrorMessages().toString());
     return false;
   }
   
   if(!namePipelineValidate.validationProcess(lastName)) {
     System.out.println(namePipelineValidate.showErrorMessages().toString());
     return false;
   }
   
   if(!agePipelineValidate.validationProcess(age)) {
     System.out.println(agePipelineValidate.showErrorMessages().toString());
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