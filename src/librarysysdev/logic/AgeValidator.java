package librarysysdev.logic;

public class AgeValidator implements Validator<Integer> {
  
  @Override
  public boolean validate(Integer input) {
    if(input > 12 && input < 62) {
      return true;
    }
    else {
      return false;
    }
  }
  
  @Override
  public String getErrorMessage() {
    return "Invalid age. Age must be greater than 12 and less than 62";
  }
}