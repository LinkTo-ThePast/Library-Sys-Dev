package librarysysdev.logic.validation;

import java.util.ArrayList;
import java.util.List;

public class ValidationPipeline {

  private List<IValidator<?>> validators = new ArrayList<>();
  private List<String> errorMessages = new ArrayList<>();
  
  // initialize list of validators
  public <T> void addValidator(IValidator<T> validator) {
    validators.add(validator);
  }
  // clear messages
  
  public boolean validationProcess(Object input) {
  
    // clear messages
    errorMessages.clear();
    
    // collect all the values
    boolean confirmation = true;
    
    for(IValidator<?> validator : validators) {
      IValidator<Object> castedValidator = (IValidator<Object>) validator;
      if(!castedValidator.validate(input))
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