package librarysysdev.logic.validation;

public class NameValidator implements IValidator<String> {
  
  private static final String NAME_PATTERN = "^[\\p{L} .'-]+$";
  
  @Override
  public boolean validate(String name) {
    return name.matches(NAME_PATTERN);
  }
  
  @Override
  public String errorMessage() {
    return "Invalid format name. Please, only letters and spaces are allowed. Do not use special characters.";
  }
}