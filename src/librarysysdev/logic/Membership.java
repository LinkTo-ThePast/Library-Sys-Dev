
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
    
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
   
    this.lastName = lastName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setAge(int age) {
   this.age = age;
  }

  public int getId() {
    return this.reader_id;
  }

  public void setId(int id) {
    this.reader_id = id;
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
