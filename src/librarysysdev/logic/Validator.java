
package librarysysdev.logic;


public interface Validator<T> {
  
  //method signatures
  // validate later
  
  boolean validate(T input);
  String getErrorMessage();
  // implement later
}
