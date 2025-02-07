package librarysysdev.logic;

public class AgeValidator implements Validator<Integer> {
  
  public boolean validate(Integer input) {
    if(input >= 12 && input <= 72) {
    return true
    }
  }
}