
package librarysysdev.logic;


public interface Validator<T> {
  boolean validate(T input);
  String getErrorMessage();
  // implement later
}
