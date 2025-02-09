package librarysysdev.logic;

import java.util.ArrayList;
import java.util.List;

public class ValidationPipeline {
  private final List<Validator<T>> validators = new ArrayList<>();
  private final List<String> ErrorList = new ArrayList<>();
  
  public boolean validatePipeline(T input) {
    for(Validator<T> validator : validators) {
      if(!validator.validate(input)) {
        String currentError = validator.getErrorMessage();
        ErrorList.add(currentError);
        return false;
      } 
    }
  }
  
}