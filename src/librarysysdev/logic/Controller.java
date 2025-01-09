package librarysysdev.logic;

import librarysysdev.GUI.registerNewMember.RegisterNewMember;

public class Controller {

 
  public boolean validateFullName(String[] inputUserFullName) {
    String regexString = "[a-zA-Z]+( +[a-zA-Z]+)*";
    boolean result = false;
    for(int i = 0; i < inputUserFullName.length; i ++) {
      if(inputUserFullName[i].matches(regexString)) {
        result = true;
      } else {
        result = false;
      }
    }
    return result;
}
}