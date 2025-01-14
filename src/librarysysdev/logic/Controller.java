package librarysysdev.logic;

import librarysysdev.GUI.registerNewMember.RegisterNewMember;

public class Controller {

 
  public boolean validateFirstName(String inputUserFirstName) {
    String regexString = "[a-zA-Z]+( +[a-zA-Z]+)*";
    boolean result = false;
    if(inputUserFirstName.matches(regexString)) {
      result = true;
    } else {
      result = false;
    }
    return result;
}
  
  public boolean validateLastName(String inputUserLastName) {
    String regexString = "[a-zA-Z]+( +[a-zA-Z]+)*";
    boolean result = false;
    if(inputUserLastName.matches(regexString)) {
      result = true;
    } else {
      result = false;
    }
    return result;
}
}