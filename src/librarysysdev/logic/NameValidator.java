package librarysysdev.logic;

public class NameValidator implements Validator<String> {
    private static final String NAME_PATTERN = "[a-zA-Z]+( +[a-zA-Z]+)*";
  
  @Override
  public boolean validate(String name) {
    return name.matches(NAME_PATTERN);
  }
  
  @Override
  public String getErrorMessage() {
    return "Invalid format name. Only letters and spaces are valid.";
  }
}