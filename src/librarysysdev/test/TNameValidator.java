package librarysysdev.test;

import librarysysdev.logic.validation.NameValidator;

public class TNameValidator {
  public boolean isNameValid(String firstName) {
    NameValidator nameTest = new NameValidator();
    System.out.println(nameTest.validate(firstName));
    System.out.println(firstName);
    return nameTest.validate(firstName);
  }
}