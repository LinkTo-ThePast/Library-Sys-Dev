package librarysysdev.logic.validation;

public class NameValidator implements IValidator<String> {
  
  private static final String NAME_PATTERN = "^[\\p{L} .'-]+$";
  
  @Override
  public boolean validate(String name) {
    return name.matches(NAME_PATTERN);
  }
  
  @Override
  public String errorMessage() {
    return "Formato de nombre inválido. Por favor, sólo usar letras y espacios.";
  }
}