package patryk.pretki.com.rentcar.RentalOffice;


import javax.persistence.*;

@Entity
@Table
public class BranchList { //lista oddziałów

  @Column
  private String street;
  @Column
  private String City;

  @Column
  @ManyToOne(targetEntity = Worker.class)
  private Worker worker;

  @Column
  private String availableCars;

  @Column
  @ManyToOne(targetEntity = Car.class)  //nie jestem tego pewien
  private Car car;
  @Id
  private String id;

  public BranchList() {

  }

  public BranchList(String street, String city, Worker worker, String availableCars, Car car, String id) {
    this.street = street;
    City = city;
    this.worker = worker;
    this.availableCars = availableCars;
    this.car = car;
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return City;
  }

  public void setCity(String city) {
    City = city;
  }

  public Worker getWorker() {
    return worker;
  }

  public void setWorker(Worker worker) {
    this.worker = worker;
  }

  public String getAvailableCars() {
    return availableCars;
  }

  public void setAvailableCars(String availableCars) {
    this.availableCars = availableCars;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "BranchList{" +
      "street='" + street + '\'' +
      ", City='" + City + '\'' +
      ", worker=" + worker +
      ", availableCars='" + availableCars + '\'' +
      ", car=" + car +
      ", id='" + id + '\'' +
      '}';
  }
}
