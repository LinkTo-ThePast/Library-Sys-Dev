
package librarysysdev.logic;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Membership {
  // attributes: ---> basic info for clients/readers
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int reader_id;
  
  // initiail / creation
  private String firstName;
  private String lastName;
  private int age;
  private String email;
  private String phoneNumber;
  private String membershipType;
  
  // post creation
  private int currentBorrowedBooks;
  
  @OneToMany(mappedBy = "borrowedBy", cascade = CascadeType.ALL)
  private List<Book> bookList = new ArrayList<>();
  // methods:


  // 2. encapsulation
  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < firstName.length(); i++) {
      char c = firstName.charAt(i);
      if (Character.isAlphabetic(c)) {
        sb.append(c);
      } else {
        System.out.println("Please, introduce a valid character!");
      }
    }
    this.firstName = sb.toString();
  }

  public void setLastName(String lastName) {
    // objective: verify only alphabetic characters as parameters
    // 1) iterate over each character of the string parameter -> analyze each character -> if is correct, keep it
    // 2) we need a structure that allows us to keep characters and when finish to iterate, then obtain the string;
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < lastName.length(); i++) {
      char c = lastName.charAt(i); // access to the character in a string with charAt method
      if(Character.isAlphabetic(c)) {
        sb.append(c);
      } else {
        System.out.println("Please, introduce a valid character!");
      }
    }
    this.lastName = sb.toString();
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setAge(int age) {
    if(age > 10) {
      this.age = age;
    }
  }

  public int getId() {
    return this.reader_id;
  }

  public void setId() {

  }
  public String getMembershipType() {
    return this.membershipType;
  }
  
  public List getBookList() {
    return this.bookList;
  }
  
 

  public void setMembershipType(String membershipType) {
    if(membershipType.equals("standard")) {
      this.membershipType = "standard";
    }
    else if(membershipType.equals("student")) {
      this.membershipType = "student";
    }
    else if(membershipType.equals("premium")) {
      this.membershipType = "premium";
    }
    else {
      System.out.println("Please, introduce a valid membership type!");
    }
  }

  // constructor
  public Membership() {
  }
  
  public Membership(String firstName, String lastName, int age,  String email, String phoneNumber, String membershipType) {
    firstName = this.firstName;
    lastName = this.lastName;
    age = this.age;
    email = this.email;
    phoneNumber = this.phoneNumber;
    membershipType = this.membershipType;
  }
}
