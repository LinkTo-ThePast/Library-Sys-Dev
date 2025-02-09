
package librarysysdev.logic.validation;


public interface IValidator<T> {
  boolean validate(T input);
  String errorMessage();
}




