package librarysysdev.logic;

import librarysysdev.GUI.registerNewMember.RegisterNewMember;

public class Controller {

  // so this class is the bridge between persistance layer and our logic layer
  // deals with data validation and communication with persistance controller
  
  // 1. First, the input parameters that is going to receive: 
  // gui form to register a new user --> names, last names, age, email, etc
  // we need to validate that data before trying to send it to the persistance data
  
  // we are going to work with the "Membership" class, so we need to initialize
  public RegisterNewMember instanceOfRegistration = new RegisterNewMember();
  
  public String validatePersonalName() {
    String inputPersonalName = "Luis";
    return inputPersonalName;
}
}