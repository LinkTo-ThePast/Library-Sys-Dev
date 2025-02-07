package librarysysdev.logic;

public class AgeValidator implements Validator<Integer> {
  
  @Override
  public boolean validate(Integer age) {
 
    return age >= 12 && age <= 72;
  }
  
  public String getErrorMessage() {
    return "Invalid age. Age must be between 12 and 72.";
  }
}