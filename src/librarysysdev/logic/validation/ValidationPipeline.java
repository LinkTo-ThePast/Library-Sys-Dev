package librarysysdev.logic.validation;

import java.util.ArrayList;
import java.util.List;

public class ValidationPipeline<T> {

  private List<IValidator<T>> validators = new ArrayList<>();
  private List<String> errorMessages = new ArrayList<>();
  
  // initialize list of validators
  public void addValidator(IValidator<T> validator) {
    validators.add(validator);
  }
  
  public boolean validationProcess(T input) {
  
    errorMessages.clear();
    for(IValidator<T> validator : validators) {
      if(!validator.validate(input))
        // validator(name) => true, validator(email) => true, validator(phone) => false 
        errorMessages.add(validator.errorMessage());
        return false; 
    }
    
    return true;
  }
  
  public List<String> showErrorMessages() {
    return errorMessages;
  }
  
}