package librarysysdev.logic;

import librarysysdev.GUI.registerNewMember.RegisterNewMember;

public class Controller {

  public boolean validateUser(String firstName, String lastName, int age, String email, int phoneNumber) {
    ValidationPipeline<String> namePipeline = new ValidationPipeline<>();
    namePipeline.addValidator(new NameValidator());
  }
  
  public boolean validateName(String inputUserFirstName, String inputUserLastName) {
    String regexString = "[a-zA-Z]+( +[a-zA-Z]+)*";
    boolean result = false;
    if(inputUserFirstName.matches(regexString) && inputUserLastName.matches(regexString)) {
      result = true;
    } else {
      result = false;
    }
    return result;
}
  

  public boolean validateAge(int inputUserAge) {
    boolean result = false;
    if(inputUserAge < 12 || inputUserAge > 70) {
      result = false;
    } else {
      result = true;
    }
    return result;
  }
  
}