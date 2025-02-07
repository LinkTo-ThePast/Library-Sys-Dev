
package librarysysdev.logic;


public interface Validator<T> {
  
  //method signatures
  
  boolean validate(T input);
  String getErrorMessage();
  // implement later
}
