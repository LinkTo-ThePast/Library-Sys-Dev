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
  // clear messages
  
  public boolean validationProcess(T input) {
  
    // clear messages
    errorMessages.clear();
    
    // collect all the values
    boolean confirmation = true;
    
    for(IValidator<T> validator : validators) {
      if(!validator.validate(input))
        // validator(name) => true, validator(email) => true, validator(phone) => false 
        errorMessages.add(validator.errorMessage());
        confirmation = false; 
    }
    
    return confirmation;
  }
  
  public List<String> showErrorMessages() {
    return errorMessages;
  }
  
}