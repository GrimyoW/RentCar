package patryk.pretki.com.rentcar.RentalOffice;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customers {

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String email;

  @Column(name = "adres")
  private String adres;

  public Customers(String firstName, String lastName, String email, String adres) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.adres = adres;
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
}
