package patryk.pretki.com.rentcar.RentalOffice;


import javax.persistence.*;

@Entity
@Table
public class Branch { // Firma
  // nazwa firmy
  // domena internetowa
  // adres kontaktowy
  // właściciel
  // logotyp
  // lista oddziałów

  @Column
  private String RentCars;

  @Column
  private String Street;

  @Column
  private String City;

  @Column
  private String ZipCode;

  @Column
  private String Owner;

  @Column
  @Id
  private String id;

  @Column
  @ManyToOne(targetEntity = BranchList.class)
  private BranchList branchList;

  public Branch(String rentCars, String id) {
    RentCars = rentCars;
    this.id = id;
  }

  public Branch() {

  }

  public Branch(String rentCars, String street, String city, String zipCode, String owner, String id, BranchList branchList) {
    RentCars = rentCars;
    Street = street;
    City = city;
    ZipCode = zipCode;
    Owner = owner;
    this.id = id;
    this.branchList = branchList;
  }

  public String getRentCars() {
    return RentCars;
  }

  public void setRentCars(String rentCars) {
    RentCars = rentCars;
  }

  public String getStreet() {
    return Street;
  }

  public void setStreet(String street) {
    Street = street;
  }

  public String getCity() {
    return City;
  }

  public void setCity(String city) {
    City = city;
  }

  public String getZipCode() {
    return ZipCode;
  }

  public void setZipCode(String zipCode) {
    ZipCode = zipCode;
  }

  public String getOwner() {
    return Owner;
  }

  public void setOwner(String owner) {
    Owner = owner;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BranchList getBranchList() {
    return branchList;
  }

  public void setBranchList(BranchList branchList) {
    this.branchList = branchList;
  }

  @Override
  public String toString() {
    return "Branch{" +
      "RentCars='" + RentCars + '\'' +
      ", Street='" + Street + '\'' +
      ", City='" + City + '\'' +
      ", ZipCode='" + ZipCode + '\'' +
      ", Owner='" + Owner + '\'' +
      ", id='" + id + '\'' +
      ", branchList=" + branchList +
      '}';
  }
}
