package librarysysdev.logic.validation;

public class AgeValidator implements IValidator<Integer> {

  @Override
  public boolean validate(Integer age) {
    return age >= 10 && age <= 70;
  }
  
  @Override
  public String errorMessage() {
    return "Invalid format name. Only letters are allowed!";
  }

}