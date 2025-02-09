package librarysysdev.logic;

import java.util.ArrayList;
import java.util.List;

public class ValidationPipeline {
  private final List<Validator<T>> validators = new ArrayList<>();
  private final List<String> ErrorList = new ArrayList<>();
  
  public boolean validatePipeline(Validator<T> validator) {
    for(Validator<T> validator : validators) {
      if(validator.validate(this))
    }
  }
  
}