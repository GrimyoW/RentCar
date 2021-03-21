package patryk.pretki.com.rentcar.entity;


import javax.persistence.*;

@Entity
@Table
public class Customers { //klienci


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String email;

  @Column
  private String adres;

  public Customers() {

  }

  public Customers(long id, String firstName, String lastName, String email, String adres) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.adres = adres;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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
      "id=" + id +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", email='" + email + '\'' +
      ", adres='" + adres + '\'' +
      '}';
  }
}
