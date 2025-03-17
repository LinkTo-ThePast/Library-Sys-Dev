package librarysysdev.logic.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
  
  private Pattern pattern;
  private Matcher matcher;
  
  private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
  
  // at compile time, process pattern;
  public EmailValidator() {
    pattern = Pattern.compile(EMAIL_PATTERN);
  }
  
  public boolean validate(String email) {
    matcher = pattern.matcher(email);
    return matcher.matches();
  }
  
  public String errorMessage() {
    return "Formato de correo electrónico inválido: añadir dominio después del ´@´.";
  }
}

