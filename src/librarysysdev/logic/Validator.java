
package librarysysdev.logic;


public interface Validator<T> {

//signature methods
 boolean validate(T input);
 String getErrorMessage();
 
}