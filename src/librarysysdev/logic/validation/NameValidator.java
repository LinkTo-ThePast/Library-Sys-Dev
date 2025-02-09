package librarysysdev.logic.validation;

public class NameValidator implements IValidator<String> {
  
  private static final String NAME_PATTERN = "[a-zA-Z]+( +[a-zA-Z]+)*";
  
  @Override
  public boolean validate(String name) {
    return name.matches(NAME_PATTERN);
  }
  
  @Override
  public String errorMessage() {
    return "Invalid format name. Please, only letters are allowed.";
  }
}