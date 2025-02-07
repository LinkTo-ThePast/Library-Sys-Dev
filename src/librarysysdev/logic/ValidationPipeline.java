package librarysysdev.logic;

import java.util.ArrayList;
import java.util.List;

public class ValidationPipeline<T> {
  private final List<Validator<T>> validators = new ArrayList<>();
  private final List<String> errorMessages = new ArrayList<>();
  
  public void addValidator(Validator<T> validator) {
    validators.add(validator);
  }
  
  public boolean validateAll(T input) {
    errorMessages.clear();
    for(Validator<T> validator : validators) {
      if(validator.validate(input)) {
        errorMessages.add(validator.getErrorMessage());
        return false;
      } 
    }
    return true;
  }
  
  public List<String> errorMessages() {
    return errorMessages;
}
}