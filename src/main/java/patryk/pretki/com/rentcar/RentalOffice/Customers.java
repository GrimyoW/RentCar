package patryk.pretki.com.rentcar.RentalOffice;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customers { //klienci

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String email;

  @Column
  private String adres;
  @Id
  private String id;

  public Customers(String firstName, String lastName, String email, String adres) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.adres = adres;
  }

  public Customers() {

  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAdres() {
    return adres;
  }

  public void setAdres(String adres) {
    this.adres = adres;
  }

  @Override
  public String toString() {
    return "Customers{" +
      "firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", email='" + email + '\'' +
      ", adres='" + adres + '\'' +
      '}';
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
}
