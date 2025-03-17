package librarysysdev.logic.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

  private Pattern pattern;
  private Matcher matcher;
  
  private static final String PHONE_NUMBER_PATTERN = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
  
  public PhoneNumberValidator() {
  pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
  }
  
  public boolean validatePhoneNumber(String userPhoneNumber) {
    matcher = pattern.matcher(userPhoneNumber);
    return matcher.matches();
  }
  
  public String errorMessage() {
    return "Formato de número telefónico inválido. Por favor, aségure de solo usar 10 digitos.";
  }
}