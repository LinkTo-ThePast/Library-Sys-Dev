package librarysysdev.logic;

public class NameValidator implements Validator<String> {
  private final String NAME_PATTERN = "[a-zA-Z]+( +[a-zA-Z]+)*";
  
  @Override
  public boolean validate(String name) {
    if(name.matches(NAME_PATTERN)){
      return true;
    } else return false;
  }
  
 
}