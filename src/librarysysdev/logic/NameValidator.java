package librarysysdev.logic;

public class NameValidator implements Validator<String> {
  
  private static final String NAME_PATTERN = "[a-zA-Z]+( +[a-zA-Z]+)*";
  
  
  public boolean validate(String input) {
    return input.matches(NAME_PATTERN);
  }
  
  
  public String getErrorMessage() {
    return "Invalid name. Please, only letters and space are allowed.";
  }
}