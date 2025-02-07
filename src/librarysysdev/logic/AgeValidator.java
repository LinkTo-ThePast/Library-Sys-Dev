package librarysysdev.logic;

public class AgeValidator implements Validator<Integer> {
  
  public boolean validate(Integer age) {
    return age >= 12 && age <= 72;
  }
}