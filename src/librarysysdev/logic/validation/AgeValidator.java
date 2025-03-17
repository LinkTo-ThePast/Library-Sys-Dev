package librarysysdev.logic.validation;

public class AgeValidator implements IValidator<Integer> {

  @Override
  public boolean validate(Integer age) {
    return age >= 10 && age <= 70;
  }
  
  @Override
  public String errorMessage() {
    return "Dato de edad inválido. La edad de los usuarios debe estar entre los 10 y 70 años.";
  }

}